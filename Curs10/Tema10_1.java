package Curs10;

import java.util.Scanner;

public class Tema10_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n ;
        do {
            System.out.println("Enter a number between  10 and 20 : ");
            n= in.nextInt();

        }
        while (n<10 || n>20);
        System.out.println(n+ " is between 10 and 20.");
    }
}
