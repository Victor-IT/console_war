package com.vitkulov.console_war.model.weapon;

import com.vitkulov.console_war.model.Weapon;

public class Dagger extends Weapon {

    public Dagger(double damage) {
        super("Dagger", damage);
    }

    @Override
    public String printAction() {
        return "ударил кинжалом " + "(" + this.name + "):";
    }
}
