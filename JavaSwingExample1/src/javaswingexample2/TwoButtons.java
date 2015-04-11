/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingexample2;

import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author simpumind
 */
public class TwoButtons extends JFrame{
    
    public TwoButtons(){
        setTitle("Two Buttons");
        JPanel basic = new JPanel();
        basic.setLayout(new BoxLayout(basic, BoxLayout.Y_AXIS));
        add(basic);
        basic.add(Box.createVerticalGlue());
        
        JPanel bottom = new JPanel();
        bottom.setAlignmentX(1f);
        bottom.setLayout(new BoxLayout(bottom, BoxLayout.X_AXIS));
        
        JButton ok = new JButton("Ok");
        JButton close = new JButton("Close");
        
        bottom.add(ok);
        bottom.add(Box.createRigidArea(new Dimension(5, 0)));
        bottom.add(close);
        bottom.add(Box.createRigidArea(new Dimension(15, 0)));
        
        basic.add(bottom);
        basic.add(Box.createRigidArea(new Dimension(0, 15)));
        
        setSize(300, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    
    public static void main(String[] args){
        new TwoButtons();
    }
}
