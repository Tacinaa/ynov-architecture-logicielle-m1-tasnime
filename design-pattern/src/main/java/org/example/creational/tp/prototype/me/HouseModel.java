package org.example.creational.tp.prototype.me;

public class HouseModel extends Model3D {

    public HouseModel(String size, String color, String texture) {
        super(size, color, texture);
    }

    @Override
    public Model3D cloneModel() {
        return new HouseModel(this.size, this.color, this.texture);
    }
}