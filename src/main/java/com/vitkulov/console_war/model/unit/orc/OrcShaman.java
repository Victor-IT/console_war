package com.vitkulov.console_war.model.unit.orc;

import com.vitkulov.console_war.model.unit.Mage;

public class OrcShaman extends Mage {

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
