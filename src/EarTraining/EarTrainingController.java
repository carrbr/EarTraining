package EarTraining;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class EarTrainingController {
    @FXML private Text actiontarget;

    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Sign in button pressed");
        System.out.println("Button Pressed");
    }

    public void playRandomNote(ActionEvent actionEvent) {
    }

    public void replayNote(ActionEvent actionEvent) {
    }

    public void submitGuess(ActionEvent actionEvent) {
    }
}
