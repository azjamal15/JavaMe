package com.javafundamentals.nullsandoptionals;

import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        String brand = null;
        //Optional.of(brand); //when you know value will not be null. gives NPE b/c brand is null
        String theBrand = Optional.ofNullable(brand)
                .orElse("Brand is null");
        System.out.println(theBrand); //prints Brand is null to console

        String aBrand = Optional.ofNullable(brand)
                .map(String::toUpperCase)
                .orElseGet(() -> {
                    //logic
                    return "Samsung";
                });
    }
}
