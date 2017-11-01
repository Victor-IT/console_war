package com.vitkulov.console_war.service;

import com.vitkulov.console_war.model.Squad;
import com.vitkulov.console_war.model.squad_factory.SquadFactory;

public interface GameService {
    /**
     * Создать отряд
     * @param squadFactory фабрики соответствующего класса юнитов
     * @return squad
     */
    Squad createSquad(SquadFactory squadFactory);

    /**
     * Создать отряд светлых (эльфы или люди)
     * @return squad
     */
    void createRandomLightSquad();

    /**
     * Создать отряд темных (орки или нежить)
     * @return squad
     */
    void createRandomDarkSquad();

    /**
     * Проверить выживших
     * @return true - если выиграла одна из сторон,
     * т.е. в отряде одной из сторон не осталось выживших
     */
    boolean checkWin();

    /**
     * Получить темный отряд
     * @return squad
     */
    Squad getDarkSquad();

    /**
     * Получить светлый отряд
     * @return squad
     */
    Squad getLightSquad();

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
}
