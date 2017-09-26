package com.vitkulov.console_war.model.weapon;

import com.vitkulov.console_war.model.Weapon;

public class Crossbow extends Weapon {
    public Crossbow(double damage) {
        super("Crossbow", damage);
    }

    @Override
    public String doAction() {
        return "выстрелил из арбалета " + "(" + getName() + "): ";
    }
}
