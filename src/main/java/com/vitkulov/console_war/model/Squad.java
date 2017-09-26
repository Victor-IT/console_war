package com.vitkulov.console_war.model;

import java.util.ArrayList;

/**
 * Класс описывающий структуру отряда как боевой единицы.
 */
public class Squad {
    private String squadName;
    private ArrayList<Unit> buffedSquad = new ArrayList<>();
    private ArrayList<Unit> normalSquad = new ArrayList<>();
    private ArrayList<Unit> deadList = new ArrayList<>();

    public String getSquadName() {
        return squadName;
    }

    public void setSquadName(String squadName) {
        this.squadName = squadName;
    }

    public void adToBuffed(Unit unit) {
        unit.setBuffed(true);
        normalSquad.remove(unit);
        buffedSquad.add(unit);
    }

    public void adToNormal(Unit unit) {
        unit.setBuffed(false);
        buffedSquad.remove(unit);
        normalSquad.add(unit);
    }

    public void adToDeadList(Unit unit) {
        unit.setBuffed(false);
        buffedSquad.remove(unit);
        normalSquad.remove(unit);
        deadList.add(unit);
    }

    public void makeTurn() {
        if (buffedSquad.size() > 0) {
            buffedSquad.get((int) (Math.random() * buffedSquad.size())).doActions();
        } else if (normalSquad.size() > 0) {
            normalSquad.get((int) (Math.random() * normalSquad.size())).doActions();
        } else {
            System.out.println("Отряд " + squadName + " повержен!");
        }
    }

    /**
     * Получить рандомного юнита из отряда
     *
     * @return random unit from squad
     */
    public Unit getRandomUnit() {
        ArrayList<Unit> units = new ArrayList<>();
        units.addAll(buffedSquad);
        units.addAll(normalSquad);
        return units.get((int) (Math.random() * units.size()));
    }

    /**
     * Проверить наличие живых юнитов в отряде
     *
     * @return true if are alive in squad OR false if all dead
     */
    public boolean check() {
        return (buffedSquad.size() == 0 && normalSquad.size() == 0);
    }
}
