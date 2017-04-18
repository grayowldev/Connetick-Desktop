/**
 * Created by kwasi on 4/18/2017.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Logger extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        VBox vBox = FXMLLoader.load(getClass().getResource("UI.fxml"));
        Scene scene = new Scene(vBox,500,600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Support");
        primaryStage.show();
    }
}
