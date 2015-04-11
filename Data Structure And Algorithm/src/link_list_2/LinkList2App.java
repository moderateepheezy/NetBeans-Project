/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package link_list_2;

/**
 *
 * @author simpumind
 */
public class LinkList2App {
    
    public static void main(String[] args){
        LinkList theList = new LinkList();
        
        theList.insertFirst(22, 2.99);
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 8.99);
        
        theList.displayList();  //display list
        
        Link f = theList.find(44);
        if(f != null){
            System.out.println("Found link with key " + f.iData);
        }
        else{
            System.out.println("Can't find link");
        }
        
        Link d = theList.delete(66); // delete item
        
        if( d != null ){
            System.out.println("Deleted link with key " + d.iData);
        }
        else{
            System.out.println("Can't delete link");
        }
        theList.displayList();  //display it
    }
}
