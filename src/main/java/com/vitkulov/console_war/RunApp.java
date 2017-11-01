package com.vitkulov.console_war;

import com.vitkulov.console_war.service.GameService;
import com.vitkulov.console_war.service.GameServiceImpl;
import com.vitkulov.console_war.ui.controller.ViewController;
import com.vitkulov.console_war.ui.controller.ViewControllerImpl;
import com.vitkulov.console_war.ui.menu.*;
import com.vitkulov.console_war.ui.view.MainViewImpl;
import com.vitkulov.console_war.utils.ConsoleIO;
import com.vitkulov.console_war.utils.Validator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * Класс стартующий приложение
 */
public class RunApp {
    public static final Logger LOGGER = LoggerFactory.getLogger("L1");
    public static Validator validator = new Validator(new ConsoleIO(new Scanner(System.in), System.out));
    private MainViewImpl ui;

    private RunApp(final MainViewImpl ui) {
        this.ui = ui;
    }

    private void start() {
        LOGGER.info("- - - - - - - Starting new game - - - - - - -\n\n");
        ui.showGreetings();
        ui.showConsoleMenu();
    }

    public static void main(String[] args) {
        Game game = new Game();
        GameService service = new GameServiceImpl(game);
        ViewController controller = new ViewControllerImpl(service);
        MainViewImpl ui = new MainViewImpl(controller);

        ui.putMenu(1, new CreateLightSquad());
        ui.putMenu(2, new CreateDarkSquad());
        ui.putMenu(3, new StartGame());
        ui.putMenu(4, new RandomGame());
        ui.putMenu(0, new Exit());

        new RunApp(ui).start();
    }
}
