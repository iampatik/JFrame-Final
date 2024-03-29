/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tancincoja_sd2022
 */
public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register() {
        initComponents();
        this.setTitle("Register");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Register = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        ConfirmPassword = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        Money = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        moneyField = new javax.swing.JTextField();
        registerSubmitButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        confirmpassField = new javax.swing.JPasswordField();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Register.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        Register.setText("Register");

        Username.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Username.setText("Username:");

        Password.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Password.setText("Password:");

        ConfirmPassword.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        ConfirmPassword.setText("Confirm Password:");

        Age.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Age.setText("Age:");

        Money.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Money.setText("Money:");

        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        moneyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moneyFieldActionPerformed(evt);
            }
        });

        registerSubmitButton.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        registerSubmitButton.setText("Register");
        registerSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerSubmitButtonActionPerformed(evt);
            }
        });

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(Register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(200, 200, 200))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Username)
                            .addComponent(Password)
                            .addComponent(ConfirmPassword)
                            .addComponent(Age)
                            .addComponent(ageField, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                            .addComponent(Money)
                            .addComponent(moneyField, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                            .addComponent(passwordField)
                            .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(confirmpassField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(registerSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(Password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ConfirmPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmpassField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Age)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Money)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(moneyField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerSubmitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(104, 104, 104))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void moneyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moneyFieldActionPerformed

    private void registerSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerSubmitButtonActionPerformed
        String uname = usernameField.getText();
        String pass = passwordField.getText();
        String conpass = confirmpassField.getText();
        String age1 = ageField.getText();
        String money1 = moneyField.getText();

        Controller acc = new Controller(); // Imported from the other package then constantiated the controller class to access methods
        if (acc.registerVerification(uname, pass, conpass, age1, money1) == true) { // if the returned value from the method that was called was true
            JOptionPane.showMessageDialog(rootPane, "Successfully registered!");
            this.dispose();
            Home home = null;
            try {
                home = new Home(); // constantiate the home class
                home.setVisible(true); // proceed to the other frame named Home
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
    }//GEN-LAST:event_registerSubmitButtonActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed

    }//GEN-LAST:event_passwordFieldActionPerformed

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Age;
    private javax.swing.JLabel ConfirmPassword;
    private javax.swing.JLabel Money;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Register;
    private javax.swing.JLabel Username;
    private javax.swing.JTextField ageField;
    private javax.swing.JPasswordField confirmpassField;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField moneyField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton registerSubmitButton;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
