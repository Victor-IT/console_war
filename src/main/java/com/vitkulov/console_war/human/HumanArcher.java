package com.vitkulov.console_war.human;

import com.vitkulov.console_war.Archer;
import com.vitkulov.console_war.Game;
import com.vitkulov.console_war.Squad;

public class HumanArcher extends Archer {

    public HumanArcher(Game game, Squad squad) {
        super(game, squad);
    }

    @Override
    public void doAction1() {
        // стрелять из лука : урон 7HP
        setWeaponMod(7.0); // todo: ввести классы оружия с необходимым уроном??
        super.doAction1();
    }

    @Override
    public void doAction2() {
        // атаковать противника : урон 3HP
        setWeaponMod(3.0);
        super.doAction2();
    }
}
