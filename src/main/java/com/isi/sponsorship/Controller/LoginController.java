package com.isi.sponsorship.Controller;


import com.isi.sponsorship.Entity.User;
import com.isi.sponsorship.Services.UserImple;
import com.isi.sponsorship.UI.IUser;
import com.isi.sponsorship.tools.Notification;
import com.isi.sponsorship.tools.Outils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    private IUser userDao= new UserImple();
    @FXML
    private TextField logintfd;


    @FXML
    private Button saveBtn;

    @FXML
    private PasswordField passwordtfd;

    @FXML
    void login(ActionEvent event) {
        String login = logintfd.getText();
        String password = passwordtfd.getText();

        if(login.isEmpty() || password.isEmpty())
            Notification.NotifError("Erreur", "Veuillez remplir tous les champs !");

        else{

            User u= userDao.SeConnecter(login,password);

            if(u!=null){

                try{
                    Notification.NotifSuccess("Succés","Connexion réussie !");
                  

                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else {
                Notification.NotifError("Erreur", "Email et/ou mot de passe incorrects");

            }
        }
    }

    }

