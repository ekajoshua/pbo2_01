package com.joshua.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * @author Joshua 1672062
 */

public class DemoMainController {
    @FXML
    private TextField txtinput;
    @FXML
    private Label lblOutput;

    @FXML
    private void sendQueryAction(ActionEvent actionEvent) {
        if (!txtinput.getText().trim().isEmpty()) {
            lblOutput.setText(txtinput.getText().trim());
        } else {
            Alert alert = new Alert (Alert.AlertType.ERROR);
            alert.setContentText("Please fill input");
            alert.showAndWait();
        }
    }
}
