package com.vitkulov.console_war.ui.menu;

import com.vitkulov.console_war.ui.controller.ViewController;

public class Exit implements MenuItem {

    @Override
    public int execute(ViewController controller) {
        controller.exit();
        return 0;
    }

    @Override
    public String intro() {
        return String.format("%s", "Выход");
    }
}
