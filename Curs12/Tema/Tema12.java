package Curs12.Tema;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Tema12 {
    public static void main(String[] args) {
//        String hello = "Hello";
//        System.out.println(hello.length());
////        Create a Java program that finds and prints the character at a given index(2) in a string.
//
//        Date incrementdate = new Date("1988-09-29");

        LocalDateTime currentDateTime = LocalDateTime.now();

        LocalDateTime givenDateTime = LocalDateTime.of(2024, 2, 3, 13, 33);

        if (givenDateTime.isBefore(currentDateTime)) {
            System.out.println("Given date-time is before the current date-time.");
        } else if (givenDateTime.isAfter(currentDateTime)) {
            System.out.println("Given date-time is after the current date-time.");

        }
    }

    }
//LocalDateTime givenDateTime = LocalDateTime.of(2024, 2, 3, 13, 30);
//LocalDate date = givenDateTime.toLocalDate();
////        LocalTime time = givenDateTime.toLocalTime():
//
//        System.out.println("Date: " + date);
//        System.out.println("Time: " + time)

//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//LocalDateTime.parse(dateTimeString, formatter);