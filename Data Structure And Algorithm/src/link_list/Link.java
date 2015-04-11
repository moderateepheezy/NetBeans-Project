/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package link_list;

/**
 *
 * @author simpumind
 */
public class Link {
    
    public int iData;    //data item
    public double dData;   //data item
    public Link next;
    
    public Link(int id, double dd){
        iData = id;
        dData = dd;
    }
    
    public void displayLink(){
        System.out.print("{" + iData + ", " + dData + "} ");
}
}
