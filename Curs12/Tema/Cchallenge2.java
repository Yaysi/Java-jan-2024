package Curs12.Tema;

import java.util.Scanner;

public class Cchallenge2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numdeutilizator =0.0;
        while (numdeutilizator<10){
            System.out.println("Enter the user number: ");
           numdeutilizator= scanner.nextInt();
        }
        System.out.println("Le numero de utilisateur est "+ numdeutilizator);
    }
}
