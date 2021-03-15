import javax.swing.*;
import java.awt.event.*;
import java.io.*; 
import java.util.*;
import java.awt.*;
import java.sql.*;

public class LabourHomePage extends LoginPage{
    LabourHomePage(){
        JFrame j=new JFrame("LABOUR HPOMEPAGE");
        
        JLabel l1,l2,l3,l4,l5;
        l1=new JLabel("LABOUR NAME :");
        l2=new JLabel("LABOUR ID :");
        l3=new JLabel("NUMBER OF DAYS WORKED :");
        l4=new JLabel("WAGES PER DAY :");
        l5=new JLabel("CONTACT NUMBER :");
        
        l1.setBounds(50,50,200,30);
        l2.setBounds(50,100,200,30);
        l3.setBounds(150,200,200,30);
        l4.setBounds(150,250,200,30);
        l5.setBounds(150,300,200,30);
        
        JLabel t1,t2,t3,t4,t5;
        t1=new JLabel("");
        t2=new JLabel("");
        t3=new JLabel("");
        t4=new JLabel("");
        t5=new JLabel("");
        t1.setBounds(200,50,100,30);
        t2.setBounds(200,100,100,30);
        t3.setBounds(330,200,100,30);
        t4.setBounds(330,250,100,30);
        t5.setBounds(330,300,100,30);
        
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\meghana\\Desktop\\javaproject\\practice\\contract-labour-management-system-295-1.jpg");  
        Image icon_temp=icon.getScaledInstance(1000, 500, Image.SCALE_SMOOTH);
        j.setIconImage(icon_temp); 
        j.setLayout(null);     
        j.setSize(1000,1000);     
        j.setVisible(true); 
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton back = new JButton(new ImageIcon("logout.png"));
        back.setBounds(800,70,100,80);
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e2){ 
                 j.dispose();
                 LoginPage h=new LoginPage();
  
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
