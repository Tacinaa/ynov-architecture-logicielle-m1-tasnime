package org.example.creational.tp.factory.me;

public class Mage extends Character {
    public Mage(String name) {
        super(name, 100, 70);
    }

    @Override
    public void useSpecialSkill() {
        System.out.println(getName() + "Feu");
    }
}