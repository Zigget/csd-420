// Demonstrates JavaFX Color and Text
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ColorTextDemo extends Application {
    @Override
    public void start(Stage stage) {
        // Create a Text object and apply styling
        Text message = new Text("Hello JavaFX!");
        message.setFill(Color.DARKBLUE); // Sets text color
        message.setStyle("-fx-font-size: 28px;");

        // Add text to layout container
        StackPane root = new StackPane(message);

        // Create scene with background color
        Scene scene = new Scene(root, 400, 200, Color.LIGHTGRAY);

        stage.setTitle("JavaFX Color & Text Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}