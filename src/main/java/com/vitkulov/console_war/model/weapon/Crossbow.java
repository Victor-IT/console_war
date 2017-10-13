package com.vitkulov.console_war.model.weapon;

import com.vitkulov.console_war.model.Weapon;

public class Crossbow extends Weapon {

    public Crossbow(double damage) {
        super("Crossbow", damage);
    }

    @Override
    public String printAction() {
        return "выстрелил из арбалета " + "(" + this.name + "):";
    }
}
