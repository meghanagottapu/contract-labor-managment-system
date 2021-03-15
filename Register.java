//labour register pagess
import javax.swing.*;
import java.awt.event.*;
import java.io.*; 
import java.util.*;
import java.awt.*;
import java.sql.*;

public class Register {
    Register(){
     Font f=new Font("Serif",Font.BOLD,40);
        JFrame j=new JFrame("REGISTER");
        JPanel heading;
        heading=new JPanel();
        //heading.setBackground(new Color(255, 255, 255,50));
        heading.setBounds(0,0,1000,50);
        JLabel name=new JLabel("REGISTER");
        name.setForeground(Color.BLACK);
        name.setFont(f);
        heading.add(name);
        j.add(heading);
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\meghana\\Desktop\\javaproject\\practice\\selection-335-500x500.png");  
        Image icon_temp=icon.getScaledInstance(1000, 1000, Image.SCALE_SMOOTH);
        j.setIconImage(icon_temp);    
        j.setLayout(null);     
        j.setSize(1000,1000);     
        j.setVisible(true); 
        
        
        JLabel l0,l1,l2,l3,l4,l5,l6,l7,l8;
        l0=new JLabel("FIRSTNAME");
        l0.setBounds(250,250,100,30);
        l1=new JLabel("LASTNAME");
        l1.setBounds(250,300,100,30);
        l2=new JLabel("EMAIL-ID");
        l2.setBounds(250,350,100,30);
        l3=new JLabel("PASSWORD");
        l3.setBounds(250, 400, 100,30);
        l4=new JLabel("CONFIRM PASSWORD");
        l4.setBounds(250, 450, 100,30);
        l5=new JLabel("GENDER");
        l5.setBounds(250,500,100,30);
        l6=new JLabel("ADDRESS");
        l6.setBounds(250,550,100,30);
        l7=new JLabel("STATE");
        l7.setBounds(250,600,100,30);
        l8=new JLabel("MOBILE NUMBER");
        l8.setBounds(250,650,100,30);
        j.add(l0);
        j.add(l1);
        j.add(l2);
        j.add(l3);
        j.add(l4);
        j.add(l5);
        j.add(l6);
        j.add(l7);
        j.add(l8);
        j.setSize(1000,1000);
        JTextField t0,t1,t2,t3,t4;
        t0=new JTextField("");
        t0.setBounds(450,250,200,30);
        t1=new JTextField("");
        t1.setBounds(450,300,200,30);
        t2=new JTextField("");
        t2.setBounds(450,350,200,30);
        t3=new JTextField("");
        t3.setBounds(450,650,200,30);
        t4=new JTextField("");
        t4.setBounds(450, 550, 200,30);
        String country[]= {"--SELECT AN OPT--", "Andhra Pradesh", "Arunachal Pradesh" , " Assam" , " Bihar", "Chattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand" ,"Karnataka" ,"Kerala" , "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya",  "Mizoram" , "Nagaland", "Odisha" , "Punjab" ,"Rajasthan", "Sikkim", "Tamil Nadu" , "Telengana", "Tripura", "Uttar Pradesh"};    
        JComboBox cb=new JComboBox(country);   
        cb.setBounds(450, 600,200,30);  
        j.add(cb);        
        j.setLayout(null);    
        j.setSize(400,500);    
        j.setVisible(true); 
        j.add(t0);
        j.add(t1);
        j.add(t2);
        j.add(t3);
        j.add(t4);
        j.setSize(1000,1000);
        j.setLayout(null);
        j.setVisible(true);
        JPasswordField value,value1;
        value=new JPasswordField(""); 
        value.setBounds(450,400,200,30);
        value1=new JPasswordField(""); 
        value1.setBounds(450,450,200,30);
        j.add(value);
        j.add(value1);
        
        JRadioButton r1=new JRadioButton("MALE");
        JRadioButton r2=new JRadioButton("FEMALE");
        r1.setBounds(450,500,100,30);
        r2.setBounds(600,500,100,30);
        ButtonGroup bg= new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        j.add(r1);
        j.add(r2);
        
        JButton b1=new JButton("register");
        b1.setBounds(250,700,95,30);
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e1){
                String s=l2.getText();
                if(t1.getText().contentEquals(""))
                JOptionPane.showMessageDialog(j, "Firstname not entered");
                else if(t2.getText().contentEquals(""))
                JOptionPane.showMessageDialog(j, "lastname not entered");
                else if(value.getText().contentEquals(""))
                JOptionPane.showMessageDialog(j, "Password not entered");
                else if(value1.getText().contentEquals(""))
                JOptionPane.showMessageDialog(j, "Password confirmation not entered");
                else if(!(value.getText().contentEquals(value1.getText())))
		JOptionPane.showMessageDialog(j, "Password Not Matched");
                else if(!r1.isSelected() && !r2.isSelected())
                JOptionPane.showMessageDialog(j, "Gender not selected");
                else if(l2.getText().contentEquals(""))
                JOptionPane.showMessageDialog(j, "Email ID not entered");
                else {
                    
                    JOptionPane.showMessageDialog(j,"REGISTERED SUCESSFULLY");
                    j.dispose();
                    LoginPage login=new LoginPage();
                 //JOptionPane.showMessageDialog(j,"REGISTERED SUCESSFULLY");
                 //j.dispose();
                 //LoginPage login=new LoginPage();
            }
            }
        });
         JButton b2=new JButton("sign-in");
        b2.setBounds(400,700,95,30);
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e2){
                j.dispose();
                LoginPage login=new LoginPage();
                
            }
        });
        JButton b3=new JButton("close");
        b3.setBounds(600,700,95,30);
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e3){
                System.exit(0);
            }
        });
        
        j.add(b1);
        j.add(b2);
        j.add(b3);
        j.setLayout(null);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
    
}
