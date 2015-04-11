/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author simpumind
 */
public class BubbleSort {
    private double[] a;
    private int nElems;
    
    public BubbleSort(int max){
        a = new double[max];
        nElems = 0;
    }
    
    public void insert(double value){
        a[nElems] = value;
        nElems++;
    }
    
    public void display(){
        for(int j = 0; j < nElems; j++){
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }
    
    public void bubbleSort(){
        int out, in;
        for(out = nElems - 1; out > 1; out--){
            for(in = 0; in < nElems; in ++){
                if(a[in] > a[in + 1]){
                    swap(in, in + 1);
                }
            }
        }
    }
    
    public void swap(int one, int two){
        double temp = a[one];
        a[one] = a[two];
        a[two]  =temp;
    }
    
    public double getItem(int position){
        return a[position];
    }
}
