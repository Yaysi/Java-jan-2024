package Challenges.Challenge14;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6};
        Arrays.sort(arr);

        System.out.println("Sorted array: "+ Arrays.toString(arr));
        int index = Arrays.binarySearch(arr,0);
        System.out.println("Element found at index: "+index);
        int []arr1 = new int[5];
        Arrays.fill(arr1,5);
        System.out.println("filled array" +Arrays.toString(arr1));

    }
}