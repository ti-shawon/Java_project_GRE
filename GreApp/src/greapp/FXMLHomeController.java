/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greapp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author TIS
 */
public class FXMLHomeController implements Initializable {
    
    @FXML
    private Label label;
    @FXML 
    TextField username;
    @FXML 
    TextField password;
    @FXML 
    Label lvl;
    
    public void login(ActionEvent event) throws IOException {
        if (username.getText().equals("user") && password.getText().equals("pass")){
            lvl.setText("Login Successful");
            //code for page2
            Parent page2_parrent=FXMLLoader.load(getClass().getResource("FXMLPage2.fxml")) ;
            Scene page2_scene=new Scene(page2_parrent);
            Stage app_stage=(Stage)((Node)event.getSource()).getScene().getWindow();
            app_stage.hide();
            app_stage.setScene(page2_scene);
            app_stage.show();
            //
            
        }
        else {
            lvl.setText("Login failed");
        }
    }
    
   // @Override
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
