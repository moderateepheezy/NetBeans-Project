/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingexample1;

import javax.swing.JFrame;

/**
 *
 * @author simpumind
 */
public class JavaSwingExample1 extends JFrame{
    
    public JavaSwingExample1(){
        setSize(300, 200);
        setTitle("Java Swing Test");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JavaSwingExample1 sample = new JavaSwingExample1();
        sample.setVisible(true);
    }
}
