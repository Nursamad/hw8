package com.company.players;

public class Boss extends GameEntity {

    private boolean deafen;

    public Boss(int hp, int damage) {
        super(hp, damage);
    }

    public boolean isDeafen() {
        return deafen;
    }

    public void setDeafen(boolean deafen) {
        this.deafen = deafen;
    }
}
