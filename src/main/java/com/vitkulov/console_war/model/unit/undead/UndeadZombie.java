package com.vitkulov.console_war.model.unit.undead;

import com.vitkulov.console_war.model.unit.Warrior;

public class UndeadZombie extends Warrior {

    @Override
    public void doAction1() {
        // удар копьем : урон 18 ед.
        System.out.println(this.getClass().getSimpleName() + "Действие 1");
    }
}
