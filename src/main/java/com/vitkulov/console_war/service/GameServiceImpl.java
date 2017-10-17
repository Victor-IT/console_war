package com.vitkulov.console_war.service;

import com.vitkulov.console_war.Game;
import com.vitkulov.console_war.model.Squad;

public class GameServiceImpl implements GameService {
    private Game game;

    public GameServiceImpl() {

    }

    public GameServiceImpl(Game game) {
        this();
        this.game = game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public Squad createLightSquad() {
        return game.createLightSquad();
    }

    @Override
    public Squad createDarkSquad() {
        return game.createDarkSquad();
    }

    @Override
    public boolean checkWin() {
        return game.checkWin();
    }

    @Override
    public Squad getDarkSquad() {
        return game.getDarkSquad();
    }

    @Override
    public Squad getLightSquad() {
        return game.getLightSquad();
    }

    @Override
    public void chooseFirstSide() {

    }

    @Override
    public void chooseSecondSide() {

    }

    @Override
    public void startGame() {
        game.runGame();
    }

    public void randomGame() {
        createLightSquad();
        createDarkSquad();
        startGame();
    }
}
