package Challenges.challenge2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.ListIterator;

public class Challenge3 {
    public static void main(String[] args) {
        ArrayList <String> Studentslist = new ArrayList<>();
        Studentslist.add("Alexandru");
        Studentslist.add("Maria");
        Studentslist.add("Alexandra");
        Studentslist.add("Monica");


        ArrayList <String> graduatStudentslist = new ArrayList<>(Studentslist);
        for (String list : graduatStudentslist){
            System.out.println(list);
        }

        System.out.println("The difference between an Array list and Iterator list ");
        ListIterator <String> list2 = graduatStudentslist.listIterator();
        for (ListIterator<String> it = list2; it.hasNext();){
            String list1 = it.next();
            System.out.println(list1);
        }
        System.out.println("The difference between while loop and for loop for the Iterator list");
        ListIterator<String> list4 = graduatStudentslist.listIterator();
        while (list4.hasNext()){
            System.out.println(list4.next());
        }
    }
}
