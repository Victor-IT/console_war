package com.vitkulov.console_war.model.weapon;

import com.vitkulov.console_war.model.Weapon;

public class Bow extends Weapon {
    public Bow(double damage) {
        super("Bow", damage);
    }

    @Override
    public String doAction() {
        return "выстрелил из лука " + "(" + getName() + "): ";
    }
}
