/*
Made by: Samuel Sidzyik
Module 5.2
Start Date June 28, 2026

Reads words from collection_of_words.txt. Displays non‑duplicate words in ascending order. Then displays them again in descending order.
Wrote code testing section

https://github.com/Zigget/csd-420/blob/main/module-5
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class SidzyikWordCollectionTest {

    public static void main(String[] args) {

        // Reference the file directly (no command-line args)
        File wordFile = new File("collection_of_words.txt");

        // TreeSet automatically removes duplicates AND sorts ascending
        TreeSet<String> wordSet = new TreeSet<>();

        try (Scanner input = new Scanner(wordFile)) {

            while (input.hasNext()) {
                String word = input.next().toLowerCase().trim();
                wordSet.add(word);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file collection_of_words.txt was not found.");
            return;
        }

        // Display ascending order (TreeSet default)
        System.out.println("Ascending Order (Non-duplicate words):");
        System.out.println(wordSet);

        // Convert to ArrayList to reverse order
        ArrayList<String> descendingList = new ArrayList<>(wordSet);
        Collections.reverse(descendingList);

        System.out.println("\nDescending Order (Non-duplicate words):");
        System.out.println(descendingList);

        // --- TEST CODE SECTION ---
        System.out.println("\nTest Code");

        // Test 1: Ensure duplicates are removed
        boolean noDuplicates = (wordSet.size() == new TreeSet<>(wordSet).size());
        System.out.println("Test 1 - Duplicate Removal: " + (noDuplicates ? "PASS" : "FAIL"));

        // Test 2: Ensure ascending order is correct
        boolean ascendingCorrect = wordSet.equals(new TreeSet<>(wordSet));
        System.out.println("Test 2 - Ascending Sort: " + (ascendingCorrect ? "PASS" : "FAIL"));

        // Test 3: Ensure descending order is correct
        TreeSet<String> temp = new TreeSet<>(wordSet);
        ArrayList<String> expectedDesc = new ArrayList<>(temp);
        Collections.reverse(expectedDesc);
        boolean descendingCorrect = expectedDesc.equals(descendingList);
        System.out.println("Test 3 - Descending Sort: " + (descendingCorrect ? "PASS" : "FAIL"));
    }
}