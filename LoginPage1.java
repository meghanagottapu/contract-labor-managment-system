//CONTRACTOR LOGINPAGE
import javax.swing.*;
import java.awt.event.*;
import java.io.*; 
import java.util.*;
import java.awt.*;
import java.sql.*;

public class LoginPage1 {
    LoginPage1(){
    Font f=new Font("Serif",Font.BOLD,40);
        JFrame j=new JFrame("LOGIN");
        JPanel heading;
        heading=new JPanel();
        //heading.setBackground(new Color(128, 128, 255,90));//transparent color for header
        heading.setBounds(0,0,1000,50);
        JLabel name=new JLabel("LOGIN");
        name.setForeground(Color.BLACK);
        name.setFont(f);
        heading.add(name);
        j.add(heading);
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\meghana\\Desktop\\javaproject\\practice\\selection-335-500x500.png");    
        j.setIconImage(icon);    
        j.setLayout(null);     
        j.setSize(1000,1000);     
        j.setVisible(true); 
        JLabel l1,l2,l3,l4;
        l1=new JLabel("USERNAME");
        l1.setBounds(250,150,100,30);
        l2=new JLabel("PASSWORD");
        l2.setBounds(250, 200, 100,30);
        j.add(l1);
        j.add(l2);
        JTextField t1,t2;
        t1=new JTextField();
        t1.setBounds(400,150,200,30);
        j.add(t1);
        JPasswordField value;
        value=new JPasswordField();
        value.setBounds(400,200,200,30);
        j.add(value);
        JCheckBox cb1=new JCheckBox("FORGOT PASSWORD");
        cb1.setBounds(300,250,150,50);
        j.add(cb1);
        cb1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e1){
                JOptionPane.showInputDialog(j,"ENTER REGISTERED EMAIL-ID/MOBILE NUMBER:"); 
            }
        });
         JCheckBox cb2=new JCheckBox("REMEMBER ME");
        cb2.setBounds(500,250,200,50);
        j.add(cb2);
        JButton b1=new JButton("login");
        b1.setBounds(300,320,95,30);
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e1){
                if(t1.getText().contentEquals("")){
                    JOptionPane.showMessageDialog(j, "Username not entered");
                }
                    else{
                            if(value.getText().contentEquals("")){
                                JOptionPane.showMessageDialog(j, "Password not entered");}
                            else {
                                    if(t1.getText().contentEquals("contractor1") && value.getText().contentEquals("5684")) {
                                        JOptionPane.showMessageDialog(j,"LOGIN SUCCESSFUL"); 
                                        j.dispose();
                                        ContractorHomePage c=new ContractorHomePage();
                                    }
                                    else{
                                        
                                            JOptionPane.showMessageDialog(j, "Invalid Details");
                                        
                                        
                                        
                                    }
                            }
                }
                //JOptionPane.showMessageDialog(j,"LOGIN SUCCESSFUL"); 
                //j.dispose();
                //ContractorHomePage c=new ContractorHomePage();
            }
        });
        JButton b2=new JButton("sign-up");
        b2.setBounds(500,320,95,30);
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e2){ 
                 j.dispose();
                 Register1 r=new Register1();
  
            }
        });
         JButton back = new JButton(new ImageIcon("close.png"));
        back.setBounds(800,150,100,80);
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e2){ 
                 j.dispose();
                 Homepage h=new Homepage();
  
            }
        });
        
        j.add(back);
        j.add(b1);
        j.add(b2);
        j.setSize(2000,2000);
        j.setLayout(null);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
