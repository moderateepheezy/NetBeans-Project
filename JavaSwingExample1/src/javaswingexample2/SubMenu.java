/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingexample2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.security.KeyStore;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 *
 * @author simpumind
 */
public class SubMenu extends JFrame{
    
    public SubMenu(){
        setTitle("SubMenu");
        JMenuBar menubar = new JMenuBar();
        ImageIcon iconNew = new ImageIcon("new.png");
        ImageIcon iconOpen = new ImageIcon("open.png");
        ImageIcon iconSave = new ImageIcon("save.png");
        ImageIcon iconclose = new ImageIcon("close.png");
        
        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);
        
        JMenu ipm = new JMenu("Import");
        ipm.setMnemonic(KeyEvent.VK_M);
        
        JMenuItem newsf = new JMenuItem("Import news feeds list...");
        JMenuItem bookm = new JMenuItem("Import bookmarks...");
        JMenuItem mail = new JMenuItem("Import mail...");
        
        ipm.add(newsf);
        ipm.add(bookm);
        ipm.add(mail);
        
        JMenuItem fileNew = new JMenuItem("New", iconNew);
        fileNew.setMnemonic(KeyEvent.VK_N);
        
        JMenuItem fileOpen = new JMenuItem("Open", iconOpen);
        fileOpen.setMnemonic(KeyEvent.VK_O);
        
        JMenuItem fileSave = new JMenuItem("Save", iconSave);
        fileSave.setMnemonic(KeyEvent.VK_S);
        
        JMenuItem fileClose = new JMenuItem("Close", iconclose);
        fileClose.setMnemonic(KeyEvent.VK_C);
        
        fileClose.setToolTipText("Exit Application");
        fileClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
        
        fileClose.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.exit(0);
            }
        });
        
        
        file.add(fileNew);
        file.add(fileOpen);
        file.add(fileSave);
        file.addSeparator();
        file.add(ipm);
        file.addSeparator();
        file.add(fileClose);
        
        menubar.add(file);
        setJMenuBar(menubar);
        
        setSize(360, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String args[]){
        new SubMenu();
    }
}
