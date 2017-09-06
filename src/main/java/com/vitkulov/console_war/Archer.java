package com.vitkulov.console_war;

/**
 * Клас юнита - лучник
 */
public class Archer extends Unit {

    public Archer(Game game, Squad squad) {
        super(game, squad);
    }

    @Override
    public void doActions() {
        int actions = 2;

        int random = (int) (Math.random() * actions) + 1;
        switch (random) {
            case 1:
                doAction1();
                break;
            case 2:
                doAction2();
                break;
            default:
                doAction1();
        }
    }

    @Override
    public void doAction1() {
        Unit enemy = game.getEnemy(game.getDarkSquad());
        System.out.println(this.getClass().getSimpleName() + " выстрелил из лука с уроном в: " + getDamage() + " ед.");
        game.hit(enemy, getDamage());
    }

    @Override
    public void doAction2() {
        Unit enemy = game.getEnemy(game.getDarkSquad());
        System.out.println(this.getClass().getSimpleName() + " ударил кинжалом с уроном в: " + getDamage() + " ед.");
        game.hit(enemy, getDamage());
    }
}
