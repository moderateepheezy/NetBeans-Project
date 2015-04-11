/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reserve.string.with.stack;

/**
 *
 * @author simpumind
 */
public class StackX {
    
    private int maxSize;
    private char[] stackArray;
    private int top;
    
    public StackX(int max){
        maxSize = max;
        stackArray = new char[maxSize];
        top = -1;
    }
    
    public void push(char j){
        stackArray[++top] = j;
    }
    
    public char pop(){
        return stackArray[top--];
    }
    
    public char peek(){
        return stackArray[top];
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }
}
