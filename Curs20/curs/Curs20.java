package Curs20.curs;

import java.util.ArrayList;
import java.util.List;

public class Curs20 {
    public static void main(String[] args) {
        List<String> numedecursant = new ArrayList<>();

        Contract contract = new Contract("1", "nume1",starecontractenum.nesemnat);
        if (starecontractenum.ilegal.equals(contract.stare)){
            System.out.println("nesemnat");
        }
    }
}
