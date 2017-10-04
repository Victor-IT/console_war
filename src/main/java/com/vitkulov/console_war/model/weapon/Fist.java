package com.vitkulov.console_war.model.weapon;

import com.vitkulov.console_war.model.Weapon;

public class Fist extends Weapon {

    public Fist(double damage) {
        super("Fist", damage);
    }

    @Override
    public String doAction() {
        return "ударил кулаком " + "(" + this.name + "): ";
    }
}
