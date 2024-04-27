package Curs25.tema;

import Curs20.curs.Cat;
import Curs23.Curs.Animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Conditionalprinter obj1 = (paramS, bparam) -> {
            if (bparam) {

                System.out.println(paramS);
            }

        };

        obj1.print("Animal", true);
        obj1.print("Poisson", false);

        Student student1 = new Student("Ismail", 1000000.00);
        Student student3 = new Student("Mouataz", 70);
        Student student2 = new Student("Karima", 50);

        ArrayList<Student> statistics = new ArrayList<>();
        statistics.add(student1);
        statistics.add(student2);
        statistics.add(student3);

        for (Student List : statistics) {

            if (List.grade >= 60) {
                System.out.println(List.name);
            }
        }

        Random rand = new Random();

        List<Integer> numbers = new ArrayList<>();
        int n ;

        for (int i=0; i<5; i++){
            n= rand.nextInt(100);
            numbers.add(n);
        }

        int min = numbers.get(4);
        int max = numbers.get(4);

        System.out.println(min+ " "+ max);

        for (int number : numbers){

            System.out.println(number + " ");
            if (number<min) min = number;
            if (number>max) max = number;

        }

        System.out.println("\n"+max+" "+ min);

        Random number5 = new Random();


        ArrayList <Integer> list5 = new ArrayList<>();
        for (int i =0; i<5;i++){
            list5.add(number5.nextInt(20));
        }

        Collections.shuffle(list5);
        System.out.println(list5);

        int smallestnumber = list5.get(0);
        int bigestnumber = list5.get(0);

        for (int numar : list5){
            if (numar<smallestnumber) smallestnumber=numar;
            if (numar>bigestnumber) bigestnumber=numar;
        }

        System.out.println("Tis is the smallest number " + smallestnumber + " Here am I the biggest number "+ bigestnumber);

       Box box= new Box();

       box.Box1("L'hereb");
        System.out.println(box);



    }
}
