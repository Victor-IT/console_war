package com.vitkulov.console_war.model.human;

import com.vitkulov.console_war.model.Archer;
import com.vitkulov.console_war.model.Squad;
import com.vitkulov.console_war.service.GameService;

public class HumanCrossbowman extends Archer {

    public HumanCrossbowman(GameService service, Squad squad) {
        super(service, squad);
    }

    @Override
    public void doAction1() {
        // стрелять из арбалета : урон 5HP
        super.doAction1();
    }

    @Override
    public void doAction2() {
        // атаковать противника : урон 3HP
        super.doAction2();
    }
}
