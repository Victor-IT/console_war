package com.vitkulov.console_war.ui.controller;

import com.vitkulov.console_war.service.GameService;

public interface ViewController {

    void setService(GameService service);

    /**
     * Создать светлый отряд
     */
    void createLightSquad(int number);

    /**
     * Создать тёмный отряд
     */
    void createDarkSquad(int number);

    /**
     * Начать игру
     */
    int startGame();

    /**
     * Начать случайную игру
     */
    void randomGame();

    /**
     * Выйти из игры
     */
    void exit();
}
