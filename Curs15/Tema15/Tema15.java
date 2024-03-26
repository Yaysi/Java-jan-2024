package Curs15.Tema15;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

public class Tema15 {
    public static void main(String[] args) {

        LocalDateTime currenttime = LocalDateTime.now();
        LocalDateTime nexttime = currenttime.plusMinutes(330);
        System.out.println(nexttime);
        Random random = new Random();
        System.out.println(random.nextInt(1,100));

        ArrayList <String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("orange");
        list1.add("bannane");
        list1.add("fraise");



        Random rndm = new Random();
        // creating object
        String rndmElem = list1.get(rndm.nextInt(list1.size()));
        System.out.println("Selecting a random element from the list : " + rndmElem);

        System.out.println(list1.size());
    }
}




