/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author simpumind
 */
public class GetAllAddress extends HttpServlet {

    private ServletConfig config;
    String page = "BookEntry.jsp";

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        this.config = config;
    }
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp); //To change body of generated methods, choose Tools | Templates.
        
        Connection conn = null;
        String url = "jdbc:mysql://localhost/AddressBook";
        String userName = "root";
        String password = "password";
        PreparedStatement pst = null;       
        ResultSet rs = null;
        
        ArrayList<String> dataList = new ArrayList<>();
        try{
            int i = 0;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, userName, password);
            pst = conn.prepareStatement("");
            String sql = "SELECT * FROM ADDRESSES";
            pst.executeQuery(sql);
            rs = pst.getResultSet();
            while(rs.next()){
                dataList.add(rs.getString("AddressID"));
                dataList.add(rs.getString("FRISTNAME"));
                dataList.add(rs.getString("LASTNAME"));
                dataList.add(rs.getString("STREET"));
                dataList.add(rs.getString("CITY"));
                dataList.add(rs.getString("STATE"));
                dataList.add(rs.getString("ZIP"));
            }
        }catch (ClassNotFoundException e) {
         System.out.println("Driver Error");
        }
        catch ( SQLException sqlException ){
            sqlException.printStackTrace();
        } catch (InstantiationException ex) {
            Logger.getLogger(GetAllAddress.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(GetAllAddress.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{ // ensure resultSet, statement and connection are closed
           try{
               rs.close();
               pst.close();
               conn.close();
           } // end try
            catch ( Exception exception ){
                exception.printStackTrace();
            } // end catch
        } // end finally
        req.setAttribute("data", dataList);
        RequestDispatcher dispatcher = req.getRequestDispatcher(page);
    
    }

    
}
