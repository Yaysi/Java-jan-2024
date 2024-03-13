package Curs13.Curs;

import java.util.Arrays;
import java.util.Random;

public class Curs13 {
    public static void main(String[] args) {
//        Random random = new Random();
//        System.out.println("Enter your random number");
//        int random_number = random.nextInt(0,1000);
//        System.out.println(random_number);
//        System.out.println(random.nextInt(1,120));
//        int numarulnou = Math.max(10,50);
//        System.out.println(numarulnou);
//
//        int oui [] = new int[]{10,20,30,60};
//        int denumirea = oui.length;
//        System.out.println(denumirea);
//
        String [] nom = new String[]{"Hello", "it's me", "How are you"};

//        int numarudeelement [][] = {{1,2 }, {1,5} ,{5,8,5,5,5,5,5,5,6,6,6,6,} , {11,112,155,56887,7,88}};
//        System.out.println(numarudeelement[2][1]);

        for (int index =0;index<nom.length ; index++ ){

            System.out.println(nom[index]);
        }

        String[] copy= {"coffe", "tea", "ville", "Happiness", "Life"};

        String [] copy1 = Arrays.copyOfRange(copy, 1,5);
        for (String cofe :copy1 ) {
            System.out.println(cofe + " ");
        }







    }

}
