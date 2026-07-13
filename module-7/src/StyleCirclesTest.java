/*
Made by: Samuel Sidzyik
Module 7.2
Start Date July 12, 2026

Testing CSS for JavaFX

https://github.com/Zigget/csd-420/blob/main/module-7
*/
import javafx.scene.shape.Circle;
public class StyleCirclesTest {

    public static void main(String[] args) {
        Circle testCircle = new Circle(50);
        testCircle.getStyleClass().add("whiteFillBlackStroke");

        System.out.println("Style classes: " + testCircle.getStyleClass());
        System.out.println("ID: " + testCircle.getId());

        assert testCircle.getStyleClass().contains("whiteFillBlackStroke") : "Class not applied!";
        assert testCircle.getId() == null : "ID should not be set!";
        
        System.out.println("Test passed.");
    }
}