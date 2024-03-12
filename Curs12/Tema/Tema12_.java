package Curs12.Tema;

public class Tema12_ {
    public static void main(String[] args) {


        StringBuilder mot = new StringBuilder("JLO");
        mot.append(" yes "+ "Hello");
        System.out.println(mot);
        StringBuilder expression = mot.append(" madame");
        System.out.println(expression);

        String magic = "magic";
        expression.append(" " + magic);
        System.out.println(expression);

        Students ab = new Students();
        ab.setAge(22);
        ab.setName("Alexandru");
        System.out.println(ab.getName() + " is " + ab.getAge() +" Years old.");
    }

}