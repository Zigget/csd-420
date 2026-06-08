/*
Made by: Samuel Sidzyik
Module 1.3
Start Date June 7, 2026

Generates 4 random cards in a display window. Pulls cards from folder.

https://github.com/Zigget/csd-420/blob/main/module-1/src/SidzyikCardDisplay.java

I googled changing the icon and only relied on AI to troubleshoot errors. All Code my own.
*/

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.image.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SidzyikCardDisplay extends Application {

    private static final String CARD_PATH = "C:/Users/ssidz/Git/csd-420/module-1/Cards/";

    @Override
    public void start(Stage stage) {

        // Window icon
        stage.getIcons().add(
            new Image("file:/C:/Users/ssidz/Git/csd-420/module-1/Cards/icon.png")
        );

        Group root = new Group();

        // Create 4 ImageViews
        ImageView c1 = new ImageView();
        ImageView c2 = new ImageView();
        ImageView c3 = new ImageView();
        ImageView c4 = new ImageView();

        // Position cards manually
        c1.setX(20);   c1.setY(20);
        c2.setX(140);  c2.setY(20);
        c3.setX(260);  c3.setY(20);
        c4.setX(380);  c4.setY(20);

        // Refresh button
        Button refresh = new Button("Draw 4");
        refresh.setLayoutX(220);
        refresh.setLayoutY(180);

        // Lambda: refresh cards inline
        refresh.setOnAction(e -> {
            List<Integer> deck = new ArrayList<>();
            for (int i = 1; i <= 54; i++) deck.add(i); // Added Jokers in
            Collections.shuffle(deck);

            ImageView[] views = { c1, c2, c3, c4 };

            for (int i = 0; i < 4; i++) {
                String filename = CARD_PATH + deck.get(i) + ".png";
                File file = new File(filename);
                Image img = new Image(file.toURI().toString());
                views[i].setImage(img);
                views[i].setFitWidth(100);
                views[i].setPreserveRatio(true);
            }
        });

        // Initial card load fire clicks the button.
        // I was going to do set of card face down but this was the easy way out.
        refresh.fire();

        root.getChildren().addAll(c1, c2, c3, c4, refresh);

        Scene scene = new Scene(root, 520, 240);
        stage.setTitle("Random Card Display");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}