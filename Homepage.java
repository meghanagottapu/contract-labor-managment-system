//HOMEPAGE
import javax.swing.*;
import java.awt.event.*;
import java.io.*; 
import java.util.*;
import java.awt.*;
import java.sql.*;

public class Homepage {   
   
       public static void main(String[]args){
         Font f=new Font("Serif",Font.BOLD,40);
        JFrame j=new JFrame("Contract Labour Managment System");
        
        
        JPanel heading;
        heading=new JPanel();
        
        heading.setBounds(0,0,1000,50);
        JLabel name=new JLabel("CONTRACT LABOUR MANAGMENT SYSTEM");
        name.setForeground(Color.BLACK);
        name.setFont(f);
        heading.add(name);
        j.add(heading);
        
        
        
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\meghana\\Desktop\\javaproject\\practice\\contract-labour-management-system-295-1.jpg");  
        Image icon_temp=icon.getScaledInstance(1000, 500, Image.SCALE_SMOOTH);
        j.setIconImage(icon_temp); 
        j.setLayout(null);     
        j.setSize(1000,1000);     
        j.setVisible(true); 
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel l1,l2,l3;
        l1=new JLabel("CONTRACTOR?");
        l2=new JLabel("LABOUR?");
        l1.setBounds(150,150,200,80);
        l2.setBounds(800,150,200,50);
        l1.setFont(new Font("Serif",Font.BOLD,25));
        l2.setFont(new Font("Serif",Font.BOLD,25));
        j.add(l1);
        j.add(l2);
        
        JButton b1 = new JButton(new ImageIcon("login.png"));
         b1.setBounds(140,300,100,80);
        JButton b2 = new JButton(new ImageIcon("signup.png"));
         b2.setBounds(320,300,100,80);
           j.add(b1);
           j.add(b2);
        l1=new JLabel("ALREADY A USER");
        l2=new JLabel("REGISTER");
        l3=new JLabel("LOGIN");
        l1.setBounds(80,400,200,50);
        l2.setBounds(320,400,200,50);
        l3.setBounds(140,430,200,50);
        l1.setFont(new Font("Serif",Font.ITALIC,25));
        l2.setFont(new Font("Serif",Font.ITALIC,25));
        l3.setFont(new Font("Serif",Font.ITALIC,25));
        j.add(l1);
        j.add(l2);
        j.add(l3);
           JButton b3 = new JButton(new ImageIcon("login.png"));
         b3.setBounds(700,300,100,80);
        JButton b4 = new JButton(new ImageIcon("signup.png"));
         b4.setBounds(900,300,100,80);
           j.add(b3);
           j.add(b4);
        l1=new JLabel("ALREADY A USER");
        l2=new JLabel("REGISTER");
        l3=new JLabel("LOGIN");
        l1.setBounds(650,400,200,50);
        l2.setBounds(900,400,200,50);
        l3.setBounds(700,430,200,50);
        l1.setFont(new Font("Serif",Font.ITALIC,25));
        l2.setFont(new Font("Serif",Font.ITALIC,25));
        l3.setFont(new Font("Serif",Font.ITALIC,25));
        j.add(l1);
        j.add(l2);
        j.add(l3);
        
         j.setSize(1500, 1000);
         j.setLayout(null);
	 j.setVisible(true);

        
        b1.addActionListener(new ActionListener()
               {
             public void actionPerformed(ActionEvent e)
                   {	
		      j.dispose();
		      LoginPage1 S  = new LoginPage1();
		    }
             });
        b3.addActionListener(new ActionListener()
               {
             public void actionPerformed(ActionEvent e)
                   {	
		      j.dispose();
		      LoginPage S  = new LoginPage();
		    }
             });

        b2.addActionListener(new ActionListener()
               {
             public void actionPerformed(ActionEvent e)
                   {	
		      j.dispose();
		      Register1 AL = new Register1();
		    }
             });
        b4.addActionListener(new ActionListener()
               {
             public void actionPerformed(ActionEvent e)
                   {	
		      j.dispose();
		      Register AL = new Register();
		    }
             });



       }

    
}
