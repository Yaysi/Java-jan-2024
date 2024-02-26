package Curs9.Tema9;

import java.util.Scanner;

public class Tema9 {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        String value = "A";
        String new_value= "B";
        System.out.println("Enter your value");
         String word= a.next();

        if (value.equals(word))
            { System.out.println("Excellent"); } else if (new_value.equals(word)) {
            System.out.println("Good");


        }
        else System.out.println("Average");


    }
            }



