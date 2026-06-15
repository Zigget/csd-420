/*
Made by: Samuel Sidzyik
Module 2.2
Start Date June 14, 2026

Reads Data File

https://github.com/Zigget/csd-420/blob/main/module-2
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFile {
    public static void main(String[] args) {
        String filename = "SamSidzyikdatafile.dat";

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            System.out.println("Contents of " + filename + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
