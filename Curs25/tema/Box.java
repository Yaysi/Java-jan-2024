package Curs25.tema;

public class Box {

    /**-Create a generic class Box<T> that can store a single item of any type. Implement methods to set and get the item from the box.
     -Design a Movie class with attributes like title, genre, and a list of ratings. Create a method that retrieve the average rating for any movie.*/

    public <T> T Box1 (T manger){
        System.out.println(" Cet animal mange de "+manger);
        return manger;
    }

}
