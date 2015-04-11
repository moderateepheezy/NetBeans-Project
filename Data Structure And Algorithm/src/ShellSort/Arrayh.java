/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ShellSort;

/**
 *
 * @author simpumind
 */
public class Arrayh {
    
    private double[] theArray;
    private int nElems; //number of elements
    
    public Arrayh(int max){
        theArray = new double[max];
        nElems = 0; //no elements yet
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
    
    public void shellSort(){
        int inner, outer;
        double temp;
        int h = 1;
        
        while(h <= nElems / 3){
            h = h * 3 + 1;
        }
        while(h > 0){
            for(outer = h; outer < nElems; outer++){
                temp = theArray[outer];
                inner = outer;
                
                while(inner > h - 1 && theArray[inner - h] >= temp){
                    theArray[inner] = theArray[inner - h];
                    inner -= h;
                }
                theArray[inner] = temp;
            }
            h = (h - 1) / 3;
        }
    }
}

