package Curs19.curs;

public class Pantofi extends Genericpantofi implements Incalsaminte {


    @Override
    public boolean aretoc(String denumire) {
        if (denumire.contains("Red shoose")) {
            return true;
        }
        return false;


    }

    @Override
    public boolean defemidebarbati() {
        return false;
    }
}
