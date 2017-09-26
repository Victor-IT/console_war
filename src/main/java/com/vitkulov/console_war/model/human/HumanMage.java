package com.vitkulov.console_war.model.human;

import com.vitkulov.console_war.Game;
import com.vitkulov.console_war.model.Mage;
import com.vitkulov.console_war.model.Squad;
import com.vitkulov.console_war.service.GameService;

public class HumanMage extends Mage {

    public HumanMage(GameService service, Squad squad) {
        super(service, squad);
    }

    @Override
    public void doAction1() {
        // наложить улучшение на персонажа своего отряда
        System.out.println(this.getClass().getSimpleName() + "Действие 1");
    }

    @Override
    public void doAction2() {
        // нанести урон персонажу противника магией : урон 10HP
        System.out.println(this.getClass().getSimpleName() + "Действие 2");
    }
}
