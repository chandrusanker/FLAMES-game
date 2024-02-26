/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flames;

/**
 *
 * @author Asus
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class flamesAWT extends WindowAdapter implements ActionListener {
    Frame f;
    Button b;
    TextField t1;
    TextField t2;
    TextField t3;
    
    flamesAWT()
    {
        
    f=new Frame("FLAMES");
    f.setBackground(Color.RED);
    b=new Button("Submit");
    
    t1=new TextField("Name 1");
    t2=new TextField("Name 2");
    t3=new TextField();
    t1.setBounds(50,50 , 200, 100);
    t2.setBounds(50, 150, 200, 100);
    t3.setBounds(50, 450, 200, 100);
    b.setBounds(50, 350,200, 100);
    Font font1 = new Font("SansSerif", Font.BOLD, 40);
    t3.setFont(font1);
    f.add(t1);
    f.add(t2);
    f.add(t3);
    f.add(b);
    f.setSize(400,800);
    f.setVisible(true);
    
    f.addWindowListener(this);
    
    b.addActionListener(this);
    
    }
    
    
    @Override
    public void windowClosing(WindowEvent e) {
        f.dispose();
    }
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
        String a=t1.getText().toUpperCase();
        String k=t2.getText().toUpperCase();
        
      operationOfFlames obj =new operationOfFlames();
       String out= obj.flames(a,k);
       
       t3.setText(out);
        }
    }
    
}
