package org.example.creational.tp.prototype.me;

public class CarModel extends Model3D {

    public CarModel(String size, String color, String texture) {
        super(size, color, texture);
    }

    @Override
    public Model3D cloneModel() {
        return new CarModel(this.size, this.color, this.texture);
    }
}