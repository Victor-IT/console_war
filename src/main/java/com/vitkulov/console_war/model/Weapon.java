package com.vitkulov.console_war.model;

/**
 * Класс описывающий оружие в игре
 */
public abstract class Weapon implements WeaponAction {
    protected String name;
    protected double damage;

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

    @Override
    public void doAction(Unit unit) {
        // не используется
    }
}
