/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZJPanelPractice;

/**
 *
 * @author tancincoja_sd2022
 */
import java.awt.*;
import javax.swing.*;

public class PackMethodTest extends JFrame {
   public PackMethodTest() {
      setTitle("Pack() method Test");
      setLayout(new FlowLayout());
      setButton();
      pack(); // calling the pack() method
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);
   }
   void setButton() {
      for(int i=1; i < 6; i++) {
         add(new JButton("Button" +i));
      }
   }
   public static void main(String args[]) {
      new PackMethodTest();
   }
}
