/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structure.and.algorithm;

/**
 *
 * @author simpumind
 */
public class OrderArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int maxSize = 100;
        OrdArray arr = new OrdArray(maxSize);
            arr.insert(77);
            arr.insert(99);
            arr.insert(44);
            arr.insert(55);
            arr.insert(22);
            arr.insert(88);
            arr.insert(11);
            arr.insert(00);
            arr.insert(66);
            arr.insert(33);
            arr.display();
            int searchKey = 55;
            System.out.println("Found " + arr.size());
            if(arr.find(searchKey) != arr.size()){
                System.out.println("Found " + searchKey);
            }
            else{
                System.out.println("Not Found" + searchKey);
            }
            
            arr.display();
            arr.delete(33);
            
            arr.display();
    }
}
