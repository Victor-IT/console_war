package com.vitkulov.console_war;

/**
 * Абстрактный класс юнит - каркас для будущих модификаций юнитов.
 */
public abstract class Unit implements Action {
    private int id;
    private String name;
    protected final Game game;
    private final Squad squad;

    private final Double BASE_DAMAGE = 0.0;

    private Double health = 100.0;
    private Double buffMod = 1.0;
    private Double weaponMod = 1.0;
    private boolean buffed;
    public Unit(Game game, Squad squad) {
        this.game = game;
        this.squad = squad;
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

    public Squad getSquad() {
        return squad;
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

    public Double getWeaponMod() {
        return weaponMod;
    }

    public void setWeaponMod(Double weaponMod) {
        this.weaponMod = weaponMod;
    }

    public Double getDamage() {
        Double damage;
        return damage = (this.BASE_DAMAGE + weaponMod) * buffMod;
    }

    public boolean isBuffed() {
        return buffed;
    }

    public void setBuffed(boolean buffed) {
        this.buffed = buffed;
    }

    /**
     * Фиксация урона юниту
     * @param damage сила удара
     * @return 0 если юнит ещё жив или 1 если юнит мёртв
     */
    public int hit(double damage) {
        this.health -= damage;
        System.out.println(this.getClass().getSimpleName() + " получил урон: -" + damage + " HP");
        if (health > 0) {
            System.out.println("Осталось: " + health + " HP");
        } else {
            System.out.println("Убит");
            return 0;
        }
        return 1;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", damage=" + getDamage() +
                ", health=" + health +
                ", buffed=" + buffed +
                '}';
    }
}
