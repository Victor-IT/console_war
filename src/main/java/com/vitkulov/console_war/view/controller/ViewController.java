package com.vitkulov.console_war.view.controller;

public interface ViewController {

    /**
     * Отобразить приветсвие
     */
    void showGreetings();

    /**
     * Отобразить меню
     */
    void showConsoleMenu();

    /**
     * Выбрать отряд для светлой стороны
     */
    void chooseLightSide();

    /**
     * Выбрать отряд для темной стороны
     */
    void chooseDarkSide();

    /**
     * Начать игру
     */
    void startGame();

    /**
     * Начать случайную игру
     */
    void randomGame();
}
