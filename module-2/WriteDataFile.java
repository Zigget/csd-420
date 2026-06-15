/*
Made by: Samuel Sidzyik
Module 2.2
Start Date June 14, 2026

Writes Data File

https://github.com/Zigget/csd-420/blob/main/module-2/
*/import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class WriteDataFile {
    public static void main(String[] args) {
        String filename = "SamSidzyikdatafile.dat";
        Random rand = new Random();

        try (FileWriter writer = new FileWriter(filename, true)) {
            // Write five random integers
            writer.write("Random Integers: ");
            for (int i = 0; i < 5; i++) {
                int value = rand.nextInt(100); // 0–99
                writer.write(value + " ");
            }
            writer.write("\n");

            // Write five random doubles
            writer.write("Random Doubles: ");
            for (int i = 0; i < 5; i++) {
                double value = rand.nextDouble() * 100; // 0–100
                writer.write(String.format("%.2f ", value));
            }
            writer.write("\n\n");

            System.out.println("Data written/appended to " + filename);

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
