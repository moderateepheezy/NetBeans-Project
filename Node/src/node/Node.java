/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package node;

/**
 *
 * @author simpumind
 */
public class Node {
        int data;
  Node next;
  public Node(int d){
    data = d;
  }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        a.next = b;
        b.next = c;
        System.out.println(a.next.next.data);
    }
}
