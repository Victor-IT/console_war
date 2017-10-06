package com.vitkulov.console_war.model;

public abstract class Skill implements WeaponAction, Cloneable{
    protected String name;
    protected double damage;
    protected int duration;
    protected boolean isUsed;

    public Skill(String name, double damage, int duration) {
        this.name = name;
        this.damage = damage;
        this.duration = duration;
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", duration=" + duration +
                ", isUsed=" + isUsed +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
