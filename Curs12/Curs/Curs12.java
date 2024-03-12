package Curs12.Curs;


import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;


public class Curs12 {

    public static void main(String[] args) {

        StringBuilder ok = new StringBuilder(" Hello Ismail , how are you today? ");
        ok.append("I heard tha you are super riche ");
        System.out.println(ok);
        System.out.println(ok.indexOf("e"));
        System.out.println(ok.substring(0, 13));
        System.out.println(ok.insert(0, "Its a beautiful day today,"));

        int suma = 155;
        String ville = String.valueOf(suma);
        System.out.println(ville);

        LocalDateTime ora = LocalDateTime.now();
        System.out.println(ora.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")));


    }
}
