package com.vitkulov.console_war.view.controller;

import com.vitkulov.console_war.service.GameService;

import static com.vitkulov.console_war.RunApp.LOGGER;

public class ViewControllerImpl implements ViewController {
    private GameService service;

    public ViewControllerImpl() {

    }

    public ViewControllerImpl(GameService service) {
        this();
        this.service = service;
    }

    public void setService(GameService service) {
        this.service = service;
    }

    @Override
    public void showGreetings() {
        LOGGER.info("Добро пожаловать в игру!\n\n");
    }

    @Override
    public void showConsoleMenu() {
        LOGGER.info("Выберите пункт меню:\n");
    }

    @Override
    public void chooseLightSide() {
        service.chooseLightSide();
    }

    @Override
    public void chooseDarkSide() {
        service.chooseDarkSide();
    }

    @Override
    public void startGame() {
        service.startGame();
    }

    @Override
    public void randomGame() {
        service.randomGame();
    }

}
