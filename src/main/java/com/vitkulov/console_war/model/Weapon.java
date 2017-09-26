package com.vitkulov.console_war.model;

import com.vitkulov.console_war.model.weapon.WepAction;

public abstract class Weapon implements WepAction{
    private String name;
    private double damage;

    public Weapon(String name, double damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                '}';
    }
}
