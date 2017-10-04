package com.vitkulov.console_war.model.weapon;

import com.vitkulov.console_war.model.Weapon;

public class MagicStaff extends Weapon {

    public MagicStaff(double damage) {
        super("MagicStaff", damage);
    }

    @Override
    public String doAction() {
        return "атаковал магией " + "(" + this.name + ") :";
    }
}
