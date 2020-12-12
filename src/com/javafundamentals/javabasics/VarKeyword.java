package com.javafundamentals.javabasics;

import java.awt.*;
import java.time.LocalDate;

public class VarKeyword {
    public static void main(String[] args) {
        //	    String name = "Jamil";
//	    Point point = new Point(10, 10);
//	    double PI = Math.PI;
//	    int age = 10;
//	    LocalDate now = LocalDate.now();

        var name = "Jamil";
        var point = new Point(10, 10);
        var PI = Math.PI;
        var age = 10;
        var now = LocalDate.now();

        System.out.println(name);
    }
}
