package com.isi.sponsorship.Controller;



import com.isi.sponsorship.tools.Outils;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;




public class AcceuilController {
    @FXML
    private Button register;

    @FXML
    private Button login;

    @FXML
    private Button parrainer;



    @FXML
    void loginbtn(ActionEvent event) {
        try {
            Outils.load(event, "Connexion","/Fxml/login.fxml");

        }catch (Exception e) {
            System.out.println("Erreur de connexion");
            e.printStackTrace();

        }
    }

    @FXML
    void parrainerbtn(ActionEvent event) {

    }

    @FXML
    void registerbtn(ActionEvent event) {

    }

}
