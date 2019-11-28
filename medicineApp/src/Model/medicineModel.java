/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author tancincoja_sd2022
 */
public class medicineModel {

    public boolean addMedicine(String genName, String bName, double cost1, int qty, String value) {
        boolean success = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jframe", "root", "");
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO `medicine`(`genericname`, `brandname`, `medicinetype`, `price`, `stock`) VALUES ('" + genName + "','" + bName + "','" + value + "'," + cost1 + "," + qty + ")";
            stmt.executeUpdate(sql);
            success = true;
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error connecting to database!");
        }
        return success;
    }
    
    public boolean removeMedicine(String brandname){
        boolean success = false;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jframe", "root", "");
            Statement stmt = con.createStatement();
            //ResultSet rs = stmt.executeQuery("SELECT * FROM `medicine` WHERE brandname='" + brandname + "'"); // only choose the medicine inputted from the view
            String sql = "DELETE FROM `medicine` WHERE brandname='" + brandname + "'"; // query here         
            stmt.executeUpdate(sql); // delete the medicine you've inputted earlier
            success = true;
            con.close();
        } catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"Error connecting to database!");
        }
        return success;   
    }

}
