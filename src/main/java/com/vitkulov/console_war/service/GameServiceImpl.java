package com.vitkulov.console_war.service;

import com.vitkulov.console_war.Game;
import com.vitkulov.console_war.model.Squad;
import com.vitkulov.console_war.model.squad_factory.SquadFactory;

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
    public Squad createSquad(SquadFactory squadFactory) {
        return game.createSquad(squadFactory);
    }

    @Override
    public void createLightSquad() {
        game.createLightSquad();
    }

    @Override
    public void createDarkSquad() {
        game.createDarkSquad();
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
    public void chooseLightSide() {

    }

    @Override
    public void chooseDarkSide() {

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
