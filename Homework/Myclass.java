package Homework;

public class Myclass {
    public static void main(String[] args) {

       Bloc bloc1= new Bloc(false,2011,4);
        Bloc bloc3= new Bloc(true,2020,5);
        Bloc bloc4 = new Bloc(true,2026,7);
      Bloc bloc5= new Bloc(true, 2026,7);


       Masini car1 =new Masini(2014,"Silver","Mercedes");
        Masini car2 = new Masini(2026,"Black", "Mercedes");
       Masini car3= new Masini(2026, "Silver", "Mercedes");

       

        Animaux animal1 = new Animaux("Chat", "Pet "," Noire");
        Animaux animal2 = new Animaux("Chien", "Savage","Blanc");


        System.out.println(animal1.race+animal1.nom + animal1.Couleur);



        if (bloc1.lift==false && bloc1.annee_de_construction<=2010){
            System.out.println("This bloc is good with the floor number "+bloc1.etaj);
        } else if (bloc1.annee_de_construction>2010) {
           System.out.println("Nothing");
          if (car1.an_fabricatia<2023 && car1.model=="Mercedes")
           {
                System.out.println("This car is old");

        String oui = "JAVA";

        }

    }
}}
