package Curs12.Tema;

import java.util.Arrays;
import java.util.Comparator;

public class Fruits {
    public static void main(String[] args) {

        String[] listaDeFructe = {"Mar", "Para", "Banana"};

        Arrays.sort(listaDeFructe);
        for (String fruct : listaDeFructe) {
            System.out.println(fruct);
        }
        System.out.println("Mai sus am sortarea pentru listaDeFructe");

        /** ne copiam de mai jos */
        String[] listaDeFructeTryCopy = listaDeFructe;
        Arrays.sort(listaDeFructeTryCopy, Comparator.reverseOrder());
        for (String fruct1 : listaDeFructe) {
            System.out.println(fruct1);


        }

        System.out.println("Pause");

        for (String fruct : listaDeFructeTryCopy){
            System.out.println(fruct);
        }
    }
}
