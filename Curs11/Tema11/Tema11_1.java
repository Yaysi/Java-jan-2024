package Curs11.Tema11;

public class Tema11_1 {
    public static void main(String[] args) {
        //Create a Java program that uses a do-while loop to print numbers from 10 to 1 in descending order.

        int index = 10;
//        while (index>=1){
//            System.out.println(index);
//            index--;

        do {
            System.out.println(index);
            index--;
        }
        while (index>=1);

    }
}

