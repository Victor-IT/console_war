package com.vitkulov.console_war.view;

import com.vitkulov.console_war.view.controller.ViewController;

public class GameUI {
    private ViewController controller;

    public GameUI() {

    }

    public GameUI(ViewController controller) {
        this();
        setController(controller);
    }

    public void setController(ViewController controller) {
        this.controller = controller;
    }

    // приветствие игры
    public void showGreetings() {
        controller.showGreetings();
    }

    // показать меню
    public void showMenu() {
        controller.showMenu();
    }

    // выбрать сценарий битвы (враждующие стороны)
    public void selectScenario() {
        controller.selectScenario();
    }

    // выбрать 1ю сторону
    public void chooseFirstSide() {
        controller.chooseFirstSide();
    }

    // выбрать 2ю сторону
    public void chooseSecondSide() {
        controller.chooseSecondSide();
    }

    // начать игру
    public void startGame() {
        controller.startGame();
    }

    // демо сценарий
    public void demo() {
        controller.demo();
    }
}
