package com.vitkulov.console_war;

import com.vitkulov.console_war.model.Archer;
import com.vitkulov.console_war.model.Squad;
import com.vitkulov.console_war.model.Unit;
import com.vitkulov.console_war.model.human.HumanCrossbowman;
import com.vitkulov.console_war.model.orc.OrcArcher;
import com.vitkulov.console_war.model.weapon.Bow;
import com.vitkulov.console_war.model.weapon.Crossbow;
import com.vitkulov.console_war.model.weapon.Dagger;
import com.vitkulov.console_war.model.weapon.Fist;
import com.vitkulov.console_war.service.GameServiceImpl;

/**
 * Основной класс-сервер, где происходит ход игры и взаимодействие между объектами.
 */
public class Game {
    private Squad lightSquad;
    private Squad darkSquad;
    private GameServiceImpl service;

    private int turns;
//    private final Validator validator = new Validator(new ConsoleIO(new Scanner(System.in), System.out));


    public void setService(GameServiceImpl service) {
        this.service = service;
    }

    public Squad createLightSquad() {
        this.lightSquad = new Squad(); //todo: создать фабрику сквадов
        lightSquad.setSquadName("Light");
        Unit humanCrossbowman = new HumanCrossbowman(service, lightSquad);
        humanCrossbowman.setPrimaryWep(new Crossbow(5));
        humanCrossbowman.setSecondaryWep(new Fist(3));
        lightSquad.adToNormal(humanCrossbowman);
        return lightSquad;
    }

    public Squad createDarkSquad() {
        this.darkSquad = new Squad();
        darkSquad.setSquadName("Dark");
        Unit orcArcher = new OrcArcher(service, darkSquad);
        orcArcher.setPrimaryWep(new Bow(3));
        orcArcher.setSecondaryWep(new Dagger(2));

        darkSquad.adToNormal(orcArcher);
        return darkSquad;
    }

    public Unit getEnemy(Unit unit) {
        Squad enemySquad;
        if (unit.getSquad() == lightSquad) {
            enemySquad = getDarkSquad();
        } else {
            enemySquad = getLightSquad();
        }
        return enemySquad.getRandomUnit();
    }

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

        // создаём цикл очередности ходов
        do {
            // ход светлой стороны
            System.out.println(++turns);
            lightSquad.makeTurn();
            // ход тёмной стороны
            System.out.println(++turns);
            darkSquad.makeTurn();
            // проверить на выигрыш
        } while (!checkWin()); //validator.compare("Do you want to continue?", "y"))

        System.out.println("Конец игры");
    }
}
