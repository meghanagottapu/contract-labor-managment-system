import javax.swing.*;
import java.awt.event.*;
import java.io.*; 
import java.util.*;
import java.awt.*;
import java.sql.*;

public class ContractorHomePage {
    ContractorHomePage(){
        JFrame j=new JFrame("CONTRACTOR HOMEPAGE");
        
        JLabel l1,l2,l3,l4;
        l1=new JLabel("CONTRACTOR NAME :");
        l2=new JLabel("CONTRACTOR ID :");
        l1.setBounds(50,50,200,30);
        l2.setBounds(50,100,200,30);
        
        JTextField t1,t2;
        t1=new JTextField("");
        t2=new JTextField("");
        t1.setBounds(200,50,100,30);
        t2.setBounds(200,100,100,30);
        
        JButton profile,labour_details;
        profile=new JButton("PROFILE");
        labour_details=new JButton("LABOUR DETAILS");
        profile.setBounds(100,200,100,30);
        labour_details.setBounds(300,200,200,30);
        profile.setCursor(new Cursor(Cursor.HAND_CURSOR));
        labour_details.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\meghana\\Desktop\\javaproject\\practice\\contract-labour-management-system-295-1.jpg");  
        Image icon_temp=icon.getScaledInstance(1000, 500, Image.SCALE_SMOOTH);
        j.setIconImage(icon_temp); 
        j.setLayout(null);     
        j.setSize(1000,1000);     
        j.setVisible(true); 
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        profile.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e2){ 
                 j.dispose();
                 Contractor_Profile r=new Contractor_Profile();
  
            }
        });
        labour_details.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e2){ 
                 j.dispose();
                 Labour labour=new Labour();
  
            }
        });
        JButton logout = new JButton(new ImageIcon("logout.png"));
        logout.setBounds(800,70,100,80);
        logout.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e2){ 
                 j.dispose();
                 LoginPage1 h=new LoginPage1();
  
            }
        });
   
        j.add(logout);
        j.add(l1);
        j.add(l2);
        j.add(t1);
        j.add(t2);
        j.add(profile);
        j.add(labour_details);
        
        j.setSize(2000,2000);
        j.setLayout(null);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
