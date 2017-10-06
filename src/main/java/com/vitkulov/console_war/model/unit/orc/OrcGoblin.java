package com.vitkulov.console_war.model.unit.orc;

import com.vitkulov.console_war.model.unit.Warrior;
import com.vitkulov.console_war.model.weapon.Club;

public class OrcGoblin extends Warrior {

    public OrcGoblin() {
        // Установим начальное оружие и силу урона
        setPrimary(new Club(20)); // атаковать дубиной : урон 20 ед.
    }
}
