package com.vitkulov.console_war.model;

import com.vitkulov.console_war.service.GameService;

/**
 * Клас юнита - маг
 */
public class Mage extends Unit {

    public Mage(GameService game, Squad squad) {
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

    }

    @Override
    public void doAction2() {

    }
}