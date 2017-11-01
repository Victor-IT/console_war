package com.vitkulov.console_war.ui.menu;

import com.vitkulov.console_war.ui.controller.ViewController;

public class RandomGame implements MenuItem {

    @Override
    public int execute(ViewController controller) {
        controller.randomGame();
        return 0;
    }

    @Override
    public String intro() {
        return String.format("%s", "Начать случайную игру");
    }
}
