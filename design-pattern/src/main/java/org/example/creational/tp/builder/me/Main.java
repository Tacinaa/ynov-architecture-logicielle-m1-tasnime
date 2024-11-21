package org.example.creational.tp.builder.me;

public class Main {
    public static void main(String[] args) {
        try {
            Car suv = new Car.CarBuilder()
                    .setModel("SUV")
                    .setEngine("Hybride")
                    .setColor("Bleu")
                    .setSeats(7)
                    .addExtra("GPS")
                    .addExtra("Toit ouvrant")
                    .build();
            suv.displayCar();

            Car sportCar = new Car.CarBuilder()
                    .setModel("Sport")
                    .setEngine("Électrique")
                    .setColor("Rouge")
                    .setSeats(2)
                    .build();
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        try {
            Car invalidSUV = new Car.CarBuilder()
                    .setModel("SUV")
                    .setEngine("Essence")
                    .setSeats(4)
                    .build();
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}