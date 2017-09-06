package com.vitkulov.console_war.orc;

import com.vitkulov.console_war.Archer;
import com.vitkulov.console_war.Game;
import com.vitkulov.console_war.Squad;

public class OrcArcher extends Archer {

    public OrcArcher(Game game, Squad squad) {
        super(game, squad);
    }

    @Override
    public void doAction1() {
        // стрелять из лука : урон 3HP
        setWeaponMod(3.0);
        super.doAction1();
    }

    @Override
    public void doAction2() {
        // удар клинком : урон 2HP
        setWeaponMod(2.0);
        super.doAction2();
    }
}
