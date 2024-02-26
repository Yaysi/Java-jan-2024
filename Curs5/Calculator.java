package Curs5;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        String name = "Alex";
        String motdepasse = "12345";
        System.out.println("Enter your user name: ");
        String username = in.next();
        System.out.println("Enter the password: ");
        String password = in.next();

        if (name.equals(username)) {
            if (motdepasse.equals(password)) {
                System.out.println("Access granted");
            } else {
                System.out.println("Please check your password");
            }
        } else {
            System.out.println("Please check your user name");
        }
    }}
