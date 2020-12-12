package com.javafundamentals.classesandobjects;

public class Iphone {
    private IphoneModel model;
    private double price;
    private boolean isWaterResistant;

    public Iphone() {
    }

    public Iphone(IphoneModel model, double price) {
        this.model = model;
        this.price = price;
    }

    public Iphone(IphoneModel model) {
        this(model, 0.0, false);
        this.model = model;
    }

    public Iphone(IphoneModel model, double price, boolean isWaterResistant) {
        this.model = model;
        this.price = price;
        this.isWaterResistant = isWaterResistant;
    }

    public IphoneModel getModel() {
        return model;
    }

    public void setModel(IphoneModel model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isWaterResistant() {
        return isWaterResistant;
    }

    public void setWaterResistant(boolean waterResistant) {
        isWaterResistant = waterResistant;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", isWaterResistant=" + isWaterResistant +
                '}';
    }
}
