package com.vitkulov.console_war.model.unit.human;

import com.vitkulov.console_war.model.Skill;
import com.vitkulov.console_war.model.Unit;
import com.vitkulov.console_war.model.skill.PowerUp;
import com.vitkulov.console_war.model.unit.Mage;
import com.vitkulov.console_war.model.weapon.MagicStaff;

public class HumanMage extends Mage {

    public HumanMage() {
        // Установим начальное оружие и силу урона
        setPrimary(new MagicStaff(4)); // атаковать магией : урон 4 ед.
        setSecondary(new PowerUp(0, 1)); // наложить улучшение на союзника
    }

    @Override
    public void action2() {
        // наложить улучшение на персонажа своего отряда
        Unit ally = game.getAlly(this);
        ally.addBuff((Skill) getSecondary());
        ally.checkAndApplyBuff();
        System.out.printf("%s %s (%s)\n", this.getName(), getSecondary().doAction(), ally.getName());
        this.decreaseBuffDurationOrDelete();
        this.getSquad().adToNormal(this);
    }
}
