/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingexample2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author simpumind
 */
public class Menu extends JFrame{
    
    public Menu(){
        setTitle("Menu");
        JMenuBar menubar = new JMenuBar();
        ImageIcon icon = new ImageIcon("exit.png");
        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);
        
        JMenuItem fileClose = new JMenuItem("Close", icon);
        fileClose.setMnemonic(KeyEvent.VK_C);
        fileClose.setToolTipText("Exit Application");
        fileClose.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.exit(0);
            }
        });
        
        file.add(fileClose);
        menubar.add(file);
        setJMenuBar(menubar);
        setSize(250, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    
    public static void main(String argd[]){
        new Menu();
    }
}
