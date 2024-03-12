package Curs13.Curs;

public class Curs13 {
    public static void main(String[] args) {

        int[][] numaru = {{5, 6}, {4, 6}};
        System.out.println(numaru.length);

        String[] fruct = {"mare", "banane", "fraise"};
        for (int index = 0; index < fruct.length; index++) {
            System.out.println(fruct[index]);


            System.out.println(fruct[index].replace("banane", "Banana"));

        }
    }
}