/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author simpumind
 */
public class GreetingServer extends Thread{
    private ServerSocket serverSocket;
    
    public GreetingServer(int port)throws IOException{
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(10000);
    }
    
    public void run(){
        while(true){
            try{
                System.out.println("Waiting for client on port " + serverSocket.getLocalPort() + "...");
                Socket server = serverSocket.accept();
                System.out.println("Just connected to " + server.getRemoteSocketAddress());
                DataInputStream in = new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF("Thanks for connecting to " + server.getLocalSocketAddress() + "\nGoodbye!");
                server.close();
            }
            catch(IOException e){
                e.printStackTrace();
                break;
            }
        }
    }
    
    public static void main(String[] args){
        int port = Integer.parseInt(args[0]);
        try{
            Thread t = new GreetingServer(port);
            t.start();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
