package Curs13.Tema;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class challenge1_ {

    public static void main(String[] args) {

        LocalDate data = LocalDate.now();
        LocalDate plusdays =  data.plusDays(10);
        System.out.println(plusdays.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));

        String name = "Oreo";
        System.out.println(name.charAt(2));
    }
}
