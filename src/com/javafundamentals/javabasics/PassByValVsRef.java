package com.javafundamentals.javabasics;

import java.awt.*;

public class PassByValVsRef {
    public static void main(String[] args) {
        int x = 0;
        int y = incrementValue(x);
        System.out.println(y);
        Point point = new Point(100, 100);
        changePoint(point);
        System.out.println(point);
    }

    static void changePoint(Point point) {
        point.x = 0;
        point.y = 0;
    }

    static int incrementValue(int value) {
        return value + 1;
    }

    static void incrementValueSad(int value) {
        value++; //willnotwork
    }
}
