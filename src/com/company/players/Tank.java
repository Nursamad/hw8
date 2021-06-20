package com.company.players;

public class Tank extends Hero {

    public Tank(int hp, int damage) {
        super(hp, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if (boss.getHp() - boss.getDamage() > 0)
            boss.setHp(boss.getHp() - boss.getDamage());
    }
}
