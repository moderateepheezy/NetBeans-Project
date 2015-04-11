/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QuickSort2;

/**
 *
 * @author simpumind
 */
public class QuickSort2App {
    
    public static void main(String[] args){
        
        int maxSize = 16;
        ArrayIns arr = new ArrayIns(maxSize);
        
        for(int i = 0; i < maxSize; i++){
            double n = (int)(Math.random()*99);
            arr.insert(n);
        }
        
        arr.display();
        arr.quickSort();
        arr.display();
    }
}
