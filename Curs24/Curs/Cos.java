package Curs24.Curs;

public enum Cos {

    Gol ("GOL"),

    Pending ("In curs de acualizare"),

    Are_produse("Exista produse in cos"),

    Platit ("Platit"),;



    private final String starenume;

    String getStarenume(){
        return starenume;
    }

    Cos(String starenume) {
        this.starenume = starenume;
    }
}
