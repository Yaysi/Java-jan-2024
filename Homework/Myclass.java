package Homework;

public class Myclass {
    public static void main(String[] args) {

        Bloc bloc1= new Bloc(false,2011,4);
        Bloc bloc3= new Bloc(true,2020,5);

        if (bloc1.lift==false && bloc1.annee_de_construction<=2010){
            System.out.println("This bloc is good with the floor number "+bloc1.etaj);
        } else if (bloc1.annee_de_construction>2010) {
            System.out.println("Nothing");

        }

    }
}
