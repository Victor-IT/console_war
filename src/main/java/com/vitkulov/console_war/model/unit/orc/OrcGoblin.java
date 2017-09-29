package com.vitkulov.console_war.model.unit.orc;

import com.vitkulov.console_war.model.unit.Warrior;

public class OrcGoblin extends Warrior {

    @Override
    public void doAction1() {
        // атака дубиной : урон 20 ед.
        System.out.println(this.getClass().getSimpleName() + "Действие 1");
    }
}
