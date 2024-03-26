package Challenges.challenge2;

import Curs15.curs.Product;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class challenge5 {
    public static void main(String[] args) {

        ArrayList <orase> cities = new ArrayList<>();
        orase oras1 = new orase("New York");
        orase oras2 = new orase("Casablanca");
        orase oras3 = new orase("London");
        orase oras4 = new orase("Miami");
        cities.add(oras1);
        cities.add(oras2);
        cities.add(oras3);
        cities.add(oras4);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you city name: ");
        orase ville = new orase(scan.next());


        for (int i =0; i< cities.size(); i++){

            if (cities.get(i).nomdeoras.equals(ville)){
                System.out.println("Duplicate");
                break;

            }

            for (orase nom : cities){
                System.out.println(nom.nomdeoras);
            }

        }

    }

}
