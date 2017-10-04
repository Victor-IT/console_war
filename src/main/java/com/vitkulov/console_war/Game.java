package com.vitkulov.console_war;

import com.vitkulov.console_war.model.Squad;
import com.vitkulov.console_war.model.Unit;
import com.vitkulov.console_war.model.squad_factory.SquadFactory;

/**
 * Основной класс-сервер, где происходит ход игры и взаимодействие между объектами.
 */
public class Game {
    private Squad lightSquad;
    private Squad darkSquad;
    private SquadFactory squadFactory = new SquadFactory();
    public static int turn = 1;

    public Squad createLightSquad() {
        this.lightSquad = squadFactory.createLightSquad(this, 1, 0, 1);
        return lightSquad;
    }

    public Squad createDarkSquad() {
        this.darkSquad = squadFactory.createDarkSquad(this, 1, 0, 1);
        return darkSquad;
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
        return enemySquad.getRandomUnit();
    }

    public Unit getPrivilegedEnemy(Unit unit) {
        Squad enemySquad;
        if (unit.getSquad() == lightSquad) {
            enemySquad = getDarkSquad();
        } else {
            enemySquad = getLightSquad();
        }
        return enemySquad.getRandomPrivilegedUnit();
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
        return allySquad.getRandomUnitExcept(unit);
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
     * @return
     */
    public boolean checkWin() {
        boolean gameOver = false;

        if (gameOver = lightSquad.isDefeated()) {
            System.out.printf("\nОтряд %s уничтожен.\nПобедил отряд %s", lightSquad.getSquadName(), darkSquad.getSquadName());
        } else if (gameOver = darkSquad.isDefeated()) {
            System.out.printf("\nОтряд %s уничтожен.\nПобедил отряд %s", darkSquad.getSquadName(), lightSquad.getSquadName());
        }
        System.out.println("\nКонец игры...");
        return gameOver;
    }

    public void runGame() {
        boolean winner = false;

        // выбрать очередность хода для стороны
        // todo: создать жребий очередности хода

        // создаём цикл ходов
        do {
            // ход светлой стороны
            if (!winner) {
                lightSquad.makeTurn();
                winner = darkSquad.isDefeated();
            }
            // ход тёмной стороны
            if (!winner) {
                darkSquad.makeTurn();
                winner = lightSquad.isDefeated();
            }
        } while (!winner);

        checkWin();
    }
}
