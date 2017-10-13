package com.vitkulov.console_war;

import com.vitkulov.console_war.service.GameService;
import com.vitkulov.console_war.service.GameServiceImpl;
import com.vitkulov.console_war.view.GameUI;
import com.vitkulov.console_war.view.controller.ViewController;
import com.vitkulov.console_war.view.controller.ViewControllerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Класс стартующий приложение
 */
public class RunApp {
    public static final Logger LOGGER = LoggerFactory.getLogger("L1");
    private GameUI ui;

    private RunApp(final GameUI ui) {
        this.ui = ui;
    }

    private void start() {
        LOGGER.info("- - - - - - - Starting new game - - - - - - -\n\n");
        ui.showGreetings();
        ui.randomGame();
    }

    public static void main(String[] args) {
        Game game = new Game();
        GameService service = new GameServiceImpl(game);
        ViewController controller = new ViewControllerImpl(service);
        GameUI ui = new GameUI(controller);

        new RunApp(ui).start();
    }
}
