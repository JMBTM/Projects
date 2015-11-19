/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File; 
import javax.imageio.ImageIO;
import javax.swing.*;  

/**
 *
 * @author OJT
 */
public class NewClass1 extends JFrame implements ActionListener{
    
    JButton b;
    Font f = new Font("Algerian", 18, 18);
    public NewClass1() {
    this.setVisible(true);
    this.setLayout(null);
    b = new JButton("Click Here");
    b.setSize(120,120);
    b.setBounds(380, 290, 120, 60);
    b.setBackground(Color.red);
    b.setForeground(Color.white);
    b.setFont(f);
    b.setVisible(true);
    b.addActionListener(this);
    add(b);
    setSize(1000, 800);
}
public void actionPerformed(ActionEvent e)
{
    if (e.getSource() == b) 
    {
        this.dispose();
        try {
            Thread.sleep(1000);
            Toolkit tk = Toolkit.getDefaultToolkit(); 
            Dimension d = tk.getScreenSize();
            Rectangle rec = new Rectangle(0, 0, d.width, d.height);  
            Robot ro = new Robot();
            BufferedImage img = ro.createScreenCapture(rec);
            File f = new File("C:/Users/OJT/Desktop/im1.jpg");//set appropriate path
            ImageIO.write(img, "jpg", f);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

    public static void main(String[] args){
       NewClass1 obj = new NewClass1();
}
}