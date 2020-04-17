package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class DialogController {

    @FXML
    private TextField newNameField;

    public String getNewName(){
        return newNameField.getText();
    }
}
