/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting.sortingobject;

/**
 *
 * @author simpumind
 */
public class Person {
    
    private String lastName;
    private String firstName;
    private int age;
    
    public Person(String last, String first, int a){
        lastName = last;
        firstName = first;
        age = a;
        }
    
    public void displayPerson(){
        System.out.print("Last name: " + lastName);
        System.out.print(", First name: " + firstName);
        System.out.println(", Age: " + age);
    }
    
    public String getLastName(){
        return lastName;
    }
}