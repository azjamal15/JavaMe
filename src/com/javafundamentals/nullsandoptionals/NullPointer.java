package com.javafundamentals.nullsandoptionals;

public class NullPointer {
    public static void main(String[] args) {
//        var brand = "azamcodes";
//        System.out.println(brand.toUpperCase());
//        String brand2 = null;
//        //System.out.println(brand2.toUpperCase());
//        System.out.println(brand2);
//        Integer integer = null;

        //How to handle null values


        String brand = null;
        String str = "Azam";

        //Method 1: Conditional Check
        if(brand != null) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println("Brand is null.");
        }

        //Method 2: Try-Catch
        try {
            System.out.println(brand.toUpperCase());
        } catch(NullPointerException e) {
            System.out.println("Brand is null");
        }

    }
}
