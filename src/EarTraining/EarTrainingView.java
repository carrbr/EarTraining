package EarTraining;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class EarTrainingView extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("EarTrainingMain.fxml"));
        primaryStage.setTitle("Ear Training");
        primaryStage.setScene(new Scene(root, 800, 550));

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
