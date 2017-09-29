package com.vitkulov.console_war.model.squad_factory;

import com.vitkulov.console_war.Game;
import com.vitkulov.console_war.model.Squad;
import com.vitkulov.console_war.model.unit.orc.OrcArcher;
import com.vitkulov.console_war.model.unit.orc.OrcGoblin;
import com.vitkulov.console_war.model.unit.orc.OrcShaman;

public class OrcSquadFactory {

    public Squad createSquad(Game game, int mageCount, int archerCount, int warriorCount) {
        Squad squad = new Squad(game);

        for (int i = 1; i < mageCount + 1; i++) {
            OrcShaman orcShaman = new OrcShaman();
            orcShaman.setName("OrcShaman_" + i);
            squad.adToNormal(orcShaman);
        }
        for (int i = 1; i < archerCount + 1; i++) {
            OrcArcher orcArcher = new OrcArcher();
            orcArcher.setName("OrcArcher_" + i);
            squad.adToNormal(orcArcher);
        }
        for (int i = 1; i < warriorCount + 1; i++) {
            OrcGoblin orcGoblin = new OrcGoblin();
            orcGoblin.setName("OrcGoblin_" + i);
            squad.adToNormal(new OrcGoblin());
        }

        return squad;
    }
}
