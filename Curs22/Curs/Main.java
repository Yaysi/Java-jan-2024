package Curs22.Curs;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer , String > Cities = new HashMap<>();
        Cities.put(1 ,"Bucharest");
        Cities.put(2 ,"Dublin");
        Cities.put(3 ,"New York");
        Cities.put(4 ,"Nimic");
        Cities.put(5 ,"Jakarta");

        String City = Cities.get(1);
        System.out.println(City);


       for (Map.Entry<Integer,String> entry : Cities.entrySet()){
           int key = entry.getKey();
           String value = entry.getValue();
           System.out.println("This is the number "+ key+ " Of my beautiful city "+ value);       }

    }
}
