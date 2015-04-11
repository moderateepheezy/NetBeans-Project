/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package link_list_2;

/**
 *
 * @author simpumind
 */
public class Link {
    
    public int iData;
    public double dData;
    public Link next;
    
    public Link(int id, double dd){
        iData = id;
        dData = dd;
    }
    
    public void displayLink(){
        System.out.print("{" + iData + ", " + dData + "} ");
    }
}
