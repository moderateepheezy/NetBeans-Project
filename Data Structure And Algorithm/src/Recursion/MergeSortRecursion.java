/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author simpumind
 */
public class MergeSortRecursion {
    
    private double[] theArray;
    private int nElems;
    
    private MergeSortRecursion(int max){
        theArray = new double[max];
        nElems = 0;
    }
    
    public void insert(double value){
        theArray[nElems] = value;
        nElems++;
    }
    
    public void display(){// displays array contents

        for(int j=0; j<nElems; j++){// for each element,
            System.out.print(theArray[j] + " "); 
        }// display it
        System.out.println("");
    }
    
    public void mergeSort(){// called by main()
        // provides workspace
        double[] workSpace = new double[nElems];
        recMergeSort(workSpace, 0, nElems-1);
    }
    
    private void recMergeSort(double[] workSpace, int lowerBound,int upperBound){
        if(lowerBound == upperBound){
            return;
        }
        else{
            int mid = (lowerBound+upperBound) / 2; //find mid point
            recMergeSort(workSpace, lowerBound, mid); //sort low half
            recMergeSort(workSpace, mid+1, upperBound); //sort high half
            merge(workSpace, lowerBound, mid+1, upperBound); //merge them
        }
    }
    
    private void merge(double[] workSpace, int lowPtr, int highPtr, int upperBound){
        int j = 0;
        int lowerbound = lowPtr;
        int mid = highPtr - 1;
        int n =  (upperBound - lowerbound) + 1;
        
        while(lowPtr <= mid && highPtr <= upperBound){
            if(theArray[lowPtr] < theArray[highPtr]){
                workSpace[j++] = theArray[lowPtr++];
            }
            else{
                workSpace[j++] = theArray[highPtr++];
            }
        }
        while(lowPtr <= mid){
            workSpace[j++] = theArray[lowPtr++];
        }
        
        while(highPtr <= upperBound){
            workSpace[j++] = theArray[highPtr++];
        }
        
        for(j = 0; j < n; j++){
            theArray[lowerbound + j] = workSpace[j];
        }
    }
    
    public static void main(String[] args){
        int maxSize = 100;
        MergeSortRecursion arr = new MergeSortRecursion(maxSize);
                
        arr.insert(64);
        arr.insert(21);
        arr.insert(33);
        arr.insert(70);
        arr.insert(12);
        arr.insert(85);
        arr.insert(44);
        arr.insert(3);
        arr.insert(99);
        arr.insert(0);
        arr.insert(108);
        arr.insert(36);
        
        arr.display();
        arr.mergeSort();
        arr.display();
    }
}
