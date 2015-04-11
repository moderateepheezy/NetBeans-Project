/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package link_list;

/**
 *
 * @author simpumind
 */
public class LinkListApp {
    
    public static void main(String[] args){
        LinkList theList = new LinkList();
        
        theList.insertFirst(22, 2.99);
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 8.99);
        
        theList.displayList();  //display list
        
        while(!theList.isEmpty()){
            Link aLink = theList.deleteFirst();
            System.out.print("Deleted ");
            aLink.displayLink();
            System.out.println("");
        }
        theList.displayList();
    }
}
