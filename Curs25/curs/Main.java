package Curs25.curs;

public class Main {
    public static void main(String[] args) {

        Car carnanonim = new Car() {

            @Override
            public void metoda() {
                System.out.println("Me");
            }


            @Override
            public void functioneaza() {
                System.out.println("Hello man");
            }

        };

        carnanonim.metoda();
        carnanonim.functioneaza();


    }
}
