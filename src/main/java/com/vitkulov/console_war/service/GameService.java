package com.vitkulov.console_war.service;

import com.vitkulov.console_war.model.Squad;
import com.vitkulov.console_war.model.squad_factory.SquadFactory;

public interface GameService {
    /**
     * Создать отряд
     * @param squadFactory передаём тип фабрики юнитов
     * @return squad
     */
    Squad createSquad(SquadFactory squadFactory);

    /**
     * Создать отряд светлых (эльфы или люди)
     * @return squad
     */
    void createLightSquad();

    /**
     * Создать отряд темных (орки или нежить)
     * @return squad
     */
    void createDarkSquad();

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
     * Выбрать отряд для светлой стороны
     */
    void chooseLightSide();

    /**
     * Выбрать отряд для тёмной стороны
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
