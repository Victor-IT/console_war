package com.vitkulov.console_war.model.unit.undead;

import com.vitkulov.console_war.model.unit.Mage;

public class UndeadNecromancer extends Mage {

    @Override
    public void doAction1() {
        // уменьшение силы урона персонажа противника на 50% на один ход
        System.out.println(this.getClass().getSimpleName() + "Действие 1");
    }

    @Override
    public void doAction2() {
        // атака : урон 5 ед.
        System.out.println(this.getClass().getSimpleName() + "Действие 2");
    }
}
