/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package using_stack_for_recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author simpumind
 */
public class StackTriangleApp {
    
    static int theNumber;
    static int theAnswer;
    static Stack theStack;;
    static int codePart;
    static Params theseParams;
    
    public static void main(String[] args) throws IOException{
        System.out.print("Enter a number");
        System.out.flush();
        theNumber = getInt();
        recTriangle();
        System.out.println("Triangle= "+theAnswer);
    }
    
    public static void recTriangle(){
        theStack = new Stack(50);
        codePart = 1;
        
        while(step() == false); //call step until it is true
    }
    
    public static boolean step(){
        switch(codePart){
            case 1:
                theseParams = new Params(theNumber, 6);
                theStack.push(theseParams);
                codePart = 2;
                break;
            case 2:
                theseParams = theStack.peek();
                if(theseParams.n == 1){ // test
                    theAnswer = 1;
                    codePart = 5; //exit
                }
                else{
                    codePart = 3; //recursive call
                }
                break;
            case 3:
                Params newParams = new Params(theseParams.n -1, 4);
                theStack.push(newParams);
                codePart = 2; //go entry method
                break;
            case 4:
                theseParams = theStack.peek();
                theAnswer = theAnswer + theseParams.n;
                codePart = 5;
                break;
            case 5:
                theseParams = theStack.peek();
                codePart = theseParams.returnAddress;
                theStack.pop();
                break;
            case 6:
                return true;
        }
        return false;
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
}
