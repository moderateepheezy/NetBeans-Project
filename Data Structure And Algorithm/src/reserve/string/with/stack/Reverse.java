/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reserve.string.with.stack;

/**
 *
 * @author simpumind
 */
public class Reverse {
    
    private String input;
    private String output;
    
    public Reverse(String in){
        input = in;
    }
    
    public String doRev(){
        int stackSize = input.length();
        StackX theStack = new StackX(stackSize);
        
        for(int j = 0; j < input.length(); j++){
            char ch = input.charAt(j);
            theStack.push(ch);
        }
        output = "";
        while(!theStack.isEmpty()){
            char ch = theStack.pop();
            output = output + ch;
        }
        
        return output;
    }
}
