package com.company.players;

public abstract class Hero extends GameEntity implements HavingSuperAbiity {

    private SuperAbility ability;


    public Hero(int hp, int damage, SuperAbility ability) {
        super(hp, damage);
        this.ability = ability;
    }

    public SuperAbility getAbility() {
        return ability;
    }

    public void setAbility(SuperAbility ability) {
        this.ability = ability;
    }

}
