package com.company.general;

import com.company.players.*;

import java.util.Random;

public class RPG_GAME {

    public static Random random = new Random();

    public static void start() {
        Boss boss = new Boss(2000, 80);
        Warrior warrior = new Warrior(500, 100);
        Magic magic = new Magic(400, 80);
        Medic medic = new Medic(300, 30, 30);
        Tank tank = new Tank(600, 55);
        Medic youngMedic = new Medic(200, 10, 20);
        Golem golem = new Golem(500, 20);
        Thor thor = new Thor(400, 80);

        Hero[] heroes = {warrior, magic, medic, tank, youngMedic, golem, thor};

        printStatistics(boss, heroes);

        while (!isFinished(boss, heroes) && boss.getHp() > 0) {
            round(boss, heroes);
        }
    }

    public static void printStatistics(Boss boss, Hero[] heroes) {
        System.out.println("________________________________");
        System.out.println("Boss health: " + boss.getHp());
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].getClass().getSimpleName() + " health: " + heroes[i].getHp() + ";");
        }
        System.out.println("________________________________");
    }

    public static void round(Boss boss, Hero[] heroes) {
        if (!boss.isDeafen()) {
            bossHits(boss, heroes);
        }
        heroesApplySuperAbilities(boss, heroes);
        heroesHits(boss, heroes);
        printStatistics(boss, heroes);


    }


    private static boolean isFinished(Boss boss, Hero[] heroes) {
        if (boss.getHp() <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        boolean allHeroesDied = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes.length > 0) {
                allHeroesDied = false;
                break;

            }
        }
        if (allHeroesDied) {
            System.out.println("Boss won!!!");
        }
        return allHeroesDied;
    }

    private static void bossHits(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHp() >= 0) {
                heroes[i].setHp(heroes[i].getHp() - boss.getDamage());
            }
        }
    }

    private static void heroesHits(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (boss.getHp() >= 0) {
                boss.setHp(boss.getHp() - heroes[i].getDamage());
            }
        }
    }

    private static void heroesApplySuperAbilities(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHp() > 0) {
                heroes[i].applySuperAbility(boss, heroes);
            }
        }
    }
}
