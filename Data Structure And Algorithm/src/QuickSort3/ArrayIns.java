/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QuickSort3;

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
        insertionSort(0, nElems-1);
    }
    
    private void recQuickSort(int left, int right) {
        int size = right - left + 1;
        if(size < 10){
            insertionSort(left, right); //insertion sort if small
        }
        else{
            double median = medainOf3(left, right);
            int partition = partitionIt(left, right, median); //partition range
            recQuickSort(left, partition - 1); // sort left side
            recQuickSort(partition + 1, right); // sort right side
        }
    }
    
    private double medainOf3(int left, int right) {
        int center = (left + right) / 2;
        if(theArray[left] > theArray[center]){ //order left and center
            swap(left, center);
        }
        if(theArray[left] > theArray[right]){ //order left and right
            swap(left, right);
        }
        if(theArray[center] > theArray[right]){ //order center and right
            swap(center, right);
        }
        swap(center, right -1); //put pivot on the right
        return theArray[right - 1]; //return median value
    }
    
    public void swap(int dex1, int dex2) {
        double temp =  theArray[dex1];
        theArray[dex1] = theArray[dex2];
        theArray[dex2] = temp;
    }
    
    public int partitionIt(int left, int right, double pivot) {
        int leftPtr = left;
        int rightPtr = right - 1;
        while(true){
            while(theArray[++leftPtr] < pivot); // find bigger item
            while(theArray[--rightPtr] > pivot); // find smaller item
            
            if(leftPtr >= rightPtr){
                break;
            }
            else{
                swap(leftPtr, rightPtr);
            }
        }
        swap(leftPtr, right - 1);
        return  leftPtr;
    }
    
    private void insertionSort(int left, int right) {
        int in, out;
        for(out=left+1; out<=right; out++){
            double temp = theArray[out]; // remove marked item
            in = out;
            
            while(in>left && theArray[in-1] >= temp){
                theArray[in] = theArray[in-1]; // shift item to right
                --in; // go left one position;
            }
            theArray[in] = temp;
        }
    }
}
