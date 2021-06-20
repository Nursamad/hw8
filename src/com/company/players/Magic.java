package com.company.players;

import com.company.general.RPG_GAME;

public class Magic extends Hero {

    public Magic(int hp, int damage) {
        super(hp, damage, SuperAbility.BOOST);

    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int addAttackDamage = RPG_GAME.random.nextInt(2) + 3;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHp() > 0) {
                if (!heroes[i].getAbility().equals(SuperAbility.BOOST)) {
                    heroes[i].setDamage(heroes[i].getDamage() + addAttackDamage);
                }
            }
        }
        System.out.println(getClass().getSimpleName() + " add attack damage: " + addAttackDamage);

    }

}
