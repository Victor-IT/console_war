package com.vitkulov.console_war.model.unit.undead;

import com.vitkulov.console_war.model.Unit;
import com.vitkulov.console_war.model.unit.Mage;
import com.vitkulov.console_war.model.weapon.MagicStaff;

public class UndeadNecromancer extends Mage {

    public UndeadNecromancer() {
        // Установим начальное оружие и силу урона
        setPrimaryWeapon(new MagicStaff(5)); // атаковать магией : урон 5 ед.
    }

    @Override
    public void doAction1() {
        // todo: ввести классы навыки-скилы
        // todo: ввести учёт времени действия скила
        // уменьшение силы урона персонажа противника на 50% на один ход
        Unit enemy = game.getEnemy(this);
        enemy.setDamageMod(0.5);
        System.out.printf("%s %s (%s)\n\n", this.getName(), "наслал недуг на противника ", enemy.getName());
        this.getSquad().adToNormal(this);
    }
}
