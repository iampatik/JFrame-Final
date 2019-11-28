/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.adminView;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Model.medicineModel;

/**
 *
 * @author tancincoja_sd2022
 */
public class medicineController {
    
    public boolean addMedicine(String genName, String bName, String cost1, String qty, String value){
        boolean success = false;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jframe", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `medicine` WHERE brandname='" + bName + "'");
            
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Brand name already exist!");
            } else {
                try {
                    double cost = Double.parseDouble(cost1);
                    try {
                        int quantity = Integer.parseInt(qty);
                        medicineModel medModel = new medicineModel();
                        success = medModel.addMedicine(genName, bName, cost, quantity, value);
                        return success;
                        
                    } catch (HeadlessException | NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Stock should be a number!");
                    }

                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Price should be a number!");
                }
            }           
        } catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error connecting to database!");
        
        }
        return success;
    }
    
    
    public boolean removeMedicine(String brandname){
        boolean success = false;
        boolean exist = false;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jframe", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `medicine` WHERE brandname='" + brandname + "'"); // only choose the medicine inputted from the view
        
            while (rs.next()) {
                if (rs.getString("brandname").equals(brandname)) {
                    try {
                        exist = true; // signifies that medicine existed
                        medicineModel medModel = new medicineModel();
                        
                        return success = medModel.removeMedicine(brandname);
                        
                    } catch (HeadlessException e) {
                        JOptionPane.showMessageDialog(null, "Error removing!!"); // This is something error while removing
                    }
                }                             
            }
            if(exist == false){
                JOptionPane.showMessageDialog(null, "Brand name do not exist!");  // if brand name you entered do not exist from the database              
            }
        } catch(ClassNotFoundException | SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null,"Error connecting to database!");
        }   
        return success;
    }
    
}
