import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BackupManagerApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Backup Manager");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(10);
        grid.setHgap(10);

        // Labels
        Label sourceLabel = new Label("Origem:");
        GridPane.setConstraints(sourceLabel, 0, 0);

        Label destinationLabel = new Label("Destino:");
        GridPane.setConstraints(destinationLabel, 0, 1);

        // Text Fields
        TextField sourceTextField = new TextField();
        GridPane.setConstraints(sourceTextField, 1, 0);

        TextField destinationTextField = new TextField();
        GridPane.setConstraints(destinationTextField, 1, 1);

        // Backup Button
        Button backupButton = new Button("Fazer Backup");
        GridPane.setConstraints(backupButton, 0, 2);
        backupButton.setOnAction(e -> {
            String source = sourceTextField.getText();
            String destination = destinationTextField.getText();

            // Aqui você pode implementar a lógica para fazer o backup
            // usando as informações fornecidas nos campos de texto

            System.out.println("Fazendo backup de " + source + " para " + destination);
        });

        grid.getChildren().addAll(sourceLabel, sourceTextField, destinationLabel, destinationTextField, backupButton);

        Scene scene = new Scene(grid, 400, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
