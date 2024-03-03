package Curs10;

import java.util.Scanner;

public class Tema10 {

    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        System.out.println("enter your number : ");
        int num= in.nextInt();

        for (int index =1; index<=num; index++){
            if (index==10){
                System.out.println("10");
            } else if (index==100) {
                System.out.println("100");

            } else if (index==900) {
                System.out.println("900");
            }
        }
    }
}
