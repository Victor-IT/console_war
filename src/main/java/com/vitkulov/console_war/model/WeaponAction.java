package com.vitkulov.console_war.model;

public interface WeaponAction {

    /**
     * Print action for weapon/skill
     * @return action description
     */
    String printAction();

    /**
     * Do action for weapon/skill on unit
     * @param unit for action
     */
    void doAction(Unit unit);

    double getDamage();
}
