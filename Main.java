import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of a rectangle : ");
        int length = in.nextInt();
        System.out.println("Enter the breadth of a rectangle : ");
        int breadth = in.nextInt();
        int area = length*breadth;
       System.out.println("The area of a rectangle is : "+area );

        Scanner number = new Scanner(System.in);
        System.out.println("Write your first number : ");
        int number1 = number.nextInt();
        System.out.println("Write your second number : ");
        int number2 = number.nextInt();
        double result = number1/number2;

        System.out.println(" the result is "+ result);

        if (number1 > 0) {
            System.out.println(" this number is positive");}
             else if (number1<0){
                System.out.println("the number is negative " +number1);}

             else System.out.println("the number = Zero");






    }
}
