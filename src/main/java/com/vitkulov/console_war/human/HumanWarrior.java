package com.vitkulov.console_war.human;

import com.vitkulov.console_war.Game;
import com.vitkulov.console_war.Squad;
import com.vitkulov.console_war.Warrior;

public class HumanWarrior extends Warrior {

    public HumanWarrior(Game game, Squad squad) {
        super(game, squad);
    }

    @Override
    public void doAction1() {
        // атака мечом : урон 3 HP
        System.out.println(this.getClass().getSimpleName() + "Действие 1");
    }
}
