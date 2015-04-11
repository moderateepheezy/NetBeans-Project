/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reserve.string.with.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author simpumind
 */
public class ReverseApp {
    
    public static void main(String[] args){
        String input, output;
        while(true){
            System.out.print("Enter a String: ");
            System.out.flush();
            try {
                input = getString();
                if(input.equals("")){
                     break;
                 }
                Reverse theReverse = new Reverse(input);
                output = theReverse.doRev();
            System.out.println("Reversed: " + output);
            } catch (Exception ex) {
                Logger.getLogger(ReverseApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static String getString() throws Exception{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
