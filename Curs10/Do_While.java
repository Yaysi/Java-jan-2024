package Curs10;

import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = in.nextInt();

        for (int n = 10;
        n < number;
        n++)
        do {
            System.out.println("10");
            n++;

        }
        while ( n<number);
        System.out.println("the number is bigger than 10");
    }
}
