/*9
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author simpumind
 */
public class PersonQueries {
    
    private static final String URL = "jdbc:derby:AddressBook";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";
    
    private Connection connection = null;
    private PreparedStatement selectAllPeople = null;
    private PreparedStatement selectPeopleByLastName = null;
    private PreparedStatement insertNewPerson = null;
    
    public PersonQueries(){
        try{
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //create query that selects all entries in the AddressBook
            connection.prepareStatement("SELECT * FROM Addresses");
            
            //create query that select entries with a specific last name
            selectPeopleByLastName = connection.prepareStatement("SELECT * FROM Addresses WHERE LastName = ?");
            
            //create insert that add a new entry into the database
            insertNewPerson = connection.prepareStatement(
                "INSERT INTO Addresses " +
                "FirstName, LastName, Email, PhoneNumber )"
                        + "VALUES(?, ?, ?, ?)");
        }catch(SQLException sqlException){
            sqlException.printStackTrace();
            System.exit(1);
        }
    }
    
    //select all the addresses in the database
    public List<Person> getAllPeople(){
        List<Person> result = null;
        ResultSet resultSet = null;
        
        try{
            //executeQuery returns ResultSet containing matching queries
            resultSet = selectAllPeople.executeQuery();
            result = new ArrayList<Person>();
            
            while(resultSet.next()){
                result.add(new Person(
                resultSet.getInt("addressID"),
                resultSet.getString("FirstName"),
                resultSet.getString("LastName"),
                resultSet.getString("Email"),
                resultSet.getString("PhoneNumber")));
            }
        }catch(SQLException sqlException){
            sqlException.printStackTrace();
        }finally{
            try{
                resultSet.close();
            }
            catch(SQLException sqlException){
                sqlException.printStackTrace();
                close();
            }
        }
        return result;
    }
    
    //select people by lastname
    public List<Person> getPeopleByLastName(String name){
        List<Person> results = null;
        ResultSet resultSet = null;
        
        try{
            selectPeopleByLastName.setString(1, name); //specify last name
            //executeQuery returns ResultSet containing matching entries
            resultSet = selectPeopleByLastName.executeQuery();
            results = new ArrayList<>();
            
            while(resultSet.next()){
                results.add(new Person(
                resultSet.getInt("addressID"),
                resultSet.getString("FirstName"),
                resultSet.getString("LastName"),
                resultSet.getString("Email"),
                resultSet.getString("PhoneNumber")));
            }
        }
        catch(SQLException sqlException){
            sqlException.printStackTrace();
        }
        finally{
            try{
                resultSet.close();
            }catch(SQLException sqlException){
                sqlException.printStackTrace();
                close();
            }
        }
        
        return results;
    }
    
    public int addPerson(String fname, String lname, String email, String num){
        int result = 0;
        
        //set parameters, then execute insertNewPerson
        try{
            insertNewPerson.setString(1, fname);
            insertNewPerson.setString(2, lname);
            insertNewPerson.setString(3, email);
            insertNewPerson.setString(4, num);
            
            //insert the new entry; returns # of row updatedq
            result = insertNewPerson.executeUpdate();
        }
        catch(SQLException sQLException){
            sQLException.printStackTrace();
            close();
        }
        
        return result;
    }
    
    public void close(){
        try{
            connection.close();
        }
        catch(SQLException sQLException){
            sQLException.printStackTrace(); 
        }
    }
}
