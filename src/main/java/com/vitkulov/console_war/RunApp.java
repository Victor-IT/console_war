package com.vitkulov.console_war;

import com.vitkulov.console_war.service.GameService;
import com.vitkulov.console_war.service.GameServiceImpl;
import com.vitkulov.console_war.view.GameUI;
import com.vitkulov.console_war.view.controller.ViewController;
import com.vitkulov.console_war.view.controller.ViewControllerImpl;

/**
 * Класс стартующий приложение
 */
public class RunApp {
    private GameUI ui;

    private RunApp(final GameUI ui) {
        this.ui = ui;
    }

    private void start() {
        // отобразить стартовое UI
        ui.showGreetings();
        ui.demo();
    }

    public static void main(String[] args) {
        Game game = new Game();
        GameService service = new GameServiceImpl(game);
        ViewController controller = new ViewControllerImpl(service);
        GameUI ui = new GameUI(controller);

        new RunApp(ui).start();
    }
}
