/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseresultsettabelmodel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author simpumind
 */
public class ResultSetTabelModel extends AbstractTableModel {

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private ResultSetMetaData metaData;
    private int numberOfRows;

    //keep databse connection status
    private boolean connectedToDatabase = false;

    // constructor initializes resultSet and obtains its meta data object;
    // determines number of rows
    public ResultSetTabelModel(String url, String username, 
            String password, String query) throws SQLException {
        
        //connect to database
        connection = DriverManager.getConnection(url, username, password);
        
        //create statement to query database
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                ResultSet.CONCUR_READ_ONLY);
        
        //update database connection status
        connectedToDatabase = true;
        
        //set query and execute it
        setQuery(query);
    }
    
    public Class getColumnClass(int column) throws IllegalStateException{
        //ensure database connection is available
        if(!connectedToDatabase){
            throw new IllegalStateException("Not connected to database");
        }
        
        //determine java class of column
        try{
            String className = metaData.getColumnClassName(column + 1);
            //return object that represents className
            return Class.forName(className);
        }
        catch(Exception exception){
            exception.printStackTrace();
        }
        
        return Object.class; // if problems occur above, assume type Object    
    }
    
    //get number of columns in ResultSet
    public int getColumnCount() throws IllegalStateException{
        //ensure database connection is available
        if(!connectedToDatabase){
            throw new IllegalStateException( "Not Connected to Database" );
        }
        
        //// determine number of columns
        try{
            return metaData.getColumnCount();
        }
        catch(SQLException sqlException){
            sqlException.printStackTrace();
        }
        
        return 0;
    }

    @Override
    public String getColumnName(int column) throws IllegalStateException{
        // ensure database connection is available
        if ( !connectedToDatabase ){
            throw new IllegalStateException( "Not Connected to Database" );
        }
        // determine column name
        try{
            return metaData.getColumnName( column + 1 );
        } // end try
        catch ( SQLException sqlException ){
            sqlException.printStackTrace();
        } // end catch
        return "";
    }
    
    
    @Override
    public int getRowCount() throws IllegalStateException{
        // ensure database connection is available
        if ( !connectedToDatabase ){
            throw new IllegalStateException( "Not Connected to Database" );
        }
        return numberOfRows;
    }

    @Override
    public Object getValueAt(int row, int column) throws IllegalStateException{
        //ensure database connection is available
        if(!connectedToDatabase){
            throw new IllegalStateException("Not connected to databse");
        }
        //obtain a value at specified ResultSet row and column
        try{
            resultSet.absolute(row + 1);
            return resultSet.getObject(column + 1);
        }
        catch(SQLException sqlException){
            sqlException.printStackTrace();
        }
        
        return ""; // if problems, return empty string object
    }
    
    public void setQuery(String query)
            throws SQLException, IllegalStateException{
        // ensure database connection is available
        if ( !connectedToDatabase ){
            throw new IllegalStateException("Not connected to Database");
        }
        
        //specify query and execute it
        resultSet = statement.executeQuery(query);
        
        //obtain metadata for ResultSet
        metaData = resultSet.getMetaData();
        
        //determine number of rows in ResultSet
        resultSet.last(); //move to the last row
        numberOfRows =resultSet.getRow(); // get the row number
        
        //notify JTable that model has changed
        fireTableDataChanged();
    }
    
    public void disconnectFromDatabase(){
        if(connectedToDatabase){
            //close connection and statement
            try{
                resultSet.close();
                statement.close();
                connection.close();
            }catch(SQLException sqlException){
                sqlException.printStackTrace();
            }finally{// update database connection status
                connectedToDatabase = false;
            }
        }
    }

}
