package com.vitkulov.console_war.model.unit.elf;

import com.vitkulov.console_war.model.unit.Mage;

public class ElfMage extends Mage {

    @Override
    public void doAction1() {
        // наложить улучшение на персонажа своего отряда
        System.out.println(this.getClass().getSimpleName() + "Действие 1");
    }

    @Override
    public void doAction2() {
        // атака магией : урон 10 ед.
        System.out.println(this.getClass().getSimpleName() + "Действие 2");
    }
}
