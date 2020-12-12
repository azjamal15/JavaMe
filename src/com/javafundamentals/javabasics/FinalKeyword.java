package com.javafundamentals.javabasics;

import java.awt.*;

public class FinalKeyword {
    public static void main(String[] args) {
        var name = "Anna";
        name = "Alex";
        name = "Jam";
        final Point point = new Point(0, 0);
        point.x = 100;
        point.y = 100;
    }
}
