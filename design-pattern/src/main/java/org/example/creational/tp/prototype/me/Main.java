package org.example.creational.tp.prototype.me;

public class Main {
    public static void main(String[] args) {
        HouseModel house = new HouseModel("Grande", "Blanc", "Brique");
        System.out.println("Modèle original : Maison");
        house.displayDetails();

        HouseModel clonedHouse = (HouseModel) house.cloneModel();
        clonedHouse.color = "Bleu";
        System.out.println("\nModèle dupliqué : Maison personnalisée");
        clonedHouse.displayDetails();

        System.out.println("\n----------------------\n");

        CarModel car = new CarModel("Compacte", "Rouge", "Métal");
        System.out.println("Modèle original : Voiture");
        car.displayDetails();

        CarModel clonedCar = (CarModel) car.cloneModel();
        clonedCar.size = "Sportive";
        System.out.println("\nModèle dupliqué : Voiture personnalisée");
        clonedCar.displayDetails();
    }
}
