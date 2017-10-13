package com.vitkulov.console_war.view.controller;

public interface ViewController {

    /**
     * Отобразить приветсвие
     */
    void showGreetings();

    /**
     * Отобразить меню
     */
    void showMenu();

    /**
     * Выбрать первую сторону
     */
    void chooseFirstSide();

    /**
     * Выбрать вторую сторону
     */
    void chooseSecondSide();

    /**
     * Начать игру
     */
    void startGame();

    /**
     * Начать случайную игру
     */
    void randomGame();
}
