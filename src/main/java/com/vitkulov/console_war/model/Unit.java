package com.vitkulov.console_war.model;

import com.vitkulov.console_war.Game;
import com.vitkulov.console_war.model.weapon.Fist;

/**
 * Класс описывающий юнита - общий скелет для всех юнитов.
 */
public abstract class Unit implements UnitAction {
    protected Game game;
    protected Squad squad;

    protected String name;
    protected Weapon primaryWep;
    protected Weapon secondaryWep;
    protected double health = 100.0;
    protected double damageMod = 1.0;

    public Unit() {
        this.primaryWep = new Fist(1);
        this.secondaryWep = new Fist(1);
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Squad getSquad() {
        return squad;
    }

    public void setSquad(Squad squad) {
        this.squad = squad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getPrimaryWep() {
        return primaryWep;
    }

    public void setPrimaryWeapon(Weapon weapon) {
        this.primaryWep = weapon;
    }

    public Weapon getSecondaryWep() {
        return secondaryWep;
    }

    public void setSecondaryWeapon(Weapon secondaryWep) {
        this.secondaryWep = secondaryWep;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getDamageMod() {
        return damageMod;
    }

    public void setDamageMod(double damageMod) {
        this.damageMod = damageMod;
    }

    public Double getPrimaryDamage() {
        return primaryWep.getDamage() * getDamageMod();
    }

    public Double getSecondaryDamage() {
        return secondaryWep.getDamage() * getDamageMod();
    }

    /**
     * Фиксация урона юниту
     *
     * @param damage количество урона
     * @return 0 если юнит ещё жив или 1 если юнит мёртв
     */
    public int hit(double damage) {
        this.health -= damage;
        System.out.printf("%s получил урон: -%s HP\t", this.getName(), damage);
        if (health > 0) {
            System.out.println("Осталось: " + health + " HP\n");
        } else {
            System.err.println("Убит\n");
            return 0;
        }
        return 1;
    }

    @Override
    public String toString() {
        return " " + name + ", health=" + health + ", damageMod=" + damageMod + "\n";
    }
}
