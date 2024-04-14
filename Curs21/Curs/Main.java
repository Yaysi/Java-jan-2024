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

       String City = Cities.get(1);
        System.out.println(City);




        List <Integer> lisofnumber=  new ArrayList<>(List.of(7,8,4,5,9,1));
        Collections.sort(lisofnumber);

        lisofnumber.forEach(number-> {

            System.out.println(number );

                });



    }
}
