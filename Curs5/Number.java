package Curs5;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int x = in.nextInt();
        System.out.println("enter your second number : ");
        int y = in.nextInt();
        System.out.println("Enter your third number : ");
        int z = in.nextInt();

        if (x>y)
            if (x>z){
                System.out.println( "  the largest number is ");
            }  if (y>x) if (y>z) {
            System.out.println( "  the largest number is "+y);
                
            }
        else System.out.println(" The largest is" +z);

    }
}
