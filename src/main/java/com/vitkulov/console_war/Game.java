package com.vitkulov.console_war;

import com.vitkulov.console_war.human.HumanArcher;
import com.vitkulov.console_war.orc.OrcArcher;

/**
 * Основной класс, где происходит взаимодействие между остальными объектами.
 */
public class Game {
    private Squad lightSquad;
    private Squad darkSquad;

    public Squad createLightSide() {
        this.lightSquad = new Squad();
//        lightSquad.adToNormal(new HumanMage());
        lightSquad.adToNormal(new HumanArcher(this, lightSquad));
//        lightSquad.adToNormal(new HumanArcher(this));
//        lightSquad.adToNormal(new HumanArcher(this));
//        lightSquad.adToNormal(new HumanWarrior());
//        lightSquad.adToNormal(new HumanWarrior());
//        lightSquad.adToNormal(new HumanWarrior());
//        lightSquad.adToNormal(new HumanWarrior());

        return lightSquad;
    }

    public Squad createDarkSide() {
        this.darkSquad = new Squad();
//        darkSquad.adToNormal(new OrcShaman());
        darkSquad.adToNormal(new OrcArcher(this, darkSquad));
//        darkSquad.adToNormal(new OrcArcher(this));
//        darkSquad.adToNormal(new OrcArcher(this));
//        darkSquad.adToNormal(new OrcGoblin());
//        darkSquad.adToNormal(new OrcGoblin());
//        darkSquad.adToNormal(new OrcGoblin());
//        darkSquad.adToNormal(new OrcGoblin());

        return darkSquad;
    }

    public Unit getEnemy(Squad enemySquad) {
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
}
