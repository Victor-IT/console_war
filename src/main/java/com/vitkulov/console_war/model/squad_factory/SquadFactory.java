package com.vitkulov.console_war.model.squad_factory;

import com.vitkulov.console_war.Game;
import com.vitkulov.console_war.model.Squad;
import com.vitkulov.console_war.model.Unit;

public class SquadFactory {

    public Squad createLightSquad(Game game, int mageCount, int archerCount, int warriorCount) {
        Squad squad;
        if (((int) (Math.random() * 2) + 1) == 1) {
            squad = new HumanSquadFactory().createSquad(game, mageCount, archerCount, warriorCount);
        } else {
            squad = new ElfSquadFactory().createSquad(game, mageCount, archerCount, warriorCount);
        }
        System.out.printf("Создан светлый отряд %s\n", squad.getSquadName());
        for (Unit unit : squad.getNormalSquad()) {
            System.out.print(unit);
        }
        return squad;
    }

    public Squad createDarkSquad(Game game, int mageCount, int archerCount, int warriorCount) {
        Squad squad;
        if (((int) (Math.random() * 2) + 1) == 1) {
            squad = new OrcSquadFactory().createSquad(game, mageCount, archerCount, warriorCount);
        } else {
            squad = new UndeadSquadFactory().createSquad(game, mageCount, archerCount, warriorCount);
        }
        System.out.printf("Создан тёмный отряд %s\n", squad.getSquadName());
        for (Unit unit : squad.getNormalSquad()) {
            System.out.print(unit);
        }
        return squad;
    }
}
