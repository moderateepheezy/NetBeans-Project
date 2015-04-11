/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseclassone;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 *
 * @author simpumind
 */
public class DisplayAuthor {

    static final String DATABASE_URL = "jdbc:mysql://localhost/Books";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Connection connection = null; //manages connection
        Statement statement = null; // query statement
        ResultSet resultSet = null; // manages results
        
        //connect to database book and connect to database
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //establish connection to databse
            connection  = DriverManager.getConnection(DATABASE_URL, "root", "password");
            //create statement for querying database
            statement = connection.createStatement();
            
            //query database
            resultSet = statement.executeQuery("SELECT * FROM Authors");
            
            //process query results
            ResultSetMetaData  metaData = resultSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            System.out.println( "Authors Table of Books Database:\n" );
            for ( int i = 1; i <= numberOfColumns; i++ ){
                System.out.printf( "%-8s\t", metaData.getColumnName(i) );
            }
            System.out.println();
            while ( resultSet.next()){
            for ( int i = 1; i <= numberOfColumns; i++ ){
                System.out.printf( "%-8s\t", resultSet.getObject(i) );
            }
            System.out.println();
            } 
        } catch (ClassNotFoundException e) {
         System.out.println("Driver Error");
        }
        catch ( SQLException sqlException ){
            sqlException.printStackTrace();
        }
        finally{ // ensure resultSet, statement and connection are closed
           try{
               resultSet.close();
               statement.close();
               connection.close();
           } // end try
            catch ( Exception exception ){
                exception.printStackTrace();
            } // end catch
        } // end finally
    }
    
}
