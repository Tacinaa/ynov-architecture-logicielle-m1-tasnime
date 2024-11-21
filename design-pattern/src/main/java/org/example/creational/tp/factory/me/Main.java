package org.example.creational.tp.factory.me;

public class Main {
    public static void main(String[] args) {
        Character warrior = CharacterFactory.createCharacter("warrior","Ike");
        Character mage = CharacterFactory.createCharacter("mage","Daraen");
        Character archer = CharacterFactory.createCharacter("archer","Ines");

        System.out.println("Attributs de " + warrior.getName() + " : PV = " + warrior.getHealth() + ", ATK = " + warrior.getAttack());
        System.out.println("Attributs de " + mage.getName() + " : PV = " + mage.getHealth() + ", ATK = " + mage.getAttack());
        System.out.println("Attributs de " + archer.getName() + " : PV = " + archer.getHealth() + ", ATK = " + archer.getAttack());
    }
}
