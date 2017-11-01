package com.vitkulov.console_war.ui.view;

import com.vitkulov.console_war.ui.controller.ViewController;

public interface MainView {

    void setController(ViewController controller);

    /**
     * Отобразить приветсвие
     */
    void showGreetings();

    /**
     * Отобразить консольное меню
     */
    void showConsoleMenu();

    /**
     * Начать игру
     */
    int startGame();

    /**
     * Начать случайную игру
     */
    void randomGame();
}
