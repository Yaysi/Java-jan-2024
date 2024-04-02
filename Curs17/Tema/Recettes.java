package Curs17.Tema;

import java.util.List;

public class Recettes {
  private   String nom;
   private List<String> Recette;

    public Recettes(String nom, List<String> Recette) {
        this.nom = nom;
        this.Recette = Recette;
    }
    public void setNom(String nom){
        this.nom=nom;
    }

    public void setRecette(List<String> recipe){
        this.Recette=recipe;
    }

    public List <String> getRecette(){
        return Recette;
    }
    public String getNom(){
        return nom;
    }

    public boolean hasRecette(String ingrediant)
    {
        return Recette.contains(ingrediant);
    }
}

