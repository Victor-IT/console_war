package com.vitkulov.console_war.model.unit.orc;

import com.vitkulov.console_war.model.Skill;
import com.vitkulov.console_war.model.Unit;
import com.vitkulov.console_war.model.skill.Curse;
import com.vitkulov.console_war.model.skill.PowerUp;
import com.vitkulov.console_war.model.unit.Mage;

import static com.vitkulov.console_war.RunApp.LOGGER;

public class OrcShaman extends Mage {

    public OrcShaman() {
        // Установим начальное оружие и силу урона
        setPrimary(new Curse(0, 1)); // снять улучшение с противника
        setSecondary(new PowerUp(0, 1)); // наложить улучшение на союзника
    }

    @Override
    public void action1() {
        // наложение проклятия (снятие улучшения с персонажа противника для следующего хода)
        Unit enemy = game.getPrivilegedEnemy(this);
        enemy.addBuff((Skill) getPrimary());
        enemy.checkAndApplyBuff();
        LOGGER.info("{} {} ({})\n", this.getName(), getSecondary().printAction(), enemy.getName());
        this.decreaseBuffDurationOrDelete();
        this.getSquad().adToNormal(this);
    }

    @Override
    public void action2() {
        // наложить улучшение на персонажа своего отряда
        Unit ally = game.getAlly(this);
        ally.addBuff((Skill) getSecondary());
        ally.checkAndApplyBuff();
        LOGGER.info("{} {} ({})\n", this.getName(), getSecondary().printAction(), ally.getName());
        this.decreaseBuffDurationOrDelete();
        this.getSquad().adToNormal(this);
    }
}
