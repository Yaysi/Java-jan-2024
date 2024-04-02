package Curs17.Tema;

import java.util.List;

public class Recipe {

   private  String name ;

    private  List <String> Recettes ;

    public Recipe(String name, List<String> recettes) {
        this.name = name;
        Recettes = recettes;
    }

    public String getName(){
        return name;
    }

    public List <String> getRecettes(){
        return Recettes;
    }

    public boolean hasrecettes(String ingrediant){
        return Recettes.contains(ingrediant);
    }

    public void addRecipe(String name,List<String> recettes ){
        this.name = name;
        this.Recettes = recettes;
    }
}
