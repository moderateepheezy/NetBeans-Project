package learning.sockets;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simpumind
 */
public class GreetingClient {
    
    public static void main(String[] args){
        
        String serverName = null;
        if(args.length > 0){
            serverName = args[0];
        }
        int port = Integer.parseInt(args[1]);
        try{
            System.out.println("Connect to " +serverName + " on port " + port);
            Socket client = new Socket(serverName, port);
            System.out.println("Just connected to " + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);
            out.writeUTF("Hello from " + client.getLocalSocketAddress());
            
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);
            System.out.println("Server says " + in.readUTF());
            client.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
