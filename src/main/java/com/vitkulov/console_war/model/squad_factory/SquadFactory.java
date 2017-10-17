package com.vitkulov.console_war.model.squad_factory;

import com.vitkulov.console_war.Game;
import com.vitkulov.console_war.model.Squad;

public interface SquadFactory {

    Squad createSquad(Game game, int mageCount, int archerCount, int warriorCount);
}
