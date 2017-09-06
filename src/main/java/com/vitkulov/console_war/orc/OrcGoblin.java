package com.vitkulov.console_war.orc;

import com.vitkulov.console_war.Game;
import com.vitkulov.console_war.Squad;
import com.vitkulov.console_war.Warrior;

public class OrcGoblin extends Warrior {

    public OrcGoblin(Game game, Squad squad) {
        super(game, squad);
    }

    @Override
    public void doAction1() {
        // атака дубиной : урон 20HP
        System.out.println(this.getClass().getSimpleName() + "Действие 1");
    }
}
