package Curs10;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int numero = in.nextInt();

        int a = numero;
        switch (a){
            case 100 :
                System.out.println("the number is higher than 100");

            case 200:
                System.out.println("Yes man");

            default:
                System.out.println("non");

        }

    }
}

