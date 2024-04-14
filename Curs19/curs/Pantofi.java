package Curs19.curs;

public class Pantofi extends Genericpantofi implements Incalsaminte {
    void  metodapamtofi(){
        System.out.println("metoda din classa pantofi");
    }


    @Override
    public boolean aretoc(String denumire) {
        if (denumire.contains("de femei")) {
            return true;
        }
        return false;
    }

    @Override
    public boolean defemidebarbati() {
        return false;
    }


}





