package com.vitkulov.console_war.model.weapon;

import com.vitkulov.console_war.model.Weapon;

public class Club extends Weapon {

    public Club(double damage) {
        super("Club", damage);
    }

    @Override
    public String doAction() {
        return "Ударил дубиной " + "(" + this.name + "): ";
    }
}
