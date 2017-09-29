package com.vitkulov.console_war.model.squad_factory;

import com.vitkulov.console_war.Game;
import com.vitkulov.console_war.model.Squad;

public class SquadFactory {

    public Squad createLightSquad(Game game, int mageCount, int archerCount, int warriorCount) {
        Squad squad;
        if (((int) (Math.random() * 2) + 1) == 1) {
            squad = new HumanSquadFactory().createSquad(game, mageCount, archerCount, warriorCount);
            squad.setSquadName("HumanSquad");
        } else {
            squad = new ElfSquadFactory().createSquad(game, mageCount, archerCount, warriorCount);
            squad.setSquadName("ElfSquad");
        }
        System.out.printf("Создан светлый отряд %s\n", squad.getSquadName());
        System.out.println(squad);
        return squad;
    }

    public Squad createDarkSquad(Game game, int mageCount, int archerCount, int warriorCount) {
        Squad squad;
        if (((int) (Math.random() * 2) + 1) == 1) {
            squad = new OrcSquadFactory().createSquad(game, mageCount, archerCount, warriorCount);
            squad.setSquadName("OrcSquad");
        } else {
            squad = new UndeadSquadFactory().createSquad(game, mageCount, archerCount, warriorCount);
            squad.setSquadName("UndeadSquad");
        }
        System.out.printf("Создан тёмный отряд %s\n", squad.getSquadName());
        System.out.println(squad);
        return squad;
    }
}
