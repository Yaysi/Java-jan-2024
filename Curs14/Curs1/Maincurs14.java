package Curs14.Curs1;

import Curs13.Tema.Student;

import java.util.ArrayList;

public class Maincurs14 {
    public static void main(String[] args) {

        Contract contract = new Contract(1,"bloc 2");
        contract.setId(5);
        contract.setPagini("bloc 25cc");
        System.out.println(contract.getId()+ " " +contract.getPagini());
        Contract.intretinere();
        String bloc = Contract.nomdebloc;
        System.out.println(bloc);


    }
}

