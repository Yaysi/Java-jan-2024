package Curs12.Tema;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Tema12 {
    public static void main(String[] args) {


        LocalDateTime givendate = LocalDateTime.of(2024, 02, 17, 15, 20);
        LocalDate oui = givendate.toLocalDate();
        LocalTime minut = givendate.toLocalTime();
        System.out.println("date: "+ oui);
        System.out.println("time: "+ minut);

        String datatimp = "2020-10-15 10:20:15";
        DateTimeFormatter of = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime variable = LocalDateTime.parse(datatimp,of);
        System.out.println(variable);

        String neee = "2024-03-01 15:20:30";
        DateTimeFormatter variable1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime oii= LocalDateTime.parse(neee,variable1);
        System.out.println(oii);



    }
}
