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
import javax.swing.JOptionPane;
import Controller.Controller;

/**
 *
 * @author tancincoja_sd2022
 */
public class addMedicineView extends javax.swing.JFrame {

    /**
     * Creates new form addMedicineView
     */
    public addMedicineView() {
        initComponents();
        this.setTitle("Add Medicine");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMedPanel = new javax.swing.JPanel();
        addMedicineLabel = new javax.swing.JLabel();
        genericNameLabel = new javax.swing.JLabel();
        brandNameLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        stockLabel = new javax.swing.JLabel();
        bName = new javax.swing.JTextField();
        gName = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        stock = new javax.swing.JTextField();
        addMedButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        medTypes = new javax.swing.JComboBox<>();
        medTypeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addMedicineLabel.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        addMedicineLabel.setText("Add Medicine");

        genericNameLabel.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        genericNameLabel.setText("Generic Name:");

        brandNameLabel.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        brandNameLabel.setText("Brand Name:");

        priceLabel.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        priceLabel.setText("Price:");

        stockLabel.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        stockLabel.setText("Stock:");

        bName.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        bName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNameActionPerformed(evt);
            }
        });

        gName.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        gName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gNameActionPerformed(evt);
            }
        });

        price.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N

        stock.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N

        addMedButton.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        addMedButton.setText("Add Medicine");
        addMedButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMedButtonMouseClicked(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        medTypes.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        medTypes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cough", "Headache", "Body Pain", "Allergies" }));
        medTypes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medTypesActionPerformed(evt);
            }
        });

        medTypeLabel.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        medTypeLabel.setText("Medicine Type:");

        javax.swing.GroupLayout addMedPanelLayout = new javax.swing.GroupLayout(addMedPanel);
        addMedPanel.setLayout(addMedPanelLayout);
        addMedPanelLayout.setHorizontalGroup(
            addMedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMedPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(addMedButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addGap(72, 72, 72))
            .addGroup(addMedPanelLayout.createSequentialGroup()
                .addGroup(addMedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addMedPanelLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(addMedicineLabel))
                    .addGroup(addMedPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(addMedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gName, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceLabel)
                            .addComponent(bName)
                            .addComponent(brandNameLabel)
                            .addComponent(genericNameLabel)
                            .addComponent(stockLabel)
                            .addComponent(stock)
                            .addComponent(price)
                            .addComponent(medTypeLabel)
                            .addComponent(medTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addMedPanelLayout.setVerticalGroup(
            addMedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMedPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addMedicineLabel)
                .addGap(27, 27, 27)
                .addComponent(brandNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(genericNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(priceLabel)
                .addGap(5, 5, 5)
                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stockLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(medTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addGroup(addMedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addMedButton))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addMedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addMedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        this.dispose();
        new pharmacistView().setVisible(true);
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void addMedButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMedButtonMouseClicked
        String gname = gName.getText();
        String bname = bName.getText();
        String cost1 = price.getText();
        String qty1 = stock.getText();
        String value = medTypes.getSelectedItem().toString();
        
        Controller medcontrol = new Controller();
        if(medcontrol.addMedicine(gname,bname,cost1,qty1,value) == true){
            JOptionPane.showMessageDialog(rootPane, "Medicine added!");
            this.dispose();
            new pharmacistView().setVisible(true);
            }
        
        
    }//GEN-LAST:event_addMedButtonMouseClicked

    private void gNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gNameActionPerformed

    private void bNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bNameActionPerformed

    private void medTypesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medTypesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medTypesActionPerformed

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
            java.util.logging.Logger.getLogger(addMedicineView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addMedicineView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addMedicineView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addMedicineView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new addMedicineView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMedButton;
    private javax.swing.JPanel addMedPanel;
    private javax.swing.JLabel addMedicineLabel;
    private javax.swing.JTextField bName;
    private javax.swing.JLabel brandNameLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField gName;
    private javax.swing.JLabel genericNameLabel;
    private javax.swing.JLabel medTypeLabel;
    private javax.swing.JComboBox<String> medTypes;
    private javax.swing.JTextField price;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField stock;
    private javax.swing.JLabel stockLabel;
    // End of variables declaration//GEN-END:variables
}
