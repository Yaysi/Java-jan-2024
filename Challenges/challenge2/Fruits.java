package Challenges.challenge2;

import java.util.*;

public class Fruits {
    public static void main(String[] args) {
        ArrayList <String>listaDeFructe = new ArrayList<>();
        listaDeFructe.add("mar");
        listaDeFructe.add("para");
        listaDeFructe.add("banana");

        listaDeFructe.sort(Comparator.reverseOrder());
        System.out.println("Sorted ArrayList "
                + "in descending order : "
                + listaDeFructe);

        /** Challenge 8   implement a linear search method to find whether a given movie title exists, i*/

        String[] movieTitles = {"The Shawshank Redemption", "The Godfather", "The Dark Knight", "Pulp Fiction", "The Lord of the Rings"};

        // Convert array to list
        ArrayList<String> movieList =new ArrayList<>(List.of(movieTitles));

        // Call indexOf() method to find the position of the movie title
        String targetMovie = "Pulp Fiction";
        int position = movieList.indexOf(targetMovie);

        // Print the result
        if (position != -1) {
            System.out.println("The movie '" + targetMovie + "' was found at position " + position + " in the array.");
        } else {
            System.out.println("The movie '" + targetMovie + "' was not found in the array.");
        }
        /**-------------------------------------------*/

        int age =20;
        Integer age1 = age;
        System.out.println(age1);

        String number = "1011";






    }
}
