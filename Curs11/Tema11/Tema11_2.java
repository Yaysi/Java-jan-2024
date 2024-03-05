package Curs11.Tema11;

public class Tema11_2 {
    public static void main(String[] args) {
        int parnumber = 0;

        for (int index = 2; index <= 20; index++) {

            if (index % 2 == 0) {
                System.out.println("Par number " + index);
                parnumber++;
            }
        }
        System.out.println("Par numbers " + parnumber);



    }
}