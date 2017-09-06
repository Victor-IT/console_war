package com.vitkulov.console_war.main;

import com.vitkulov.console_war.Game;
import com.vitkulov.console_war.Squad;
import com.vitkulov.console_war.utils.ConsoleIO;
import com.vitkulov.console_war.utils.Validator;

import java.util.Scanner;

/**
 * Класс содержащий логику игры.
 * Последовательность и очерёдность хода игры.
 */
public class GameRunner {
    private final Game game;
    private final Validator validator;


    public GameRunner(final Game game, Validator validator) {
        this.game = game;
        this.validator = validator;
    }

    public void start() {

        // создаём светлый отряд (эльфы или люди)
        Squad lightSquad = game.createLightSide();
        // создаём тёмный отряд (орки или нежить)
        Squad darkSquad = game.createDarkSide();
        // создаём цикл очередности ходов

        // выбрать очередность хода для стороны

        do {
            // ход светлой стороны
            lightSquad.makeTurn();
            // ход тёмной стороны
            darkSquad.makeTurn();

            // проверить на выигрыш
        } while (!game.checkWin()); //validator.compare("Do you want to continue?", "y"))

    }

    public static void main(String[] args) {
        new GameRunner(
                new Game(),
                new Validator(new ConsoleIO(new Scanner(System.in), System.out))
        ).start();
    }
}
