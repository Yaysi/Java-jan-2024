package Curs12.Tema;

import java.util.Arrays;
import java.util.Random;

public class Challenge12 {
    public static void main(String[] args) {

        int [][] names = {{1,2},{3,5},{5,7}};
        System.out.println(names [0][1] + names [1][1]);

        String[][] prenoms = {{"Ismail","Mouataz"},{"Karima","Mohamed"},{"Lavina","Sayah"},{"Doha","Ziad"}};
        System.out.println(prenoms[0][0]+ " "+ prenoms[2][0]);
        String []numbers= {"Bucuresti","Cluj","Iasi"};
        Arrays.sort(numbers);
        for (String n :numbers){
            System.out.println(n + " ");
        }
        int search = Arrays.binarySearch(numbers,"Cluj");
        System.out.println(search);

        String [] fruits = {"Pomme", "Bannane","Fraise"};
        System.out.println(fruits[1]);
        String[]listedefruit = Arrays.copyOfRange(fruits,0,3);

        for (String listanoua: listedefruit){
            System.out.println(listanoua);
        }

        Random random =new Random();
        int hola = random.nextInt(1,1000);
        System.out.println(hola);

        }


    }
