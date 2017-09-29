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
    private int turns;
//    private final Validator validator = new Validator(new ConsoleIO(new Scanner(System.in), System.out));

    public Squad createLightSquad() {
        this.lightSquad = squadFactory.createLightSquad(this, 0, 3, 0); // todo: поправить фабрику с учётом рандома рас
        return lightSquad;
    }

    public Squad createDarkSquad() {
        this.darkSquad = squadFactory.createDarkSquad(this, 0, 3, 0);
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

    public boolean checkWin() {
        return lightSquad.check() || darkSquad.check();
    }

    public Squad getDarkSquad() {
        return darkSquad;
    }

    public Squad getLightSquad() {
        return lightSquad;
    }

    public void runGame() {

        // выбрать очередность хода для стороны
        // todo: создать жребий очередности хода
        // создаём цикл очередности ходов
        do {
            // ход светлой стороны
            System.out.println("Ход: " + ++turns);
            lightSquad.makeTurn();
            // ход тёмной стороны
            System.out.println("Ход: " + ++turns);
            darkSquad.makeTurn();
            // проверить на выигрыш
        } while (!checkWin()); //validator.compare("Do you want to continue?", "y"))

        System.out.println("Конец игры");
    }
}
