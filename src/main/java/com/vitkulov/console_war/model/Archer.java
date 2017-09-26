package com.vitkulov.console_war.model;

import com.vitkulov.console_war.service.GameService;

/**
 * Клас юнита - лучник
 */
public class Archer extends Unit {

    public Archer(GameService service, Squad squad) {
        super(service, squad);
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
        Unit enemy = service.chooseEnemy(this);
        System.out.printf("%s %s %s ед.\n", this.getClass().getSimpleName(), getPrimaryWep().doAction(), getPrimaryDamage());
        service.hit(enemy, getPrimaryDamage());
    }

    @Override
    public void doAction2() {
        Unit enemy = service.chooseEnemy(this);
        System.out.printf("%s %s %s ед.\n", this.getClass().getSimpleName(), getSecondaryWep().doAction(), getSecondaryDamage());
        service.hit(enemy, getSecondaryDamage());
    }
}
