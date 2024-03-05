package Challenges.challenge1;

public class Main {
    public static void main(String[] args) {
        int nu = 15558, sum=0;
        while  (nu>0){
            sum+=(nu%10);
        nu/=10;}
        System.out.println(sum);

        }

    }

