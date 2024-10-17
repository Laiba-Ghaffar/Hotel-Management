
        
package hotel.management.system;
import java.awt.Choice;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import net.proteanit.sql.*;
import java.awt.Image;
import java.sql.*;
import net.proteanit.sql.*;

public class Manager extends JFrame implements ActionListener{
    JTable table;
    JButton back;
    Manager(){
        setLayout(null);
        getContentPane().setBackground(Color.white);
       // setBounds(550,270,1050,600);
        
        JLabel l1 = new JLabel("E-ID");
        l1.setBounds(30,10,100,20);
        add(l1);
        
        JLabel l2 = new JLabel("NAME");
        l2.setBounds(120,10,100,20);
        add(l2);
        
        JLabel l3 = new JLabel("AGE");
        l3.setBounds(200,10,100,20);
        add(l3);
        
        JLabel l4 = new JLabel("GENDER");
        l4.setBounds(300,10,100,20);
        add(l4);
        
        JLabel l5 = new JLabel("JOB");
        l5.setBounds(400,10,100,20);
        add(l5);
        
        JLabel l6 = new JLabel("SALARY");
        l6.setBounds(450,10,100,20);
        add(l6);
        
        JLabel l7= new JLabel("PHONE");
        l7.setBounds(550,10,100,20);
        add(l7);
        
        JLabel l8 = new JLabel("E-MAIL");
        l8.setBounds(650,10,100,20);
        add(l8);
        
         JLabel l9 = new JLabel("CNIC");
        l9.setBounds(750,10,100,20);
        add(l9);
          JLabel l10 = new JLabel("DID");
        l10.setBounds(850,10,100,20);
        add(l10);
        
          JLabel l11 = new JLabel("USERNAME");
        l11.setBounds(900,10,100,20);
        add(l11);
        
        
        table = new JTable();
        table.setBounds(0,40,1000,400);
        add(table);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee where job='Manager'");
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);  
        back.setBounds(420,500,120,30);
        back.addActionListener(this);
        add(back);
        
        setBounds(550,270,1000,600);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
//        try {
            setVisible (false);
            new Reception();
//        }catch(Exception s){
//            s.printStackTrace();
//        }
    }
    
    public static void main(String args[]){
        new Manager();
    }
}