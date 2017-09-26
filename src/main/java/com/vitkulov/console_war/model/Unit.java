package com.vitkulov.console_war.model;

import com.vitkulov.console_war.model.weapon.Fist;
import com.vitkulov.console_war.service.GameService;

/**
 * Абстрактный класс юнит - каркас для будущих модификаций юнитов.
 */
public abstract class Unit implements Action {
    protected final GameService service;
    private final Squad squad;

    private int id;
    private String name;
    private Weapon primaryWep;
    private Weapon secondaryWep;
    private Double health = 100.0;
    private Double buffMod = 1.0;
    private boolean buffed;

    public Unit(GameService service, Squad squad) {
        this.service = service;
        this.squad = squad;
        this.primaryWep = new Fist(1);
        this.secondaryWep = new Fist(1);
    }

    public Squad getSquad() {
        return squad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setPrimaryWep(Weapon weapon) {
        this.primaryWep = weapon;
    }

    public Weapon getSecondaryWep() {
        return secondaryWep;
    }

    public void setSecondaryWep(Weapon secondaryWep) {
        this.secondaryWep = secondaryWep;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }

    public Double getBuffMod() {
        return buffMod;
    }

    public void setBuffMod(Double buffMod) {
        this.buffMod = buffMod;
    }

    public Double getPrimaryDamage() {
        return primaryWep.getDamage() * getBuffMod();
    }

    public Double getSecondaryDamage() {
        return secondaryWep.getDamage() * getBuffMod();
    }

    public boolean isBuffed() {
        return buffed;
    }

    public void setBuffed(boolean buffed) {
        this.buffed = buffed;
    }

    /**
     * Фиксация урона юниту
     *
     * @param damage количество урона
     * @return 0 если юнит ещё жив или 1 если юнит мёртв
     */
    public int hit(double damage) {
        this.health -= damage;
        System.out.printf("%s получил урон: -%s HP\t", this.getClass().getSimpleName(), damage);
        if (health > 0) {
            System.out.println("Осталось: " + health + " HP\n");
        } else {
            System.out.println("Убит\n");
            return 0;
        }
        return 1;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pWeapon =" + getPrimaryWep() +
                ", sWeapon =" + getSecondaryWep() +
                ", health=" + health +
                ", buffed=" + buffed +
                '}';
    }
}
