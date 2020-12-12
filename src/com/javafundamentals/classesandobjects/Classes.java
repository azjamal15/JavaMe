package com.javafundamentals.classesandobjects;

public class Classes {
    public static void main(String[] args) {
        Iphone iphone7Plus = new Iphone(IphoneModel.IPHONE_7_PLUS, 100.00, true);
//        Iphone iphoneXMax = new Iphone();
//
//        iphoneXMax.setModel("X Max");
//        iphoneXMax.setPrice(1300.00);
//        iphoneXMax.setWaterResistant(true);

        System.out.println(iphone7Plus.getModel().getModelString());



//        System.out.println(iphone7Plus.getModel());
//        System.out.println(iphone7Plus.getPrice());
//        System.out.println(iphone7Plus.isWaterResistant());
        System.out.println(iphone7Plus.toString());

    }
}
