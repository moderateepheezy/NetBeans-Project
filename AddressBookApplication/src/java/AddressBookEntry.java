/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author simpumind
 */
public class AddressBookEntry extends HttpServlet {

    static final String DATABASE_URL = "jdbc:mysql://localhost/AddressBook";
    
    Connection connection = null; //manages connection
        Statement statement = null; // query statement
        ResultSet resultSet = null; // manages results
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //establish connection to databse
            connection  = DriverManager.getConnection(DATABASE_URL, "root", "password");
            //create statement for querying database
            statement = connection.createStatement();
            String firstname = request.getParameter("f_name");
            String lastname = request.getParameter("l_name");
            String street = request.getParameter("street");
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String zipcode = request.getParameter("zipcode");
            
            //create a PreparedStatement to insert a new address book entry
            PreparedStatement addEntry = connection.prepareStatement("INSERT INTO ADDRESSES " +
                    "(FIRSTNAME,LASTNAME,STREET,CITY,STATE,ZIP)" +
                    "VALUES ( ?, ?, ?, ?, ?, ? )" );
            System.out.println("Afees");
            // specify the PreparedStatement's arguments
            addEntry.setString(1, firstname);
            addEntry.setString(2, lastname);
            addEntry.setString(3, street);
            addEntry.setString(4, city);
            addEntry.setString(5, state);
            addEntry.setString(6, zipcode);
            
            addEntry.executeUpdate();
            out.println("Inserted");
        }
        catch (ClassNotFoundException e) {
         System.out.println("Driver Error");
        }
        catch ( SQLException sqlException ){
            sqlException.printStackTrace();
        }
        finally{
            try{
                connection.close();
            }
            catch ( Exception exception ){
                exception.printStackTrace();
            }
        }
        
        RequestDispatcher rd = request.getRequestDispatcher("index.html");
                rd.include(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
