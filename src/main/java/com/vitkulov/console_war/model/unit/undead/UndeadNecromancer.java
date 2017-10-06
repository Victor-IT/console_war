package com.vitkulov.console_war.model.unit.undead;

import com.vitkulov.console_war.model.Skill;
import com.vitkulov.console_war.model.Unit;
import com.vitkulov.console_war.model.skill.Ailment;
import com.vitkulov.console_war.model.unit.Mage;
import com.vitkulov.console_war.model.weapon.MagicStaff;

public class UndeadNecromancer extends Mage {

    public UndeadNecromancer() {
        // Установим начальное оружие и силу урона
        setPrimary(new MagicStaff(5)); // атаковать магией : урон 5 ед.
        setSecondary(new Ailment(0, 1)); // наслать недуг на противника
    }

    @Override
    public void action2() {
        // наслать недуг на противника
        Unit enemy = game.getEnemy(this);
        enemy.addBuff((Skill) getSecondary());
        enemy.checkAndApplyBuff();
        System.out.printf("%s %s (%s)\n", this.getName(), getSecondary().doAction(), enemy.getName());
        this.getSquad().adToNormal(this);
    }
}
