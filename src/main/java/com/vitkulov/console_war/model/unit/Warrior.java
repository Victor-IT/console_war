package com.vitkulov.console_war.model.unit;

import com.vitkulov.console_war.model.Unit;

/**
 * Класc юнита - воин
 */
public class Warrior extends Unit {

    @Override
    public void action2() {
        action1();
    }
}
