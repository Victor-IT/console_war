package com.vitkulov.console_war.model;

public interface WeaponAction {
    String doAction();

    void doAction(Unit unit);

    double getDamage();
}
