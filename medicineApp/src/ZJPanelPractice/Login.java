
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





public class Login extends JPanel{
    
    private JButton login;
    private JTextField username;
    private JTextField password;
    
    JFrame f = new JFrame("Login"); 
    
    public Login(){
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
        
        
        JLabel unameLabel = new JLabel("Username: ");
        unameLabel.setFont(new Font("Serif", Font.BOLD, 40));
        unameLabel.setBounds(600, 150, 700, 100);
        
        //username = new JTextArea(100,100);
        username = new JTextField();
        username.setBounds(600,220,700,60);
        Font fonts = new Font("Serif", Font.BOLD, 40); 
        username.setFont(fonts); 
        
        JLabel passLabel = new JLabel("Password: ");
        passLabel.setFont(new Font("Serif", Font.BOLD,40));
        passLabel.setBounds(600,350,700,100);
        
        password = new JTextField();
        password.setBounds(600,420,700,60);
        password.setFont(fonts);
        
        
        JButton login = new JButton("Login");
        login.setFont(new Font("Serif", Font.BOLD, 40));
        login.setBounds(850, 550, 200, 60);
        
        
        JLabel title = new JLabel("Login");
        title.setFont(new Font("Serif", Font.BOLD, 80));
        title.setBounds(850, 50, 700, 100);
        

        this.add(title);
        this.add(s);
        this.add(unameLabel);
        this.add(username);
        this.add(passLabel);
        this.add(password);
        this.add(login);
        
 
        f.add(this); 
        f.setSize(new Dimension(1920, 1080));
        f.show();
        
        
    }
    
    
}
