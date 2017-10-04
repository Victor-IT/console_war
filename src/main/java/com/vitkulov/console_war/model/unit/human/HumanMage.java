package com.vitkulov.console_war.model.unit.human;

import com.vitkulov.console_war.model.Unit;
import com.vitkulov.console_war.model.unit.Mage;
import com.vitkulov.console_war.model.weapon.MagicStaff;

public class HumanMage extends Mage {

    public HumanMage() {
        // Установим начальное оружие и силу урона
        setPrimaryWeapon(new MagicStaff(4)); // атаковать магией : урон 4 ед.
    }

    @Override
    public void doAction2() {
        // наложить улучшение на персонажа своего отряда
        Unit ally = game.getAlly(this);
        ally.getSquad().adToPrivileged(ally);
        System.out.printf("%s %s (%s)\n", this.getName(), "наложил улучшение на союзника", ally.getName());
        this.getSquad().adToNormal(this);
    }
}
