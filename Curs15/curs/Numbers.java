package Curs15.curs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {



        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>(list);
        System.out.println(list1);

    }
}
