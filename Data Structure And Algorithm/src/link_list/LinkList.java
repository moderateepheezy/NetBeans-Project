/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package link_list;

/**
 *
 * @author simpumind
 */
public class LinkList {
    
    private Link first;
    
    public void LinkList(){
        first = null;
    }
    
    public boolean isEmpty(){
        return (first == null);
    }
    
    public void insertFirst(int id, double dd){ // insert at start of list
        Link newLink = new Link(id, dd); // make new link
        newLink.next = first;  //newLink ---> old first
        first = newLink;   // first ----> newLink
    }
    
    public Link deleteFirst(){ // delete first item  (assumes list not empty
        Link temp = first;     // save reference to link
        first = first.next;    // delete it : first ---> old next
        return temp;           //return deleted link
    }
    
    public void displayList(){
        System.out.print("List (first --> last): ");
        Link current = first;       // start at beginning of list
        while(current != null){     // until end of list,
            current.displayLink();   // print data
            current = current.next; // move to next lin
        }
        System.out.println("");
    }
}
