/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingexample2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.border.Border;

/**
 *
 * @author simpumind
 */
public class ToolBars extends JFrame{
    
    public ToolBars(){
        setTitle("ToolBars");
        JToolBar toolbar1 = new JToolBar();
        JToolBar toolbar2 = new JToolBar();
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
//        ImageIcon newi = new ImageIcon(getClass().getResource("new.png"));
//        ImageIcon open = new ImageIcon(getClass().getResource("open.png"));
//        ImageIcon save = new ImageIcon(getClass().getResource("save.png"));
//        ImageIcon exit = new ImageIcon(getClass().getResource("exit.png"));
        
        JButton newb = new JButton("New");
        JButton openb = new JButton("Open");
        JButton saveb = new JButton("Save");
        
        toolbar1.add(newb);
        toolbar1.add(openb);
        toolbar1.add(saveb);
        toolbar1.setAlignmentX(0);
        
        JButton exitb = new JButton("Exit");
        toolbar2.add(exitb);
        toolbar2.setAlignmentX(0);
        
        exitb.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        panel.add(toolbar1);
        panel.add(toolbar2);
        
        add(panel, BorderLayout.NORTH);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String args[]){
        new ToolBars();
    }
}
