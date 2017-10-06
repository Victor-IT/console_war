package com.vitkulov.console_war.model.unit.human;

import com.vitkulov.console_war.model.unit.Archer;
import com.vitkulov.console_war.model.weapon.Crossbow;
import com.vitkulov.console_war.model.weapon.Fist;

public class HumanCrossbowman extends Archer {

    public HumanCrossbowman() {
        // Установим начальное оружие и силу урона
        setPrimary(new Crossbow(5)); // стрелять из арбалета : урон 5 ед.
        setSecondary(new Fist(3)); // атаковать противника : урон 3 ед.
    }
}
