package org.example.tp.d.exo;

public class Demo {
    public static void main(String[] args) {
        Engine electricEngine = new ElectricEngine();
        Car electricCar = new Car(electricEngine);
        electricCar.start();

        Engine gasolineEngine = new GasolineEngine();
        Car gasolineCar = new Car(gasolineEngine);
        gasolineCar.start();
    }
}