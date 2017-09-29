package com.vitkulov.console_war.model.unit.human;

import com.vitkulov.console_war.model.unit.Warrior;

public class HumanWarrior extends Warrior {

    @Override
    public void doAction1() {
        // атака мечом : урон 18 ед.
        System.out.println(this.getClass().getSimpleName() + "Действие 1");
    }
}
