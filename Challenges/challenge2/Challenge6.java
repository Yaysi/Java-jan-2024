package Challenges.challenge2;

import Curs15.curs.Product;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class Challenge6 {
    public static void main(String[] args) {
        LinkedList<orase> cities1 = new LinkedList<>();
        orase oras1 = new orase("New York");
        orase oras2 = new orase("Casablanca");
        orase oras3 = new orase("London");
        orase oras4 = new orase("Miami");
        orase orase5 = new orase("Bucharest");
        cities1.add(oras1);
        cities1.add(oras2);
        cities1.add(oras3);
        cities1.add(oras4);

        for (int i = 0; i < cities1.size(); i++) {
            if (cities1.get(i).nomdeoras.equals(orase5)) {
                cities1.remove(i);
            }


        }

        for (orase list5 : cities1){
            System.out.println(list5.nomdeoras);
        }
    }
}
