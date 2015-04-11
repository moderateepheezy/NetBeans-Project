/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ShellSort;

/**
 *
 * @author simpumind
 */
public class ShellSortApp {
    
    public static void main(String[] args){
        int maxSize = 10;
        Arrayh arr = new Arrayh(maxSize);
        
        for(int i = 0; i < maxSize; i++){ //find array with random numbers
            double n = (int)(Math.random() * 99);
            arr.insert(n);
        }
        
        arr.display();
        arr.shellSort();
        arr.display();
    }
}
