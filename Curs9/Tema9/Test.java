package Curs9.Tema9;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number please: ");
        int n = in.nextInt();
        int number_par = 0;
        int number_impar = 0;
        for (int index = 1; index <= n; index++) {
            if (index % 2 == 0) {
                System.out.println("This is a par number " + index);
                number_par++;

            } else{
                System.out.println("the number is an impar number " + index);
                number_impar++;}

        }
        System.out.println(" The total of par numbers is  "+number_par);
        System.out.println("The total of impar numbers is "+number_impar);




    }
}