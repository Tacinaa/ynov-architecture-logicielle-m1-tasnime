package org.example.creational.tp.builder.me;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private final String model;
    private final String color;
    private final String engine;
    private final int seats;
    private final List<String> extras;

    private Car(CarBuilder builder) {
        this.model = builder.model;
        this.engine = builder.engine;
        this.color = builder.color;
        this.seats = builder.seats;
        this.extras = builder.extras;
    }

    public void displayCar() {
        System.out.println("Modèle : " + model);
        System.out.println("Moteur : " + engine);
        System.out.println("Couleur : " + color);
        System.out.println("Nombre de sièges : " + seats);
        System.out.println("Extras : " + (extras.isEmpty() ? "Aucun" : String.join(", ", extras)));
    }

    public static class CarBuilder{
        private String model;
        private String engine;
        private int seats;
        private List<String> extras = new ArrayList<String>();
        private String color = "aucune";

        public CarBuilder setModel(String model){
            CarBuilder builder = new CarBuilder();
            builder.model = model;
            return builder;
        }

        public CarBuilder setEngine(String engine){
            this.engine = engine;
            return this;
        }

        public CarBuilder setSeats(int seats){
            this.seats = seats;
            return this;
        }

        public CarBuilder addExtra(String extra) {
            this.extras.add(extra);
            return this;
        }

        public CarBuilder setColor(String color){
            this.color = color;
            return this;
        }

        public Car build(){
            if (model == null || engine == null || seats <= 0) {
                throw new IllegalArgumentException("Modèle, moteur et nombre de sièges sont obligatoires");
            }
            if (model.equalsIgnoreCase("Sport") && engine.equalsIgnoreCase("Électrique")) {
                throw new IllegalArgumentException("Un modèle Sport ne peut pas avoir un moteur électrique");
            }
            if (model.equalsIgnoreCase("SUV") && seats < 5) {
                throw new IllegalArgumentException("Un SUV doit avoir au moins 5 sièges");
            }
            return new Car(this);
        }
    }
}
