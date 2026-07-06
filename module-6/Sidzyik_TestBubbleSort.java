/*
Made by: Samuel Sidzyik
Module 6.2
Start Date July 5, 2026

This was done all in one code in your example. I just did it in two separate files to keep it clean

https://github.com/Zigget/csd-420/blob/main/module-6
*/

import java.util.Comparator;

public class Sidzyik_TestBubbleSort {

    public static void main(String[] args) {

        // ---------- Test Comparable Bubble Sort ----------
        Integer[] nums = { 9, 3, 7, 1, 4 };

        System.out.println("Original Integer array:");
        printArray(nums);

        BubbleSort.bubbleSortComparable(nums);

        System.out.println("Sorted using Comparable:");
        printArray(nums);


        // ---------- Test Comparator Bubble Sort ----------
        String[] names = { "Zoe", "Alex", "Christopher", "Ben" };

        System.out.println("\nOriginal String array:");
        printArray(names);

        // Sort by string length
        BubbleSort.bubbleSortComparator(names, Comparator.comparingInt(String::length));

        System.out.println("\nSorted using Comparator (length):");
        printArray(names);


        // Sort alphabetically using Comparator
        BubbleSort.bubbleSortComparator(names, Comparator.naturalOrder());

        System.out.println("\nSorted using Comparator (alphabetical):");
        printArray(names);
    }

    // Helper method to print arrays
    private static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
