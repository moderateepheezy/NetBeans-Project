/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package using_stack_for_recursion;

/**
 *
 * @author simpumind
 */
public class Stack {
    
    private int maxSize;
    private Params[] stackArray;
    private int top;
    
    public Stack(int s){
        maxSize = s;
        stackArray = new Params[maxSize];
        top = -1;
    }
    
    public void push(Params p){ //put item on top of stack
        stackArray[++top] = p; //incresae top, insert item
    }
    
    public Params pop(){ //take item from top of stack
        return stackArray[top--]; //access item, decrement top
    }
    
    public Params peek(){ // peek at the top of stack
        return stackArray[top];
    }
}
