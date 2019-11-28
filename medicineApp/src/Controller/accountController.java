/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Model.accountModel;

/**
 *
 * @author tancincoja_sd2082
 */
public class accountController {

    public boolean registerVerification(String username, String password, String confirmPassword, String age1, String money1) {
        boolean success = false;
        if (username.length() >= 5) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jframe", "root", "");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM `users` WHERE username='" + username + "'");

                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Username is already taken!");
                } else {
                    if (password.equals(confirmPassword)) {
                        try {
                            int age = Integer.parseInt(age1);
                            if (age >= 18) {
                                try {
                                    double money = Double.parseDouble(money1);
                                    accountModel acc = new accountModel();
                                    success = acc.register(username, password, age, money);
                                    return success;

                                } catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null, "Money should be number!");
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, "Age should be legal!");
                            }

                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Age should be number!");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Password do not match!");
                    }
                }

            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Error connecting to database!");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Username length should be atleast 5!");
        }
        
        return success;

    }
    
    
    public int logInVerification(String username, String password){
        int success = 400;
        
        accountModel acc = new accountModel();
        return acc.login(username, password);
//        if(acc.login(username, password) == 500){
//            return success = 500; // means user is an admin
//        } else if(acc.login(username, password) == 600){
//            return success = 600; // means user is a customer       
//        } else {
//            return success; // means error logging in
//        }

    }
    

}
