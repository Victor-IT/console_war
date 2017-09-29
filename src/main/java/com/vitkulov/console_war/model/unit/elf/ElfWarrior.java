package com.vitkulov.console_war.model.unit.elf;

import com.vitkulov.console_war.model.unit.Warrior;

public class ElfWarrior extends Warrior {

    @Override
    public void doAction1() {
        // атака мечом : урон 15 ед.
        System.out.println(this.getClass().getSimpleName() + "Действие 1");
    }
}
