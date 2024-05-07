import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FXCalculator extends Application {

    private TextField display;

    @Override
    public void start(Stage primaryStage) {
        // Display TextField
        display = new TextField();
        display.setEditable(false);
        display.setAlignment(Pos.CENTER_RIGHT);
        display.setStyle("-fx-font-size: 20px;");

        // GridPane for buttons
        GridPane buttonGrid = new GridPane();
        buttonGrid.setAlignment(Pos.CENTER);
        buttonGrid.setHgap(10);
        buttonGrid.setVgap(10);
        buttonGrid.setPadding(new Insets(20, 20, 20, 20));

        // Button labels in a 2D array
        String[][] labels = {
                {"7", "8", "9", "/"},
                {"4", "5", "6", "*"},
                {"1", "2", "3", "-"},
                {"0", ".", "=", "+"}
        };

        // Create and add buttons to the GridPane
        for (int i = 0; i < labels.length; i++) {
            for (int j = 0; j < labels[i].length; j++) {
                Button btn = new Button(labels[i][j]);
                btn.setPrefSize(50, 50);
                GridPane.setConstraints(btn, j, i);
                btn.setOnAction(e -> processInput(btn.getText()));
                buttonGrid.getChildren().add(btn);
            }
        }

        // Main layout VBox
        VBox layout = new VBox(20);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(display, buttonGrid);

        // Set the scene
        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Calculator");
        primaryStage.show();
    }

    private void processInput(String value) {
        // Handle the input from buttons
        switch (value) {
            case "=":
                // Here, implement the logic to calculate and display the result
                display.setText("Implement Logic");
                break;
            case "C":
                display.clear();
                break;
            default:
                display.appendText(value);
                break;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
