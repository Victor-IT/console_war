package com.vitkulov.console_war.model.orc;

import com.vitkulov.console_war.model.Archer;
import com.vitkulov.console_war.Game;
import com.vitkulov.console_war.model.Squad;
import com.vitkulov.console_war.service.GameService;

public class OrcArcher extends Archer {

    public OrcArcher(GameService service, Squad squad) {
        super(service, squad);
    }

    @Override
    public void doAction1() {
        // стрелять из лука : урон 3HP
        super.doAction1();
    }

    @Override
    public void doAction2() {
        // удар клинком : урон 2HP
        super.doAction2();
    }
}
