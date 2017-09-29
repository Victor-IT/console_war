package com.vitkulov.console_war.model.unit.elf;

import com.vitkulov.console_war.model.unit.Archer;
import com.vitkulov.console_war.model.weapon.Bow;
import com.vitkulov.console_war.model.weapon.Fist;

public class ElfArcher extends Archer {

    public ElfArcher() {
        // Установим начальное оружие и силу урона
        setPrimaryWeapon(new Bow(7)); // стрелять из лука : урон 7 ед.
        setSecondaryWeapon(new Fist(3)); // атаковать противника : урон 3 ед.
    }
}
