/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue_class_without_no_of_items;

/**
 *
 * @author simpumind
 */
public class Queue {
    
    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    
    public Queue(int s){
        maxSize = s + 1;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
    }
    
    public void insert(int j){
        if(rear == maxSize -1){
            rear = -1;
        }
        queArray[++rear] = j;
    }
    
    public int remove(){
        int temp = queArray[front++];
        if(front == maxSize){
            front = 0;
        }
        return temp;
    }
    
    public int peek(){
        return queArray[front];
    }
    
    public boolean isEmpty(){
        return (rear + 1 == front || (front + maxSize -1 == rear));
    }
    
    public boolean isFull(){
        return (rear + 2 == front || (front + maxSize - 2 == rear));
    }
    
    public int size(){
        if(rear >= front){
            return rear - front + 1;
        }
        else{
            return (maxSize - front) + (rear + 1);
        }
    }
}
