package com.vitkulov.console_war.model.unit.elf;

import com.vitkulov.console_war.model.unit.Warrior;
import com.vitkulov.console_war.model.weapon.Sword;

public class ElfWarrior extends Warrior {

    public ElfWarrior() {
        // Установим начальное оружие и силу урона
        setPrimary(new Sword(15)); // атаковать мечом : урон 15 ед.
    }
}
