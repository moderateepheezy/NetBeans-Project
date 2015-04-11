/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingexample2;

import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author simpumind
 */
public class Absolute extends JFrame{
    
    public Absolute(){
        setTitle("Absolute Positioning");
        setLayout(null);
        
        JButton ok = new JButton("Ok");
        ok.setBounds(50, 150, 80, 25);
        
        JButton close = new JButton("Close");
        close.setBounds(150, 150, 80, 25);
        
        add(ok);
        add(close);
        
        setSize(300, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String args[]){
        new Absolute();
    }
}
