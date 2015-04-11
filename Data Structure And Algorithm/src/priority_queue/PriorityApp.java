/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package priority_queue;

import java.io.IOException;

/**
 *
 * @author simpumind
 */
public class PriorityApp {
    
  public static void main(String[] args) throws IOException{
        PriorityQ thePQ = new PriorityQ(5);
        thePQ.insert(30);
        thePQ.insert(50);
        thePQ.insert(10);
        thePQ.insert(40);
        thePQ.insert(20);
        
        thePQ.display();
        
        while(!thePQ.isEmpty()){
            double item = thePQ.remove();
            System.out.print(item + " ");
        }
        System.out.println("");
    }
    
    //08171162636
}
