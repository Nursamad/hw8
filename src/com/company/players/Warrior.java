package com.company.players;

import com.company.general.RPG_GAME;

public class Warrior extends Hero{

    public Warrior(int hp, int damage) {
        super(hp, damage, SuperAbility.CRITICAL_DAMAGE);

    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
int coeff = RPG_GAME.random.nextInt(3) + 2;
if (boss.getHp() > 0){
    if (boss.getHp() - (this.getDamage() * coeff) < 0 ){
        boss.setHp(0);
    }else {
        boss.setHp(boss.getHp() - (this.getDamage() * coeff));
    }
    System.out.println(getClass().getSimpleName() + "Critical: " + (this.getDamage() * coeff));
}
    }

}
