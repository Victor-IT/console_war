package com.vitkulov.console_war.model.weapon;

import com.vitkulov.console_war.model.Weapon;

public class Sword extends Weapon {

    public Sword(double damage) {
        super("Sword", damage);
    }

    @Override
    public String printAction() {
        return "ударил мечом " + "(" + this.name + "):";
    }
}
