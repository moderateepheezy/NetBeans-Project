/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package priority_queue;

/**
 *
 * @author simpumind
 */
public class PriorityQ {
    
    //array in sorted order, from max at 0 to min at size -1
    private int maxSize;
    private double[] queArray;
    private int nItems;
    
    public PriorityQ(int s){
        maxSize = s;
        queArray = new double[maxSize];
        nItems = 0;
    }
    
    public void insert(double item){
        int j;
        if(nItems == 0){
            queArray[nItems++] = item;
        }
        else{
            for(j = nItems - 1; j >= 0; j--){
                if(nItems > queArray[j]){
                    queArray[j + 1] = queArray[j];
                }
                else{
                    break;
                }
            }
            queArray[j + 1] = item;
            nItems++;
        }
    }
    
    public void display(){
        for(int j = 0; j < nItems; j++){
            System.out.print(queArray[j] + " ");
        }
        System.out.println("");
    }
    
    public double remove(){
        return queArray[--nItems];
    }
    
    public double peekMin(){
        return queArray[nItems - 1];
    }
    
    public boolean isEmpty(){
        return nItems == 0;
    }
    
    public boolean isFull(){
        return (nItems == maxSize);
    }
}
