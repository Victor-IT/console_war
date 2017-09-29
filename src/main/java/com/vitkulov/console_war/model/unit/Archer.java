package com.vitkulov.console_war.model.unit;

import com.vitkulov.console_war.model.Unit;

/**
 * Клас юнита - лучник
 */
public class Archer extends Unit {

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
        Unit enemy = game.getEnemy(this);
        System.out.printf("%s %s %s ед.\n", this.getName(), getPrimaryWep().doAction(), getPrimaryDamage());
        game.hit(enemy, getPrimaryDamage());
    }

    @Override
    public void doAction2() {
        Unit enemy = game.getEnemy(this);
        System.out.printf("%s %s %s ед.\n", this.getName(), getSecondaryWep().doAction(), getSecondaryDamage());
        game.hit(enemy, getSecondaryDamage());
    }
}
