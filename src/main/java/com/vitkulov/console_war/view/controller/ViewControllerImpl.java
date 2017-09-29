package com.vitkulov.console_war.view.controller;

import com.vitkulov.console_war.service.GameService;

public class ViewControllerImpl implements ViewController {
    private GameService service;

    public ViewControllerImpl() {

    }

    public ViewControllerImpl(GameService service) {
        this();
        setService(service);
    }

    public void setService(GameService service) {
        this.service = service;
    }

    @Override
    public void showGreetings() {
        System.out.println("Добро пожаловать в игру!");
    }

    @Override
    public void showMenu() {
        System.out.println("Выберите пункт меню:");
    }

    @Override
    public void selectScenario() {
        service.selectScenario();
    }

    @Override
    public void chooseFirstSide() {
        service.chooseFirstSide();
    }

    @Override
    public void chooseSecondSide() {
        service.chooseSecondSide();
    }

    @Override
    public void startGame() {
        service.startGame();
    }

    @Override
    public void demo() {
        service.demo();
    }

}
