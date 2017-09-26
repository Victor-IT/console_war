package com.vitkulov.console_war.model.orc;

import com.vitkulov.console_war.Game;
import com.vitkulov.console_war.model.Squad;
import com.vitkulov.console_war.model.Warrior;
import com.vitkulov.console_war.service.GameService;

public class OrcGoblin extends Warrior {

    public OrcGoblin(GameService service, Squad squad) {
        super(service, squad);
    }

    @Override
    public void doAction1() {
        // атака дубиной : урон 20HP
        System.out.println(this.getClass().getSimpleName() + "Действие 1");
    }
}
