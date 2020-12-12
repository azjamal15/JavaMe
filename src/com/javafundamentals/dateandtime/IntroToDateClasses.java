package com.javafundamentals.dateandtime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class IntroToDateClasses {
    public static void main(String[] args) {
//        ZonedDateTime now = ZonedDateTime.now();
//        LocalDateTime nowLDT = LocalDateTime.now();
//        LocalDate localDate = LocalDate.now();
//        LocalTime localTime = LocalTime.now();
//        Instant instant = Instant.now();
//        System.out.println(now);
//        System.out.println(nowLDT);
//        System.out.println(localDate);
//        System.out.println(localTime);
//        System.out.println(instant);

        /* Available Zones */
//        LocalDateTime localDate = LocalDateTime.now(ZoneId.of("America/Merida"));
////        ZoneId.getAvailableZoneIds().forEach(System.out::println);
//        System.out.println(localDate);
//        System.out.println(LocalDateTime.now()); //gets system one

        /* Exploring Date available methods */
        LocalDateTime localDateTime = LocalDateTime.now(); //gives us current date
        LocalDate someDate = LocalDate.of(2000, Month.SEPTEMBER, 1);//setting a date

        System.out.println(someDate.minus(2, ChronoUnit.DECADES));
        System.out.println(someDate.minus(4, ChronoUnit.DAYS));

        System.out.println(someDate.isAfter(localDateTime.toLocalDate()));

        someDate.getYear();
        someDate.getMonth();
        someDate.getDayOfWeek();



    }

}
