/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author simpumind
 */
public class TriangleApp {
    
    static int theNumber;
    
    public static int triangle(int n){
        System.out.println("Entering: n=" + n);
        if(n == 1){
            System.out.println("Returning 1");
            return 1;
        }
        else{
            int temp = n + triangle(n-1);
            System.out.println("Returning " + temp);
            return temp;
        }
    }
    
    public static String getString() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    
    public static int getInt() throws IOException{
        String s = getString();
        return Integer.parseInt(s);
    }
    
    public static void main(String[] args) throws IOException{
        System.out.print("Enter a number: ");
        System.out.flush();
        theNumber = getInt();
        int theAnswer = triangle(theNumber);
        System.out.println("Triangle = " + theAnswer);
    }
}
