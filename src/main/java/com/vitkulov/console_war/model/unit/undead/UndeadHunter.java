package com.vitkulov.console_war.model.unit.undead;

import com.vitkulov.console_war.model.unit.Archer;
import com.vitkulov.console_war.model.weapon.Bow;
import com.vitkulov.console_war.model.weapon.Fist;

public class UndeadHunter extends Archer {

    public UndeadHunter() {
        // Установим начальное оружие и силу урона
        setPrimaryWeapon(new Bow(4)); // стрелять из лука : урон 4 ед.
        setSecondaryWeapon(new Fist(2)); // атаковать противника : урон 2 ед.
    }
}
