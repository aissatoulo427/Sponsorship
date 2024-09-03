package com.isi.sponsorship.Services;

import com.isi.sponsorship.Dao.DBConnection;
import com.isi.sponsorship.Entity.User;
import com.isi.sponsorship.UI.IUser;

import java.sql.ResultSet;

public class UserImple implements IUser {
    private DBConnection db =new DBConnection();
    @Override
    public User SeConnecter(String email, String password) {
        String sql = "select * from user where email = ? and password = ?";
        User user = null;
        try {
            // ouverture et initialisation de la requette
                db.initPrepar(sql);
            //passage de valeur a la requete
                db.getPstm().setString(1, email);
                db.getPstm().setString(2, password);
            //execution de la requete
                ResultSet rs = db.executeSelect();
                if (rs.next()) {
                    user = new User();
                    user.setEmail(rs.getString("email"));
                    user.setPassword(rs.getString("password"));

                }
            //Fermeture de la connexion
                db.closeConnection();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
