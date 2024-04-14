package Challenges.challenge3;

public class Main {
    public static void main(String[] args) {
        Lemure lemure = new Lemure();
        System.out.println(lemure.hight);
        lion lion1 = new lion();
        Hastail hastail1 = lion1;

        Hastail hastail = lemure;
        System.out.println(hastail.istailstripped());
        System.out.println(hastail1.istailstripped());

        child child1 = new child();

        Parent parent= child1;
        child child2 = (child) parent;
        System.out.println(parent.value);
        System.out.println(child2.value);



    }
}
