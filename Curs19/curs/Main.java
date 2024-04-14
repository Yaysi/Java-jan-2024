package Curs19.curs;

public class Main {
    public static void main(String[] args) {

        Classprincipale classsecondaire = new Classesecondaire();

        Incalsaminte incalsaminte = new Pantofi();
        boolean aretoc = incalsaminte.aretoc("Pantofi sport de femei");
        System.out.println("Are toc ? "+ aretoc);



    }
}
