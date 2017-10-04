package com.vitkulov.console_war.model.squad_factory;

import com.vitkulov.console_war.Game;
import com.vitkulov.console_war.model.Squad;
import com.vitkulov.console_war.model.unit.undead.UndeadHunter;
import com.vitkulov.console_war.model.unit.undead.UndeadNecromancer;
import com.vitkulov.console_war.model.unit.undead.UndeadZombie;

public class UndeadSquadFactory {

    public Squad createSquad(Game game, int mageCount, int archerCount, int warriorCount) {
        Squad squad = new Squad(game);
        squad.setSquadName("UndeadSquad");

        for (int i = 1; i < mageCount + 1; i++) {
            UndeadNecromancer undeadNecromancer = new UndeadNecromancer();
            undeadNecromancer.setName("UndeadNecromancer_" + i);
            squad.adToNormal(undeadNecromancer);
        }
        for (int i = 1; i < archerCount + 1; i++) {
            UndeadHunter undeadHunter = new UndeadHunter();
            undeadHunter.setName("UndeadHunter_" + i);
            squad.adToNormal(undeadHunter);
        }
        for (int i = 1; i < warriorCount + 1; i++) {
            UndeadZombie undeadZombie = new UndeadZombie();
            undeadZombie.setName("UndeadZombie_" + i);
            squad.adToNormal(undeadZombie);
        }

        return squad;
    }
}
