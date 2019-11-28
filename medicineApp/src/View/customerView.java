/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tancincoja_sd2022
 */
public class customerView extends javax.swing.JFrame {

    /**
     * Creates new form customerView
     */
    String uname;
    
    public customerView() {
        initComponents();
        this.setTitle("Menu");
    }
    
    public customerView(String username){
        initComponents();
        this.setTitle("Menu");
        uname = username;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        depositButton = new javax.swing.JButton();
        viewBalanceButton = new javax.swing.JButton();
        orderButton = new javax.swing.JButton();
        viewMedicinesButton = new javax.swing.JButton();
        changePassButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 11, 386, 73));

        depositButton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        depositButton.setText("Deposit Balance");
        depositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonActionPerformed(evt);
            }
        });
        jPanel1.add(depositButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 243, 200, 70));

        viewBalanceButton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        viewBalanceButton.setText("View Balance");
        viewBalanceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewBalanceButtonMouseClicked(evt);
            }
        });
        viewBalanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBalanceButtonActionPerformed(evt);
            }
        });
        jPanel1.add(viewBalanceButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 129, 200, 70));

        orderButton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        orderButton.setText("Order");
        orderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderButtonMouseClicked(evt);
            }
        });
        orderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButtonActionPerformed(evt);
            }
        });
        jPanel1.add(orderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 200, 70));

        viewMedicinesButton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        viewMedicinesButton.setText("View Medicines");
        viewMedicinesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewMedicinesButtonMouseClicked(evt);
            }
        });
        jPanel1.add(viewMedicinesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 200, 70));

        changePassButton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        changePassButton.setText("Change Password");
        changePassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassButtonActionPerformed(evt);
            }
        });
        jPanel1.add(changePassButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 200, 70));

        logOutButton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        logOutButton.setText("Log Out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(logOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 200, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        this.setVisible(false);
        Home1 home = null;
        try {
            home = new Home1();
            home.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(customerView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(customerView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonActionPerformed
        this.dispose();
        depositView dep = new depositView(uname);
        dep.setVisible(true);
    }//GEN-LAST:event_depositButtonActionPerformed

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderButtonActionPerformed

    private void changePassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changePassButtonActionPerformed

    private void viewBalanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBalanceButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewBalanceButtonActionPerformed

    private void viewBalanceButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewBalanceButtonMouseClicked
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jframe", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `users` WHERE username='"+uname+"'");
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Your balance is: "+rs.getDouble("money")); 
            }
            
            con.close(); 
        } catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error!");
        }
    }//GEN-LAST:event_viewBalanceButtonMouseClicked

    private void orderButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderButtonMouseClicked
        new orderView(uname).setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_orderButtonMouseClicked

    private void viewMedicinesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMedicinesButtonMouseClicked
        this.dispose();
        new viewMedTable(uname).setVisible(true);
    }//GEN-LAST:event_viewMedicinesButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(customerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new customerView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changePassButton;
    private javax.swing.JButton depositButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton orderButton;
    private javax.swing.JButton viewBalanceButton;
    private javax.swing.JButton viewMedicinesButton;
    // End of variables declaration//GEN-END:variables


    

}
