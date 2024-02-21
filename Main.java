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
    }
}
