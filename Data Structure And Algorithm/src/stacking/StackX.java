/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stacking;

/**
 *
 * @author simpumind
 */
public class StackX {
    
    private int maxSize;
    private double[] stackArray;
    private int top;
    
    public StackX(int s){
        maxSize = s;
        stackArray = new double[maxSize];
        top = -1;
    }
    
    public void push(double j){
        stackArray[++top] = j;
    }
    
    public double pop(){
        return stackArray[top--];
    }
    
    public double peek(){
        return stackArray[top];
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }
    
    //public boolean isFull(){
    //    return 
    //}
}
