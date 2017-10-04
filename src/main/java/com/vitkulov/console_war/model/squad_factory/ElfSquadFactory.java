package com.vitkulov.console_war.model.squad_factory;

import com.vitkulov.console_war.Game;
import com.vitkulov.console_war.model.Squad;
import com.vitkulov.console_war.model.unit.elf.ElfArcher;
import com.vitkulov.console_war.model.unit.elf.ElfMage;
import com.vitkulov.console_war.model.unit.elf.ElfWarrior;

public class ElfSquadFactory {
    public Squad createSquad(Game game, int mageCount, int archerCount, int warriorCount) {
        Squad squad = new Squad(game);
        squad.setSquadName("ElfSquad");

        for (int i = 1; i < mageCount + 1; i++) {
            ElfMage elfMage = new ElfMage();
            elfMage.setName("ElfMage_" + i);
            squad.adToNormal(elfMage);
        }
        for (int i = 1; i < archerCount + 1; i++) {
            ElfArcher elfArcher = new ElfArcher();
            elfArcher.setName("ElfArcher_" + i);
            squad.adToNormal(elfArcher);
        }
        for (int i = 1; i < warriorCount + 1; i++) {
            ElfWarrior elfWarrior = new ElfWarrior();
            elfWarrior.setName("ElfWarrior_" + i);
            squad.adToNormal(elfWarrior);
        }

        return squad;
    }
}
