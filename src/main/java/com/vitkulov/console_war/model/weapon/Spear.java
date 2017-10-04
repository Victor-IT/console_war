package com.vitkulov.console_war.model.weapon;

import com.vitkulov.console_war.model.Weapon;

public class Spear extends Weapon {

    public Spear(double damage) {
        super("Spear", damage);
    }

    @Override
    public String doAction() {
        return "ударил копьём " + "(" + this.name + ") :";
    }
}
