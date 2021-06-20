package com.company.players;

public class Medic extends Hero{
    private int healPoints;

    public Medic(int hp, int damage, int healthPoints) {
        super(hp, damage, SuperAbility.HEAL);
        this.healPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healPoints = healthPoints;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getAbility().equals(SuperAbility.HEAL)){
                heroes[i].setHp(heroes[i].getHp() + healPoints);
            }
        }
    }

}
