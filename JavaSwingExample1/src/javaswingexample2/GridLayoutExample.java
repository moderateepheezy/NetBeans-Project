/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingexample2;

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author simpumind
 */
public class GridLayoutExample extends JFrame{
    
    public GridLayoutExample(){
        setTitle("GridLayout");
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.setLayout(new GridLayout(5, 4, 5, 5));
        
        String btn[] = {
          "Cls", "Bck", "", "Close", "7", "8", "9", "/", 
          "4","5", "6", "*", "1", "2", "3", "-", "0", ".",
          "=", "+"  
        };
        
        for(int i = 0; i < btn.length; i++){
            if(i == 2){
                panel.add(new JLabel(btn[i]));
            }
            else{
                panel.add(new JButton(btn[i]));
            }
        }
        
        add(panel);
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new GridLayoutExample();
    }
}
