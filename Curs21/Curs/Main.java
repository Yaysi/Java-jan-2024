package Curs21.Curs;

import java.util.*;

public class Main {
    public static void main(String[] args) {

       HashMap <Integer , String > Cities = new HashMap<>();
       Cities.put(1 ,"Bucharest");
       Cities.put(2 ,"Dublin");
       Cities.put(3 ,"New York");
       Cities.put(4 ,"Nimic");
       Cities.put(5 ,"Jakarta");

        List <Integer> lisofnumber=  new ArrayList<>(List.of(7,8,4,5,9,1));
        Collections.sort(lisofnumber);

        List<String> listofemployee = new ArrayList<>(List.of("Maria","Ramona","Marius","Stefane","Roxana"));

        listofemployee.forEach(list -> {

            System.out.println(list);

        });

        System.out.println("Hello");



        lisofnumber.forEach(number-> {

            System.out.println(number );

                });



    }
}
