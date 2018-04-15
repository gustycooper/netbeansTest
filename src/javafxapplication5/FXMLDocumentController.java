/*
 * CPSC 220
 * Gusty Cooper
 * Project XX
 */
package javafxapplication5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author gusty
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Button myButton;

    @FXML
    private TextField myTextField;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        myTextField.setText("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    void handleMyButton(ActionEvent event) {
        String s = myTextField.getText();
        myTextField.setText(s.toUpperCase());
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
