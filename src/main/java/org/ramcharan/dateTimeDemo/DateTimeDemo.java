package org.ramcharan.dateTimeDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeDemo {
    public static void main(String[] args) {

        System.out.println(formatter(1));

    }

    public static String formatter(int number){
        //Convert number to 4 digits string example 0001,0023,0678...
        String formattedNumber = String.format("%04d", number);
        System.out.println("formattedNumber: " + formattedNumber);

        Date date = new Date();
        System.out.println("currentDate: " + date);

        //Give a pattern to the date.
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = sdf.format(date);
        System.out.printf("formattedDate: %3s\n" , formattedDate);

        //Give a pattern to the date. This is optional.
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");
        String formattedTime = time.format(date);
        System.out.printf("Time: %17s \n" , formattedTime);

        //Concat both the strings.
        String result = formattedDate + formattedNumber;

        return "Result: " + result ;
    }
}
