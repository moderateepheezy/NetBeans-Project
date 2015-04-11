/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package link_list_2;

/**
 *
 * @author simpumind
 */
public class LinkList {
    
    private Link first;
    
    public LinkList(){
        first = null;
    }
    
    public void insertFirst(int id, double dd){
        Link newLink = new Link(id, dd);
        newLink.next = first;    // it points to the old first link
        first = newLink;
    }
    
    public Link find(int key){
        Link current = first;
        while(current.iData != key){
            if(current.next == null){ // if end of list,
                return null;            // didnt find it
            }
            else{               // not end of list,
                current = current.next; // go to next link
            }
        }
        return current;     // found it!
    }
    
    public Link delete(int key){ // delete link with given key (asumes not empty list)
        Link current  = first;  // search for link
        Link previous = first;
        while(current.iData != key){
            if(current.next == null){
                return null;    // didn't find it
            }
            else{
                previous = current;     // go to next link
                current = current.next;
            }
        }       // found it!
        if(current == first){   // if first link,
            first = first.next; // change first 
        }
        else{   // otherwise,
            previous.next = current.next;   // bypass it
        }
        return current;
    }
    
    public void displayList(){
        System.out.print("List (first-->last): ");
        Link current = first;  // start at beginning of list
        
        while(current != null)  {// until end of list,
            current.displayLink();  // print data
            current = current.next; // move to next link
        }
        System.out.println("");
    }
}
