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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        moneyField = new javax.swing.JTextField();
        registerSubmitButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        confirmpassField = new javax.swing.JPasswordField();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setText("Register");

        jLabel2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel2.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel3.setText("Password:");

        jLabel5.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel5.setText("Confirm Password:");

        jLabel6.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel6.setText("Age:");

        jLabel7.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel7.setText("Money:");

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
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(200, 200, 200))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(ageField, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                            .addComponent(jLabel7)
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
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmpassField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
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
//        

        String uname = usernameField.getText();
        String pass = passwordField.getText();
        String conpass = confirmpassField.getText();
        String age1 = ageField.getText();
        String money1 = moneyField.getText();

        Controller acc = new Controller();
        if (acc.registerVerification(uname, pass, conpass, age1, money1) == true) {
            JOptionPane.showMessageDialog(null, "Successfully registered!");
            this.dispose();
            Home1 home = null;
            try {
                home = new Home1();
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
            }
            home.setVisible(true);
        }

//        //int age = Integer.parseInt(age1);
        //double money = Double.parseDouble(money1);
        //User user = new User(int id, String username, String password, int age, double money);
//        boolean exist = true;
//        boolean passNotEquals = true;
//        Statement stmt = null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jframe", "root", "");
//            stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT * FROM `users`");
//            
//            while(rs.next()){
//                if(rs.getString("username").equals(uname)){
//                    JOptionPane.showMessageDialog(null, "Username already exist!");
//                }
//                else {
//                    if(pass.equals(conpass)){
//                        try {
//                            int age = Integer.parseInt(age1);
//                            if(age >=18){
//                                try{
//                                    double money = Double.parseDouble(money1);
//                                    String synt = "'" + uname + "','" + pass + "'," + age + "," + money;
//                                    String sql = "INSERT INTO `users`(`username`, `password`, `age`, `money`) VALUES (" + synt + ")";
//                                    stmt.executeUpdate(sql);
//                                    JOptionPane.showMessageDialog(null, "Registered!");
//                                    
//                                    Home1 home = new Home1();
//                                    home.setVisible(true);
//                                    this.dispose();
//                                    System.out.println("Successfully processed!");
//                                    break;
//                                    
//                                } catch(HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e){
//                                    JOptionPane.showMessageDialog(null, "Money should be a number!");
//                                    break;
//                                }
//                            }
//                            else {
//                                JOptionPane.showMessageDialog(null, "Age should be atleast 18 or above!");
//                                break;
//                            }
//                            
//                        
//                        } catch(HeadlessException | NumberFormatException e){
//                            JOptionPane.showMessageDialog(null, "Age should be a number!");
//                            break;
//                        }
//                    }
//                    else {
//                        JOptionPane.showMessageDialog(null, "Password did not match!");
//                        break;
//                    }
//                }
//            }
//            if (rs.next()) {
//                JOptionPane.showMessageDialog(null, "Username already exist!");
//            }
//            if (pass.equals(conpass)) {
//                try {
//                    int age = Integer.parseInt(age1);
//                    if (age >= 18) {
//                        try {
//                            double money = Double.parseDouble(money1);
//                            System.out.println("Naa diri ang pag-read");
//                            String synt = "'" + uname + "','" + pass + "'," + age + "," + money;
//                            String sql = "INSERT INTO `users`(`username`, `password`, `age`, `money`) VALUES (" + synt + ")";
//                            stmt.executeUpdate(sql);
//                            this.dispose();
//                            Home1 home = new Home1();
//                            home.setVisible(true);
//                        } catch (NumberFormatException exception) {
//                            JOptionPane.showMessageDialog(null, "Invalid input! Money should be a number!");
//                        }
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Age should atleast be 18 or 18 above to register!");
//                    }
//                    //System.out.println("the number was: " + extracted);
//                } catch (NumberFormatException exception) {
//                    JOptionPane.showMessageDialog(null, "Invalid input! Age should be a number!");
//                }
//
//            } else {
//                JOptionPane.showMessageDialog(null, "Password did not match!");
//            }
//            while (rs.next()) {
//                if (rs.getString("username").equals(uname)) {
//                    JOptionPane.showMessageDialog(null, "Username already exist!");
//                    break;
//                } else {
//                    if (pass.equals(conpass)) {
//                        try {
//                            int age = Integer.parseInt(age1);
//                            if (age >= 18) {
//                                try {
//                                    double money = Double.parseDouble(money1);
//                                    System.out.println("Naa diri ang pag-read");
//                                    String synt = "'" + uname + "','" + pass + "'," + age + "," + money;
//                                    Statement stmt1 = con.createStatement();
//                                    String sql = "INSERT INTO `users`(`username`, `password`, `age`, `money`) VALUES (" + synt + ")";
//                                    stmt1.executeUpdate(sql);
//                                    this.setVisible(false);
//                                    Home1 home = new Home1();
//                                    home.setVisible(true);
//                                    con.close();
//                                } catch (NumberFormatException exception) {
//                                    JOptionPane.showMessageDialog(null, "Invalid input! Money should be a number!");
//
//                                }
//                            } else {
//                                JOptionPane.showMessageDialog(null, "Age should atleast be 18 or 18 above to register!");
//                                break;
//                            }
//
//                        } catch (NumberFormatException exception) {
//                            JOptionPane.showMessageDialog(null, "Invalid input! Age should be a number!");
//
//                        }
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Password did not match!");
//                        break;
//                    }
//                }
//            }
//            con.close();
//        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error while connecting!");
//            System.out.println(e);
//        } 

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
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JPasswordField confirmpassField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField moneyField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton registerSubmitButton;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
