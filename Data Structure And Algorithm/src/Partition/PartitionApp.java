/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Partition;

/**
 *
 * @author simpumind
 */
public class PartitionApp {
    
    public static void main(String[] args){
        int maxSize = 16;
        ArrayPar arr = new ArrayPar(maxSize);
        
        for(int i = 0; i < maxSize; i++){
            double n = (int)(Math.random() * 199);
            arr.insert(n);
        }
        
        arr.display();
        
        double pivot = 99; // pivot value
        System.out.print("Pivot is " + pivot);
        int size = arr.size();
        int partDex = arr.partitionIt(0, size - 1, pivot);
        System.out.println(", Partition is at index " + partDex);
        arr.display();
    }
}
