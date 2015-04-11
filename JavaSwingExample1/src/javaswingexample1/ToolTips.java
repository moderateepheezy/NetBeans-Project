/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingexample1;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author simpumind
 */
public class ToolTips extends JFrame{
    
    Toolkit toolkit;
    
    public ToolTips(){
        setSize(300, 200);
        setTitle("Tool Tip");
        
        toolkit = getToolkit();
        
        Dimension size = toolkit.getScreenSize();
        setLocation((size.width - getWidth()) / 2, (size.height - getHeight()) / 2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        
        panel.setLayout(null);
        
        panel.setToolTipText("A panel container");
        
        
        JButton btn = new JButton("Button");
        btn.setBounds(100, 60, 100, 30);
        btn.setToolTipText("A button component");
        
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane pane = new JOptionPane();
                String xs = "Welcome";
                pane.showMessageDialog(pane, xs);
            }
        });
        
        panel.add(btn);
    }
    
    
    public static void main(String args[]){
        ToolTips tooltips = new ToolTips();
        tooltips.setVisible(true);
    }
}
