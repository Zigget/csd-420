/*
Made by: Samuel Sidzyik
Module 7.2
Start Date July 12, 2026

Implementing CSS for JavaFX

https://github.com/Zigget/csd-420/blob/main/module-7
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class StyleCirclesDemo extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Four circles
        Circle c1 = new Circle(50);
        Circle c2 = new Circle(50);
        Circle c3 = new Circle(50);
        Circle c4 = new Circle(50);

        c1.getStyleClass().add("whiteFillBlackStroke");
        c2.getStyleClass().add("whiteFillBlackStroke");

        c3.setId("redCircle");
        c4.setId("greenCircle");

        // Layout
        HBox box = new HBox(20);
        box.getChildren().addAll(c1, c2, c3, c4);

        Scene scene = new Scene(box, 400, 150);

        scene.getStylesheets().add("mystyle.css");

        primaryStage.setTitle("Circle Style Preview");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
