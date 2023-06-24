package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextField txtAlienWord;

    @FXML
    private TextArea txtComment;

    @FXML
    void doClear(ActionEvent event) {

    }

    @FXML
    void doTranslate(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtAlienWord != null : "fx:id=\"txtAlienWord\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtComment != null : "fx:id=\"txtComment\" was not injected: check your FXML file 'Scene.fxml'.";

    }

}
