package com.javafundamentals.classesandobjects;


enum Transport {
    PLANE(600), TRAIN(80), AUTOMOBILE(50);

    int speed;

    Transport(int s) {
        speed = s;
    }

}


public class Enum {
    public static void main(String[] args) {
//         Transport tb = Transport.PLANE;
//         if(tp == Transport.PLANE) {
//             System.out.println("something");
//         }
//
//        Transport allTransports[] = Transport.values();
//        for(Transport T : allTransports){
//            System.out.println("print");
//        }

        System.out.println(Transport.AUTOMOBILE.speed);

        Transport tp = Transport.TRAIN;
        System.out.println(tp.ordinal());

        if(tp.ordinal() < 2)
            System.out.println("Not an automobile");

    }
}
