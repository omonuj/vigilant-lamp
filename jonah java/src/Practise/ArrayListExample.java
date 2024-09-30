package Practise;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        int n = 10;
        ArrayList<Integer> arr1 = new ArrayList<>();

        ArrayList<Integer> arr2 = new ArrayList<>();

        System.out.println("Array 1: " +arr1);
        System.out.println("Array 2: " +arr2);

        for (int i = 0; i < n; i++) {
            arr1.add(i);
            arr2.add(i);
        }

        System.out.println("Array 1: " +arr1);
        System.out.println("Array 2: " +arr2);
    }
}
