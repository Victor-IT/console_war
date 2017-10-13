package com.vitkulov.console_war.model.squad_factory;

import com.vitkulov.console_war.Game;
import com.vitkulov.console_war.model.Squad;
import com.vitkulov.console_war.model.Unit;

import static com.vitkulov.console_war.RunApp.LOGGER;

public class SquadFactory {

    public Squad createLightSquad(Game game, int mageCount, int archerCount, int warriorCount) {
        Squad squad;
        if ((int) (Math.random() * 2) == 0) {
            squad = new HumanSquadFactory().createSquad(game, mageCount, archerCount, warriorCount);
        } else {
            squad = new ElfSquadFactory().createSquad(game, mageCount, archerCount, warriorCount);
        }
        LOGGER.info("Создан светлый отряд {}\n", squad.getSquadName());
        for (Unit unit : squad.getNormalSquad()) {
            LOGGER.info(unit.toString());
        }
        LOGGER.info("\n");
        return squad;
    }

    public Squad createDarkSquad(Game game, int mageCount, int archerCount, int warriorCount) {
        Squad squad;
        if ((int) (Math.random() * 2) == 0) {
            squad = new OrcSquadFactory().createSquad(game, mageCount, archerCount, warriorCount);
        } else {
            squad = new UndeadSquadFactory().createSquad(game, mageCount, archerCount, warriorCount);
        }
        LOGGER.info("Создан тёмный отряд {}\n", squad.getSquadName());
        for (Unit unit : squad.getNormalSquad()) {
            LOGGER.info(unit.toString());
        }
        LOGGER.info("\n");
        return squad;
    }
}
