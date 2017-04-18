import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by kwasi on 4/18/2017.
 */
public class Server extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane borderPane = FXMLLoader.load(getClass().getResource("serverGUI.fxml"));

        Scene scene = new Scene(borderPane, 500,650);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Connetic Seer");
        primaryStage.show();
        primaryStage.setIconified(true);
    }
}
