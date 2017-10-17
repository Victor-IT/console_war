package com.vitkulov.console_war;

import com.vitkulov.console_war.model.Squad;
import com.vitkulov.console_war.model.Unit;
import com.vitkulov.console_war.model.squad_factory.*;

import static com.vitkulov.console_war.RunApp.LOGGER;

/**
 * Основной класс-сервер, где происходит ход игры и взаимодействие между объектами.
 */
public class Game {
    private Squad lightSquad;
    private Squad darkSquad;
    public static int turn = 1;

    public void createLightSquad() {
        if ((int) (Math.random() * 2) == 0) {
            this.lightSquad = createSquad(new ElfSquadFactory());
        } else {
            this.lightSquad = createSquad(new HumanSquadFactory());
        }
    }

    public void createDarkSquad() {
        if ((int) (Math.random() * 2) == 0) {
            this.darkSquad = createSquad(new OrcSquadFactory());
        } else {
            this.darkSquad = createSquad(new UndeadSquadFactory());

        }
    }

    public Squad createSquad(SquadFactory squadFactory) {
        Squad squad = squadFactory.createSquad(this, 1, 3, 4);
        if (squadFactory.getClass() == ElfSquadFactory.class || squadFactory.getClass() == HumanSquadFactory.class) {
            LOGGER.info("Создан светлый отряд {}\n", squad.getSquadName());
        } else {
            LOGGER.info("Создан тёмный отряд {}\n", squad.getSquadName());
        }

        for (Unit unit : squad.getNormalSquad()) {
            LOGGER.info(unit.toString());
        }
        LOGGER.info("\n");

        return squad;
    }

    /**
     * Получить противника из вражеского отряда
     *
     * @param unit - текущий юнит
     * @return enemy unit - противник из вражеского отряда
     */
    public Unit getEnemy(Unit unit) {
        Squad enemySquad;
        if (unit.getSquad() == lightSquad) {
            enemySquad = getDarkSquad();
        } else {
            enemySquad = getLightSquad();
        }
        Unit enemy = enemySquad.getRandomUnit();
        enemy.checkAndApplyBuff();
        return enemy;
    }

    public Unit getPrivilegedEnemy(Unit unit) {
        Squad enemySquad;
        if (unit.getSquad() == lightSquad) {
            enemySquad = getDarkSquad();
        } else {
            enemySquad = getLightSquad();
        }
        Unit enemy = enemySquad.getRandomPrivilegedUnit();
        enemy.checkAndApplyBuff();
        return enemy;
    }

    /**
     * Получить союзника из своего отряда
     *
     * @param unit текущий юнит
     * @return ally unit - союзник из текущего отряда
     */
    public Unit getAlly(Unit unit) {
        Squad allySquad;
        if (unit.getSquad() == lightSquad) {
            allySquad = getLightSquad();
        } else {
            allySquad = getDarkSquad();
        }
        Unit ally = allySquad.getRandomUnitExcept(unit);
        ally.checkAndApplyBuff();
        return ally;
    }

    /**
     * Нанести урон противнику
     *
     * @param enemy  - выбранный противник
     * @param damage - наносимый урон
     */
    public void hit(Unit enemy, double damage) {
        if (enemy.hit(damage) <= 0) {
            Squad squad = enemy.getSquad();
            squad.adToDeadList(enemy);
        }
    }

    public Squad getDarkSquad() {
        return darkSquad;
    }

    public Squad getLightSquad() {
        return lightSquad;
    }

    /**
     * Вывести имя отряда победителя
     *
     * @return
     */
    public boolean checkWin() {
        boolean gameOver = false;

        if (gameOver = lightSquad.isDefeated()) {
            LOGGER.info("Отряд {} уничтожен. Победил отряд {}\n", lightSquad.getSquadName(), darkSquad.getSquadName());
            LOGGER.info("В живых осталось: \n");
            for (Unit unit : darkSquad.getPrivilegedSquad()) {
                LOGGER.info(unit.toString());
            }
            for (Unit unit : darkSquad.getNormalSquad()) {
                LOGGER.info(unit.toString());
            }
        } else if (gameOver = darkSquad.isDefeated()) {
            LOGGER.info("Отряд {} уничтожен. Победил отряд {}\n", darkSquad.getSquadName(), lightSquad.getSquadName());
            LOGGER.info("В живых осталось: \n");
            for (Unit unit : lightSquad.getPrivilegedSquad()) {
                LOGGER.info(unit.toString());
            }
            for (Unit unit : lightSquad.getNormalSquad()) {
                LOGGER.info(unit.toString());
            }
        }
        LOGGER.info("Конец игры...\n\n\n");
        return gameOver;
    }

    public void runGame() {
        boolean winner = false;
        int step;

        // выбрать очередность хода для стороны
        step = (int) (Math.random() * 2);

        do {
            // ход светлой стороны
            if (!winner && step == 0) {
                lightSquad.makeTurn();
                winner = darkSquad.isDefeated();
                step = 1;
            }
            // ход тёмной стороны
            if (!winner && step == 1) {
                darkSquad.makeTurn();
                winner = lightSquad.isDefeated();
                step = 0;
            }
        } while (!winner);

        checkWin();
    }
}
