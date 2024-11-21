package org.example.creational.tp.factory.me;

public abstract class Character {
    private String name;
    private int PV;
    private int ATK;

    public Character(final String characterName, final int PV, final int ATK) {
        this.name = characterName;
        this.PV = PV;
        this.ATK = ATK;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return ATK;
    }

    public int getHealth() {
        return PV;
    }

    public abstract void useSpecialSkill();
}
