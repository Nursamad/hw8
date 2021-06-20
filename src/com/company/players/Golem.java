package com.company.players;

public class Golem extends Hero {
    public Golem(int hp, int damage) {
        super(hp, damage, SuperAbility.DEFENDER);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int partBossDamage = boss.getDamage() / 5;
        if (this.getHp() < 0) {
            this.setHp(0);
        }
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHp() > 0) {
                this.setHp(this.getHp() - partBossDamage);
                heroes[i].setHp(heroes[i].getHp() + partBossDamage);
            }
        }
        System.out.println("Golem took part of the damage");
    }
}
