/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Partition;

/**
 *
 * @author simpumind
 */
public class ArrayPar {
    
    private double[] theArray;
    private int nElems;
    
    public ArrayPar(int max){
        theArray = new double[max];
        nElems = 0;
    } 
    
    public void insert(double value){
        theArray[nElems] = value;
        nElems++;
    }
    
    public int size(){
        return nElems;
    }
    
    public void display(){
        System.out.print("A = ");
        for(int i = 0; i < nElems; i++){
            System.out.print(theArray[i] + " ");
        }
        System.out.println("");
    }
    
    public int partitionIt(int left, int right, double pivot){
        int leftPtr = left - 1; //right of first element
        int rightPtr = right +  1; //left of pivot
        
        while(true){
            while(leftPtr < right && theArray[++leftPtr] < pivot); //find bigger item
            while(rightPtr > left && theArray[--rightPtr] > pivot); //find smaller item
            if(leftPtr >= rightPtr){
                break;
            }
            else{
                swap(leftPtr, rightPtr);
            }
        }
        return leftPtr;
    }
    
    public void swap(int dex1, int dex2){
        double temp;
        temp = theArray[dex1]; // A into temp
        theArray[dex1] = theArray[dex2]; // B int A
        theArray[dex2] = temp; // temp into B
    }
}
