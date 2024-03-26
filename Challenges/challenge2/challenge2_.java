package Challenges.challenge2;

import java.util.ArrayList;
import java.util.LinkedList;

public class challenge2_ {
    public static void main(String[] args) {
        ArrayList <String> list1 = new ArrayList<>();
        list1.add("Croissant");
        list1.add("shompoin");
        list1.add("haircare");
        list1.add("brush teeth");
        list1.add("pantalon");
        list1.add("poulet");

        for (String list2 :list1){
            System.out.println(list2);
        }
        System.out.println(list1.size());

        LinkedList <Products> shoppinglist= new LinkedList<>();
        Products Croissant = new Products("Croissant",3.99);
        Products Shampo = new Products("Shampo",7.5 );
        shoppinglist.add(Croissant);
        shoppinglist.add(Shampo);
        System.out.println("This is my new shopping list3");

        for (Products list3 :shoppinglist){
            System.out.println(list3.nameoftheproduct+ " "+list3.priceofproduct);
        }

        double Sumofprice = 0;
        for (int i =0 ; i< shoppinglist.size(); i++){
            Sumofprice = Sumofprice+ shoppinglist.get(i).priceofproduct;
        }
        System.out.println(Sumofprice+ " Lei");

    }
}
