/*
Made by: Samuel Sidzyik
Module 3.2
Start Date June 21, 2026

Creates an array of integers. After it creates a second list with no duplicates to the first.

https://github.com/Zigget/csd-420/blob/main/module-3
*/
import java.util.ArrayList;
import java.util.Random;

public class SidzyikCreateArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> originalList = new ArrayList<>();
        Random rand = new Random();

        // Fill with 50 random values from 1 to 20
        for (int i = 0; i < 50; i++) {
            originalList.add(rand.nextInt(20) + 1);
        }

        System.out.println("Original List:");
        System.out.println(originalList);

        ArrayList<Integer> noDuplicates = removeDuplicates(originalList);

        System.out.println("\nList With No Duplicates:");
        System.out.println(noDuplicates);
    }

    // Generic method to remove duplicates
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> newList = new ArrayList<>();

        for (E element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }

        return newList;
    }
}
