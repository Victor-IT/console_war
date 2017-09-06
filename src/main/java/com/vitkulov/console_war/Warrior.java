package com.vitkulov.console_war;

/**
 * Класс юнита - воин
 */
public class Warrior extends Unit {

    public Warrior(Game game, Squad squad) {
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
        doAction1();
    }
}
