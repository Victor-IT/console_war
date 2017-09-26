package com.vitkulov.console_war;

import com.vitkulov.console_war.service.GameService;
import com.vitkulov.console_war.service.GameServiceImpl;
import com.vitkulov.console_war.view.GameUI;
import com.vitkulov.console_war.view.ViewController;
import com.vitkulov.console_war.view.ViewControllerImpl;

/**
 * Класс стартующий приложение
 */
public class GameRunner {
    private GameUI ui;


    private GameRunner(final GameUI ui) {
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

        new GameRunner(ui).start();
    }
}
