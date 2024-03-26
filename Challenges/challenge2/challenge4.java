package Challenges.challenge2;

public class challenge4 {
    public static void main(String[] args) {

        int[] listofnumners= {1,2,3,4,5,6,7,8,9,10,11,12,13,14};

        int evennumbers= 0;
        int oddnumbers= 0;

        for (int list :listofnumners){
            if (list%2 ==0){
                evennumbers++;
                System.out.println(list+" is an even number ");
            } else if (list%2 !=0) {
                oddnumbers++;
                System.out.println(list+" is a odd number");

            }
        }
        System.out.println("This sum of odd number "+oddnumbers);
        System.out.println("This sum of even numbers "+evennumbers);
    }
}
