package com.vitkulov.console_war.model.orc;

import com.vitkulov.console_war.Game;
import com.vitkulov.console_war.model.Mage;
import com.vitkulov.console_war.model.Squad;
import com.vitkulov.console_war.service.GameService;

public class OrcShaman extends Mage {

    public OrcShaman(GameService service, Squad squad) {
        super(service, squad);
    }

    @Override
    public void doAction1() {
        // наложить улучшение на персонажа своего отряда
        System.out.println(this.getClass().getSimpleName() + "Действие 1");
    }

    @Override
    public void doAction2() {
        // наложение проклятия (снятие улучшения с персонажа противника для следующего хода)
        System.out.println(this.getClass().getSimpleName() + "Действие 2");
    }
}
