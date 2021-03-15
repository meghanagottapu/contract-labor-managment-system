import javax.swing.*;
import java.awt.event.*;
import java.io.*; 
import java.util.*;
import java.awt.*;
import java.sql.*;

public class Details extends JFrame{
    Details(){
        JFrame j=new JFrame("LABOUR DETAILS");
        JLabel L1,L2,L3,L4,L5;
        L1=new JLabel("LABOUR NAME :");
        L2=new JLabel("LABOUR ID :");
        L3=new JLabel("NUMBER OF DAYS WORKED :");
        L4=new JLabel("WAGES PER DAY :");
        L5=new JLabel("CONTACT NUMBER :");  
                            
        L1.setBounds(150,300,200,30);
        L2.setBounds(150,350,200,30);
        L3.setBounds(150,400,200,30);
        L4.setBounds(150,450,200,30);
        L5.setBounds(150,500,200,30);
        
        
        JTextField t1=new JTextField("");
        t1.setBounds(350,300,200,30);
        JTextField t2=new JTextField("");
        t2.setBounds(350,350,200,30);
        JTextField t3=new JTextField("");
        t3.setBounds(350,400,200,30);
        JTextField t4=new JTextField("");
        t4.setBounds(350,450,200,30);
        JTextField t5=new JTextField("");
        t5.setBounds(350,500,200,30);
        
        j.add(t1);
        j.add(t2);
        j.add(t3);
        j.add(t4);
        j.add(t5);
        
        j.add(L1);
        j.add(L2);
        j.add(L3);
        j.add(L4);
        j.add(L5);
        
        JButton back = new JButton(new ImageIcon("back.png"));
        back.setBounds(800,150,100,80);
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e2){ 
                 j.dispose();
                 Labour l=new Labour();
  
            }
        });
        
        j.add(back);
        
        j.setSize(2000,2000);
        j.setLayout(null);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
}