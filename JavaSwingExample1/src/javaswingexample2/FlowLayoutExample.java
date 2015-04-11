/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingexample2;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTree;

/**
 *
 * @author simpumind
 */
public class FlowLayoutExample extends JFrame{
    
    public FlowLayoutExample(){
        setTitle("FlowLayout Example");
        JPanel panel = new JPanel();
        
        JTextArea area = new JTextArea("text area");
        area.setPreferredSize(new Dimension(100, 100));
        
        JButton btn = new JButton("button");
        panel.add(btn);
        
        JTree tree = new JTree();
        panel.add(tree);
        
        panel.add(area);
        add(panel);
        
        pack();setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new FlowLayoutExample();
    }
}
