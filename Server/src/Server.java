import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * Created by kwasi on 4/18/2017.
 */
public class Server extends Application {

    @Override
    public void start(Stage primaryStage) {
        TextArea textArea = new TextArea();

        Scene scene = new Scene(new ScrollPane(textArea),500,700);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Connetick Server");
        primaryStage.show();
    }
}
