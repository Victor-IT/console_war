package com.vitkulov.console_war.orc;

import com.vitkulov.console_war.Game;
import com.vitkulov.console_war.Mage;
import com.vitkulov.console_war.Squad;

public class OrcShaman extends Mage {

    public OrcShaman(Game game, Squad squad) {
        super(game, squad);
    }

    @Override
    public void doAction1() {
        // наложить улучшение на персонажа своего отряда
        System.out.println(this.getClass().getSimpleName() + "Действие 1");
    }

    @Override
    public void doAction2() {
        // наложение проклятия (снятие улучшения с персонажа противника для следующего хода)
        System.out.println(this.getClass().getSimpleName() + "Действие 2");
    }
}
