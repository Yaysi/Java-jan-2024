package Curs19.curs;

public class Classesecondaire extends Classprincipale {

    @Override
    void methodedeclass() {
        System.out.println("Methode de cette classe secondaire ");
    }

    @Override
    int metodaclasei(String a) {
        System.out.println("Metode secondaire "+a);
        return 10;
    }

    int metodaclasei(int b){
        System.out.println("Cette methode est une methode overloading "+b);
        return 15;
    }
}
