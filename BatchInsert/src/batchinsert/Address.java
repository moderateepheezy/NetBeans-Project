/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batchinsert;

/**
 *
 * @author simpumind
 */
public class Address {
    
    public int AddressID;
    public String fristName;
    public String lastName;
    public String street;
    public String state;
    public String zip;

    public Address(){
        
    }

    public Address(String fristName, String lastName, String street, String city, String state, String zip) {
        this.fristName = fristName;
        this.lastName = lastName;
        this.street = street;
        this.state = state;
        this.zip = zip;
    }
    
    public int getAddressID() {
        return AddressID;
    }

    public void setAddressID(int AddressID) {
        this.AddressID = AddressID;
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    
    
}
