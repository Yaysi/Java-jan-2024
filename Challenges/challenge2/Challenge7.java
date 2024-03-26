package Challenges.challenge2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Challenge7 {

    public static void main(String[] args) {

        LinkedList <String> list1 = new LinkedList<>();
        list1.add("Hello");
        ArrayList <String> list2 = new ArrayList<>(list1);
        for (String list3 : list2) {
            System.out.println(list3);
        }

    }
}
