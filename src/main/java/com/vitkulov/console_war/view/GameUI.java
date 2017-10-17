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
    public void showConsoleMenu() {
        controller.showConsoleMenu();
    }

    // выбрать отряд для светлой стороны
    public void chooseLightSide() {
        controller.chooseLightSide();
    }

    // выбрать отряд для темной стороны
    public void chooseDarkSide() {
        controller.chooseDarkSide();
    }

    // начать игру
    public void startGame() {
        controller.startGame();
    }

    // случайная игра
    public void randomGame() {
        controller.randomGame();
    }
}
