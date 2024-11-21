package org.example.creational.tp.factory;

public class Archer extends Character {
    public Archer(String name) {
        super(name, 150, 60);
    }

    @Override
    public void useSpecialSkill() {
        System.out.println(getName() + "Tire de flèche");
    }
}