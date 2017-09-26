package com.vitkulov.console_war.service;

import com.vitkulov.console_war.model.Squad;
import com.vitkulov.console_war.model.Unit;

public interface GameService {
    /**
     * Создать отряд светлых (эльфы или люди)
     * @return squad
     */
    Squad createLightSquad();

    /**
     * Создать отряд темный (орки или нежить)
     * @return squad
     */
    Squad createDarkSquad();

    /**
     * Получить противника из вражеского отряда
     * @param unit - текущий юнит
     * @return enemy unit - противник из вражеского отряда
     */
    Unit chooseEnemy(Unit unit);

    /**
     * Нанести урон противнику
     * @param enemy - выбранный противник
     * @param damage - наносимый урон
     */
    void hit(Unit enemy, double damage);

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

    void selectScenario();

    void chooseFirstSide();

    void chooseSecondSide();

    void startGame();

    void demo();
}
