package com.javafundamentals.classesandobjects;

public enum IphoneModel {
    IPHONE_7_PLUS("Iphone 7+"),
    IPHONE_7("Iphone 7"),
    IPHONE_X("Iphone X");

    private String modelString;

    IphoneModel(String model) {
        this.modelString = model;
    }

    public String getModelString() {
        return modelString;
    }
}
