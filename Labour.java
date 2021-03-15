import javax.swing.*;
import java.awt.event.*;
import java.io.*; 
import java.util.*;
import java.awt.*;
import java.sql.*;

public class Labour {
    Labour(){
        JFrame j=new JFrame("LABOUR DETAILS");
        
        JLabel l1,l2,l3,l4;
        l1=new JLabel("LABOUR NAME :");
        l2=new JLabel("LABOUR ID :");
        l1.setBounds(50,50,200,30);
        l2.setBounds(50,100,200,30);
        
        JTextField t1,t2;
        t1=new JTextField("");
        t2=new JTextField("");
        t1.setBounds(200,50,100,30);
        t2.setBounds(200,100,100,30);
        
        JButton profile;
        profile=new JButton("VIEW PROFILE");
        profile.setBounds(100,200,200,30); 
        
        profile.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e1){
                
                if(l1.getText().contentEquals(""))
                JOptionPane.showMessageDialog(j, "labour name is not entered");
                else if(l2.getText().contentEquals(""))
                JOptionPane.showMessageDialog(j, "labour id is not entered");
                else {
                    j.dispose();   
                    Details d=new Details();
                }
            }
        });
        
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
        j.add(t1);
        j.add(t2);
        j.add(profile);
        
        j.setSize(2000,2000);
        j.setLayout(null);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
