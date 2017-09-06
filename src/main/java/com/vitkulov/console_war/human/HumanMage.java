package com.vitkulov.console_war.human;

import com.vitkulov.console_war.Game;
import com.vitkulov.console_war.Mage;
import com.vitkulov.console_war.Squad;

public class HumanMage extends Mage {

    public HumanMage(Game game, Squad squad) {
        super(game, squad);
    }

    @Override
    public void doAction1() {
        // наложить улучшение на персонажа своего отряда
        System.out.println(this.getClass().getSimpleName() + "Действие 1");
    }

    @Override
    public void doAction2() {
        // нанести урон персонажу противника магией : урон 10HP
        System.out.println(this.getClass().getSimpleName() + "Действие 2");
    }
}
