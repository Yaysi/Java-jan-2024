package Curs5;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String sysusername = "Ismail";
        String syspassword = "1234";

        System.out.println(" Enter your user name : ");
        String username = in.next();
       System.out.println("Enter your password : ");
        String password = in.next();

        if (sysusername.equals(username)){
           if (syspassword.equals(password)){ System.out.println("Welcome Admin");
        }else {
               System.out.println("Please check your password");
           }}
        else {
            System.out.println("Please check your user name");

        }

        String a = "let's go";
        double result = a.equals("let's go")? 0.5 : 0.25 ;
        System.out.println(result);

   }
}
