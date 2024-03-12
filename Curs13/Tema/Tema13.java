package Curs13.Tema;

import java.time.LocalDate;

public class Tema13 {

    public static void main(String[] args) {

        Student Amir = new Student();
        Amir.setName("Amir");
        Amir.setAge(21);
        System.out.println(Amir.name+ " is "+Amir.age + " Years old");
        Amir.text();

        LocalDate date = LocalDate.of(2002,03,8);
        System.out.println(date);
        System.out.println(Amir.name+ " is "+Amir.age + " Years old" + "because he was born at " +date);

        StringBuilder unmot = new StringBuilder("Today is the best day of my life , look ! ");
        unmot.append("Hello man");
        System.out.println(unmot);
        unmot.insert(0,"My man , i'm so happy, ");
        System.out.println(unmot);
        System.out.println(unmot.indexOf("look"));






    }

}
