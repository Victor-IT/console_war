package com.vitkulov.console_war.model.unit.elf;

import com.vitkulov.console_war.model.Unit;
import com.vitkulov.console_war.model.unit.Mage;
import com.vitkulov.console_war.model.weapon.MagicStaff;

public class ElfMage extends Mage {

    public ElfMage() {
        // Установим начальное оружие и силу урона
        setPrimaryWeapon(new MagicStaff(10)); // атаковать магией : урон 10 ед.
    }

    @Override
    public void doAction1() {
        // наложить улучшение на персонажа своего отряда
        Unit ally = game.getAlly(this);
        ally.getSquad().adToPrivileged(ally);
        System.out.printf("%s %s (%s)\n\n", this.getName(), "наложил улучшение на союзника ", ally.getName());
        this.getSquad().adToNormal(this);
    }
}
