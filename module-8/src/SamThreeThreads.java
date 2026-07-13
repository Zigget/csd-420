/*
Made by: Samuel Sidzyik
Module 8.2
Start Date July 12, 2026

Threading a bunch of randomish data

https://github.com/Zigget/csd-420/blob/main/module-8
*/

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Random;

public class SamThreeThreads extends Application {

    private static final int COUNT = 10000;
    private final Random rand = new Random();

    @Override
    public void start(Stage primaryStage) {

        TextArea output = new TextArea();
        output.setEditable(false);

        BorderPane pane = new BorderPane(output);
        Scene scene = new Scene(pane, 600, 400);

        primaryStage.setTitle("Three Threads Output");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Start all three threads
        new Thread(() -> generateLetters(output)).start();
        new Thread(() -> generateDigits(output)).start();
        new Thread(() -> generateSymbols(output)).start();
    }

    private void generateLetters(TextArea ta) {
        for (int i = 0; i < COUNT; i++) {
            char c = (char) ('a' + rand.nextInt(26));
            Platform.runLater(() -> ta.appendText(String.valueOf(c)));
        }
    }

    private void generateDigits(TextArea ta) {
        for (int i = 0; i < COUNT; i++) {
            char c = (char) ('0' + rand.nextInt(10));
            Platform.runLater(() -> ta.appendText(String.valueOf(c)));
        }
    }

    private void generateSymbols(TextArea ta) {
        char[] symbols = {'!', '@', '#', '$', '%', '&', '*'};
        for (int i = 0; i < COUNT; i++) {
            char c = symbols[rand.nextInt(symbols.length)];
            Platform.runLater(() -> ta.appendText(String.valueOf(c)));
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
