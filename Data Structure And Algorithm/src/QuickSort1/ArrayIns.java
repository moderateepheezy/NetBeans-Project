/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QuickSort1;

/**
 *
 * @author simpumind
 */
public class ArrayIns {
    private double[] theArray;
    private int nElems;
    
    public ArrayIns(int max){
        theArray = new double[max];
        nElems = 0;
    }
    
    public void insert(double value){
        theArray[nElems] = value;
        nElems++;
    }
    
    public void display(){
        System.out.print("A = ");
        for(int i = 0; i < nElems; i++){
            System.out.print(theArray[i] + " ");
        }
        System.out.println("");
    }
    
    public void quickSort(){
        recQuickSort(0, nElems - 1);
    }
    
    public void recQuickSort(int left, int right){
        if(right - left <= 0){
            return;
        }
        else{
            double pivot = theArray[right]; // rightmost item
            int partition = partitionIt(left, right, pivot); //partition range
            recQuickSort(left, partition - 1); // sort left side
            recQuickSort(partition + 1, right); // sort right side
        }
    }

    public int partitionIt(int left, int right, double pivot) {
        int leftPtr = left - 1;
        int rightPtr = right;
        while(true){
            while(theArray[++leftPtr] <pivot); // find bigger item
            while(rightPtr > 0 && theArray[--rightPtr] > pivot); // find smaller item
            
            if(leftPtr >= rightPtr){
                break;
            }
            else{
                swap(leftPtr, rightPtr);
            }
        }
        swap(leftPtr, right);
        return  leftPtr;
    }

    public void swap(int dex1, int dex2) {
        double temp =  theArray[dex1];
        theArray[dex1] = theArray[dex2];
        theArray[dex2] = temp;
    }
}
