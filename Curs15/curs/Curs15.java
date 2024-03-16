package Curs15.curs;

import java.sql.SQLOutput;
import java.util.*;

public class Curs15 {
    public static void main(String[] args) {

        List<Product> cart = new LinkedList<>();

        Product product1 = new Product("Chocolat", 10);
        Product product2 = new Product("Layz", 8);
        Product product3 = new Product("Branza", 9);
        Product product4 = new Product("Pulpe de pui", 15);
        Product product5 = new Product("Cozonac", 25);
        Product product6 = new Product("Rosi", 25);

        cart.add(product1);
        cart.add(product2);
        cart.add(product3);
        cart.add(product4);
        cart.add(product5);
        cart.add(product6);

/**  if (cart.get(i).nom_de_produit!=("Pomme")){
 cart.add(new Product("Lemom",25));
 break; */


        for (int i = 0; i < cart.size(); i++) {
            if (!Objects.equals(cart.get(i).nom_de_produit, "Pomme")) {
                cart.add(new Product("Lemom", 25));
                break;
            }
        }


        double pricesum = 0;
        for (Product produs : cart) {

            pricesum = pricesum + produs.price_de_prduit;
        }

        System.out.println("this is the total of your shopping cart " + pricesum);
        double suma = 0;


        for (int index = 0; index < cart.size(); index++) {

            suma = suma + cart.get(index).price_de_prduit;

        }

        System.out.println(suma);


    }
}
