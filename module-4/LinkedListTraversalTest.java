/*
Made by: Samuel Sidzyik
Module 4.2
Start Date June 21, 2026

I closed this program twice while running because I thought it got hung up....

Output from my machine:
=== Testing with 50,000 elements ===
Iterator traversal time: 1210100 ns. OR 0.0012101 seconds
get(index) traversal time: 831684600 ns. OR 0.8316846 seconds

=== Testing with 500,000 elements ===
Iterator traversal time: 3126600 ns. OR 0.0031266 seconds
get(index) traversal time: 83464171400 ns. OR 83.4641714 seconds

This shows that not only iterative is quicker but that as the values increase in size that index get rapidly worse.
Iterative stays near instant with 3x time even at 10x values, but index took 100x longer for 10x value.

https://github.com/Zigget/csd-420/blob/main/module-4
*/
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTraversalTest {

    public static void main(String[] args) {
        
        System.out.println("=== Testing with 50,000 elements ===");
        runTest(50_000); // I saw this method to break up large numbers and I think this is easy to read. We use '_' to signify more conditions on next line and I never thought of using it to break up items on the same line

        pressToContinue();

        System.out.println("\n=== Testing with 500,000 elements ===");
        runTest(500_000);
    }

    public static void runTest(int size) {

        LinkedList<Integer> list = new LinkedList<>();

        // Fill the LinkedList
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        // --- Test Iterator traversal ---
        long start = System.nanoTime();

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }

        long end = System.nanoTime();
        long iteratorTime = end - start;
        double iterationSeconds = iteratorTime/1_000_000_000.0;
        System.out.println("Iterator traversal time: " + iteratorTime + " ns. OR " + iterationSeconds + " seconds");
        
        pressToContinue();

        // --- Test get(index) traversal ---
        start = System.nanoTime();

        for (int i = 0; i < list.size(); i++) {
            list.get(i); // I don't have to iterate this many values in real life and I'm surprised 
        }

        end = System.nanoTime();
        long getTime = end - start;
        double getSeconds = getTime/1_000_000_000.0;        
        System.out.println("get(index) traversal time: " + getTime + " ns. OR " + getSeconds + " seconds");

    }
    public static void pressToContinue() {
    // Added this so I could see as this ran easier.
    
    System.out.println("\nPress Enter to continue...");
    try {
        System.in.read();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
