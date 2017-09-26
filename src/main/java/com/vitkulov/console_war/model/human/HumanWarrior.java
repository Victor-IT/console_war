package com.vitkulov.console_war.model.human;

import com.vitkulov.console_war.Game;
import com.vitkulov.console_war.model.Squad;
import com.vitkulov.console_war.model.Warrior;
import com.vitkulov.console_war.service.GameService;

public class HumanWarrior extends Warrior {

    public HumanWarrior(GameService service, Squad squad) {
        super(service, squad);
    }

    @Override
    public void doAction1() {
        // атака мечом : урон 3 HP
        System.out.println(this.getClass().getSimpleName() + "Действие 1");
    }
}
