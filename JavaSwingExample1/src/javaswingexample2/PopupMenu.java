/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingexample2;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author simpumind
 */
public class PopupMenu {
    
    private JPopupMenu menu;
    private Toolkit toolkit;
    
    public PopupMenu(){
        
       JFrame frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       toolkit = frame.getToolkit();
       
       menu = new JPopupMenu();
       JMenuItem menuItemBeep = new JMenuItem("Beep");
       
       menuItemBeep.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                toolkit.beep();
            }
        });
       
       menu.add(menuItemBeep);
       
       JMenuItem menuItemClose = new JMenuItem("Close");
       menuItemClose.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });
       
       menu.add(menuItemClose);
       
       frame.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseReleased(MouseEvent e) {
                if(e.getButton() == e.BUTTON3){
                    menu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
       });
       
       frame.setSize(250, 200);
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);
    }
    
    public static void main(String[] args){
        new PopupMenu();
    }
}
