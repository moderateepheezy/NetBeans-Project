/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingexample1;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author simpumind
 */
public class JavaSwingExample2 extends JFrame{
    
    public JavaSwingExample2(){
        setSize(300, 200);
        setTitle("Center on Screen");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }
    
    
    public static void main(String[] args){
        JavaSwingExample2 sample2 = new JavaSwingExample2();
        sample2.setVisible(true);
    }
}
