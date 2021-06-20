package com.company.players;

import com.company.general.RPG_GAME;

import java.util.IllegalFormatCodePointException;

public class Thor extends Hero {

    public Thor(int hp, int damage) {
        super(hp, damage, SuperAbility.DEAFEN);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        boss.setDeafen(RPG_GAME.random.nextBoolean());
        if (boss.isDeafen()) {
            System.out.println("Boss is deafened! ");
        }
    }
}
