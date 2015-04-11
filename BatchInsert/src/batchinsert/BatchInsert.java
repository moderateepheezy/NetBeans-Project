/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batchinsert;

import java.util.Scanner;

/**
 *
 * @author simpumind
 */
public class BatchInsert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String fname, lname, street, city, state, zip;
        fname = input.nextLine();
        lname = input.nextLine();
        street = input.nextLine();
        city = input.nextLine();
        state = input.nextLine();
        zip = input.nextLine();
        Address address = new Address(fname, lname, street, city, state, zip);
        
        for(Address addressss : adde){
            
        }
    }
    
}
