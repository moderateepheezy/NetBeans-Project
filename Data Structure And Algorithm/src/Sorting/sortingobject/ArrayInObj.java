/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting.sortingobject;

/**
 *
 * @author simpumind
 */
public class ArrayInObj {
    
    private Person[] a;
    private int nElems;
    
    public ArrayInObj(int max){
        a = new Person[max];
        nElems = 0;
    }
    
    public void insert(String last, String first, int age){
        a[nElems] = new Person(last, first, age);
        nElems++;
    }
    
    public void display(){
        for(int j=0; j<nElems; j++){            
        // for each element,
        a[j].displayPerson();
        }
        // display it
        System.out.println("");
    }
    
    public void insertSort(){
        int in, out;
        for(out = 1; out < nElems; out++){
            Person temp = a[out];
            in = out;
            while(in > 0 && a[in - 1].getLastName().compareTo(temp.getLastName()) > 0){
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }
    }
}
