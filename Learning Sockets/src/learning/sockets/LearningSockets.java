/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.sockets;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Findind out which of the first
 * 1,024 ports seems to be hosting 
 * TCP servers on a specified host
 */    

/**
 *
 * @author simpumind
 */
public class LearningSockets {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String host = "localhost";
        if(args.length > 0){
            host = args[0];
        }
        
        for(int i = 0; i < 1024; i++){
            try{
                Socket s = new Socket(host, i);
                System.out.println("There is a server on the port " + i + " of " + host);
            }
            catch(UnknownHostException ex){
                System.err.println(ex);
                break;
            }
            catch(IOException ex){
                
            }
        }
    }
}
