package com.vitkulov.console_war.model.unit.orc;

import com.vitkulov.console_war.model.Unit;
import com.vitkulov.console_war.model.unit.Mage;

public class OrcShaman extends Mage {

    @Override
    public void doAction1() {
        // наложить улучшение на персонажа своего отряда
        Unit ally = game.getAlly(this);
        ally.getSquad().adToPrivileged(ally);
        System.out.printf("%s %s (%s)\n", this.getName(), "наложил улучшение на союзника", ally.getName());
        this.getSquad().adToNormal(this);
    }

    @Override
    public void doAction2() {
        // наложение проклятия (снятие улучшения с персонажа противника для следующего хода)
        Unit enemy = game.getPrivilegedEnemy(this);
        enemy.getSquad().adToNormal(enemy); //todo: ввести классы навыки-скилы
        System.out.printf("%s %s (%s)\n", this.getName(), "наложил проклятие на противника", enemy.getName());
        this.getSquad().adToNormal(this);
    }
}
