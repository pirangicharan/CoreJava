package org.ramcharan.dateTimeDemo;

import java.time.*;

public class DateTimeBasics {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime + " | LocalTime");

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate + " | LocalDate");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime + " | LocalDateTime");

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime + " | ZonedDateTime");

        Instant instant = Instant.now();
        System.out.println(instant + " | Instant");
    }
}
