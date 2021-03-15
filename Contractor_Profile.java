import javax.swing.*;
import java.awt.event.*;
import java.io.*; 
import java.util.*;
import java.awt.*;
import java.sql.*;

public class Contractor_Profile {
    Contractor_Profile(){
        JFrame j=new JFrame("CONTRACTOR PROFILE");
        
        JLabel l1,l2,l3,l4,l5;
        l1=new JLabel("CONTRACTOR NAME :");
        l2=new JLabel("CONTRACTOR ID :");
        l3=new JLabel("MOBILE NUMBER :");
        l4=new JLabel("EMAIL-ID :");
        l5=new JLabel("BANK ACCOUNT NUMBER :");
        l1.setBounds(100,100,150,30);
        l2.setBounds(100,150,150,30);
        l3.setBounds(100,200,150,30);
        l4.setBounds(100,250,150,30);
        l5.setBounds(100,300,150,30);
        
        JTextField t1,t2,t3,t4,t5;
        t1=new JTextField("");
        t2=new JTextField("");
        t3=new JTextField("");
        t4=new JTextField("");
        t5=new JTextField("");
        t1.setBounds(300,100,150,30);
        t2.setBounds(300,150,150,30);
        t3.setBounds(300,200,150,30);
        t4.setBounds(300,250,150,30);
        t5.setBounds(300,300,150,30);
        
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\meghana\\Desktop\\javaproject\\practice\\contract-labour-management-system-295-1.jpg");  
        Image icon_temp=icon.getScaledInstance(1000, 500, Image.SCALE_SMOOTH);
        j.setIconImage(icon_temp); 
        j.setLayout(null);     
        j.setSize(1000,1000);     
        j.setVisible(true); 
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton back = new JButton(new ImageIcon("back.png"));
        back.setBounds(800,150,100,80);
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e2){ 
                 j.dispose();
                 ContractorHomePage h=new ContractorHomePage();
  
            }
        });
        j.add(back);
        j.add(l1);
        j.add(l2);
        j.add(l3);
        j.add(l4);
        j.add(l5);
        j.add(t1);
        j.add(t2);
        j.add(t3);
        j.add(t4);
        j.add(t5);
        
        j.setSize(2000,2000);
        j.setLayout(null);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
