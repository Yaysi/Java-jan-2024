package Challenges.challenge1;

import java.util.ArrayList;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Adauga un grade");

        int counter = 0;
        int total = 0;
        ArrayList<Class> list;
        while (counter < 3) {
            int grade = scanner.nextInt();
            total = total + grade;
            counter++;
            list = new ArrayList<>();
            Class elev = new Class("Noah", 1, grade);
            Class elev1 = new Class("Mike", 1, grade);
            Class elev2 = new Class("Alex", 3, grade);
        }


        }


    }
