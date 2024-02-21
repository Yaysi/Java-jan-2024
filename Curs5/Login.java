package Curs5;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String username;
        String password;
        username = "Ismail";
        password = "1234";

        Scanner in = new Scanner(System.in);
        System.out.println(" Enter your user name : ");
         username = in.next();
        System.out.println("Enter your password : ");
        password = in.next();
        if (username.equals(username) && password.equals(password)) {

            System.out.println("Access Granted! Welcome!");
        } else if ((!username.equals(username) && !password.equals(password))) {
            System.out.println("Invalid");
            
        }
    }
}
