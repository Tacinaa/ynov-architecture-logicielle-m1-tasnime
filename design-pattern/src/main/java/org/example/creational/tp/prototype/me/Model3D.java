package org.example.creational.tp.prototype.me;

public abstract class Model3D {
    protected String size;
    protected String color;
    protected String texture;

    public Model3D(String size, String color, String texture) {
        this.size = size;
        this.color = color;
        this.texture = texture;
    }

    public void displayDetails() {
        System.out.println("Taille : " + size);
        System.out.println("Couleur : " + color);
        System.out.println("Texture : " + texture);
    }

    public abstract Model3D cloneModel();
}
