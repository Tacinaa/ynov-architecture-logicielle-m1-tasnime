package org.example.creational.tp.factory.me;

public class Warrior extends Character {
    public Warrior(String name) {
        super(name, 200, 80);
    }

    @Override
    public void useSpecialSkill() {
        System.out.println(getName() + "Coup d'épée");
    }
}