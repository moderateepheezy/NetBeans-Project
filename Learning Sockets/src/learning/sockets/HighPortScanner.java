/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.sockets;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *Find out which of the ports at or 
 * above 1,024 seem to be hosting TCP servers
 * @author simpumind
 */
public class HighPortScanner {
    
    public static void main(String[] args){
        String host = "localhost";
        
        if(args.length > 0){
            host = args[0];
        }
        try{
            InetAddress theAdress = InetAddress.getByName(host);
            for(int i = 1024; i < 65536; i ++){
                try{
                    Socket theSocket = new Socket(theAdress, i);
                    System.out.println("There is a server on port " + i + " of " + host);
                }
                catch(IOException ex){
                    
                }
            }
        }
        catch(UnknownHostException ex){
            System.err.println(ex);
        }
    }
}
