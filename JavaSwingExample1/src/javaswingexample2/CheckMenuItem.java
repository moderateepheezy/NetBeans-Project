/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingexample2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author simpumind
 */
public class CheckMenuItem extends JFrame{
    
    private JLabel statusbar;
    
    public CheckMenuItem(){
        setTitle("CheckMenuItem");
        JMenuBar menubar = new JMenuBar();
        
        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);
        
        JMenu view = new JMenu("View");
        view.setMnemonic(KeyEvent.VK_V);
        
        JCheckBoxMenuItem sbar = new JCheckBoxMenuItem("Show Statusbar");
        sbar.setState(true);
        
        sbar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent view) {
                if(statusbar.isVisible()){
                    statusbar.setVisible(false);
                }else{
                    statusbar.setVisible(true);
                }
            }
        });
        
        view.add(sbar);
        menubar.add(file);
        menubar.add(view);
        
        setJMenuBar(menubar);
        statusbar = new JLabel("Status Bar");
        statusbar.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        add(statusbar, BorderLayout.SOUTH);
        
        setSize(360, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new CheckMenuItem();
    }
}
