package ZJPanelPractice;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Register extends JPanel{
    
    private JButton register;
    private JTextField username;
    private JTextField password;
    private JTextField password1;
    private JTextField age;
    private JTextField money;
    
    JFrame f = new JFrame("Register"); 
    
    public Register(){
        // create a seperator 
        JSeparator s = new JSeparator(); 
          
        // set layout as vertical 
        s.setOrientation(SwingConstants.HORIZONTAL); 
        s.setBackground(Color.pink);
        
        
        this.setLayout(null);
        f.setLayout(null);       
        this.setBackground(Color.gray);
        this.setVisible(true);
        this.setBorder(BorderFactory.createLineBorder(Color.PINK));
        this.setSize(new Dimension(1920, 1080));
        
        
        Font fonts = new Font("Serif", Font.BOLD, 30); 
        
        JLabel title = new JLabel("Register");
        title.setFont(new Font("Serif", Font.BOLD, 80));
        title.setBounds(850, 50, 700, 100);
        
        JLabel usernameLabel = new JLabel("Enter username: ");
        usernameLabel.setFont(fonts);
        usernameLabel.setBounds(730, 150, 700, 100);
        
        username = new JTextField();
        username.setBounds(730,220,500,40);
        username.setFont(fonts);
        
        JLabel passwordLabel = new JLabel("Enter password: ");
        passwordLabel.setFont(fonts);
        passwordLabel.setBounds(730, 250, 700, 100);
        
        password = new JTextField();
        password.setBounds(730,320,500,40);
        password.setFont(fonts);
        
        JLabel password1Label = new JLabel("Confirm password: ");
        password1Label.setFont(fonts);
        password1Label.setBounds(730, 350, 700, 100);
        
        password1 = new JTextField();
        password1.setBounds(730,420,500,40);
        password1.setFont(fonts);
        
        JLabel ageLabel = new JLabel("Enter age: ");
        ageLabel.setFont(fonts);
        ageLabel.setBounds(730,450,700,100);
        
        age = new JTextField();
        age.setBounds(730,520,500,40);
        age.setFont(fonts);
        
        JLabel moneyLabel = new JLabel("Deposit money: ");
        moneyLabel.setFont(fonts);
        moneyLabel.setBounds(730,550,700,100);
        
        money = new JTextField();
        money.setBounds(730,620,500,40);
        money.setFont(fonts);
        
        JButton register = new JButton("Register");
        register.setFont(new Font("Serif", Font.BOLD, 40));
        register.setBounds(890, 700, 200, 60);
        
        
        
        
        
        
        
        
        
        
        this.add(title);
        this.add(usernameLabel);
        this.add(username);
        this.add(passwordLabel);
        this.add(password);
        this.add(password1Label);
        this.add(password1);
        this.add(ageLabel);
        this.add(age);
        this.add(moneyLabel);
        this.add(money);
        this.add(register);
        
        
        f.add(this); 
        f.setSize(new Dimension(1920, 1080));
        f.show();
        
        
        
    
    
    
    }
    
}
