package org.example.creational.tp.prototype.me;

public class PlaneModel extends Model3D {

    public PlaneModel(String size, String color, String texture) {
        super(size, color, texture);
    }

    @Override
    public Model3D cloneModel() {
        return new PlaneModel(this.size, this.color, this.texture);
    }
}