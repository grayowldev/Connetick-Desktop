import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by kwasi on 4/18/2017.
 */
public class Server extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    private int clientNo = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane borderPane = FXMLLoader.load(getClass().getResource("serverGUI.fxml"));

        Scene scene = new Scene(borderPane, 500,650);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Connetick Seer");
        primaryStage.show();
        primaryStage.setIconified(true);

        new Thread(() -> {
            try {
                ServerSocket serverSocket = new ServerSocket(3000);
                Platform.runLater(() ->{

                });

                Socket socket = serverSocket.accept();

                DataInputStream clientInput = new DataInputStream(socket.getInputStream());
                DataOutputStream clientOutput = new DataOutputStream(socket.getOutputStream());

            }
            catch (IOException ex){
                ex.printStackTrace();
            }
        }).start();
    }
}
