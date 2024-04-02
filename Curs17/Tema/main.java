package Curs17.Tema;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

//        List <Recipe> Book_of_recipes= new ArrayList<>();
//        Recipe Book1 = new Recipe("Tajine",List.of("Pomme de terre","Carottes","Poullet"));
//        Recipe Book2 = new Recipe("Sandwich",List.of("Viande","Fromage","Sauce"));
//        Recipe Book3 = new Recipe("Omlette",List.of("Oeuf","Fromage","Milk"));
//        Recipe Book4 = new Recipe("Tarte",List.of("Milk","Creme Fraiche","Farine"));
//        Book_of_recipes.add(Book1);
//        Book_of_recipes.add(Book2);
//        Book_of_recipes.add(Book3);
//        Book_of_recipes.add(Book4);
//        Book1.addRecipe("Sarmale",List.of("Varza","Carne","Smantana","Bouliune"));
//
//        for (Recipe recipee :Book_of_recipes){
//            if (recipee.hasrecettes("Bouliune")){
//                System.out.println("This recepe "+ recipee.getName()+" has Bouliune" + recipee.getRecettes());
//            }
//        }

        List <Recettes> List_de_recttes= new ArrayList<>();
        Recettes Recette1 = new Recettes("Zacusca",List.of("Ardei","Oeuf"));
        Recettes Recette2 = new Recettes("Omlette",List.of("Oeuf","Milk"));
        Recettes Recette3 = new Recettes("Sarmale",List.of("varza","Otset"));
        Recettes Recette4 = new Recettes("Ardei umplut",List.of("Ardei","Carne"));

        List_de_recttes.add(Recette1);
        List_de_recttes.add(Recette2);
        List_de_recttes.add(Recette3);
        List_de_recttes.add(Recette4);

        for (Recettes receta :List_de_recttes){
            if (receta.hasRecette("Milk")){
                System.out.println("This recipe " + receta.getNom() + " has MIlk "+ receta.getRecette());
            }
        }


    }
}
