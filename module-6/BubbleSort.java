/*
Made by: Samuel Sidzyik
Module 6.2
Start Date July 5, 2026

Reads words from collection_of_words.txt. Displays non‑duplicate words in ascending order. Then displays them again in descending order.
Wrote code testing section

https://github.com/Zigget/csd-420/blob/main/module-6
*/

import java.util.Comparator;

public class BubbleSort {

     // Generic bubble sort using Comparable.
     // This method requires the elements to implement Comparable<T>.
    public static <T extends Comparable<T>> void bubbleSortComparable(T[] array) {
        boolean swapped;

        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    // Swap elements
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // Optimization: This was in some old code from another of my Java classes. It wasn't in the example attached. 
            // Not sure if it matters...
            if (!swapped) break;
        }
    }

    //Bubble Sort
    public static <T> void bubbleSortComparator(T[] array, Comparator<T> comp) {
        boolean swapped;

        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (comp.compare(array[j], array[j + 1]) > 0) {
                    // Swap elements
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // Using that optimization again.
            // I also didn't do the printing that the example code did... idk, didn't want to make this messy.
            if (!swapped) break;
        }
    }
}
