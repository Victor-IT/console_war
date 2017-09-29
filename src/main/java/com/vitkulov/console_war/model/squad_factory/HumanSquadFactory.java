package com.vitkulov.console_war.model.squad_factory;

import com.vitkulov.console_war.Game;
import com.vitkulov.console_war.model.Squad;
import com.vitkulov.console_war.model.unit.human.HumanCrossbowman;
import com.vitkulov.console_war.model.unit.human.HumanMage;
import com.vitkulov.console_war.model.unit.human.HumanWarrior;

public class HumanSquadFactory {

    public Squad createSquad(Game game, int mageCount, int archerCount, int warriorCount) {
        Squad squad = new Squad(game);

        for (int i = 1; i < mageCount + 1; i++) {
            HumanMage humanMage = new HumanMage();
            humanMage.setName("HumanMage_" + i);
            squad.adToNormal(humanMage);
        }
        for (int i = 1; i < archerCount + 1; i++) {
            HumanCrossbowman humanCrossbowman = new HumanCrossbowman();
            humanCrossbowman.setName("HumanCrossbowman_" + i);
            squad.adToNormal(humanCrossbowman);
        }
        for (int i = 1; i < warriorCount + 1; i++) {
            HumanWarrior humanWarrior = new HumanWarrior();
            humanWarrior.setName("HumanWarrior_" + i);
            squad.adToNormal(humanWarrior);
        }

        return squad;
    }
}
