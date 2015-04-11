/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonObject;

/**
 *
 * @author simpumind
 */
public class Person {
    private String lastname;
    private String firstname;
    private int age;
    
    public Person(String last, String first, int a){
        lastname = last;
        firstname = first;
        age = a;
    }
    
    public void displayPerson(){
        System.out.println(" Lastname: " + lastname);
        System.out.println(" FirstName: " + firstname);
        System.out.println(" Age: " + age);
    }
    
    public String getLastName(){
        return lastname;
    }
}
