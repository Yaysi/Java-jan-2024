package Challenges.challenge2;

import java.util.ArrayList;

public class Challenge1_2 {
    public static void main(String[] args) {
        String[] shoppinglist = {"Croissant", "Shampo", "layz"};
        for (String shoppin : shoppinglist) {
            System.out.println(shoppin);
        }

        System.out.println("Chrismas list is: ");

        ArrayList<String> chrismaslist = new ArrayList<>();
        chrismaslist.add("lambo");
        chrismaslist.add("iphone16");
        chrismaslist.add("mountai bike");
        chrismaslist.add("big house");

        for (String chrismas :chrismaslist){
            System.out.println(chrismas);
        }

    }
}