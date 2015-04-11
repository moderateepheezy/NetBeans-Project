package addressbook;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;
public class AddServer extends HttpServlet {
  private static final String CONTENT_TYPE = "text/html";

  //Initialize global variables
  public void init() throws ServletException {
  }

  //Process the HTTP Get request
  public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType(CONTENT_TYPE);
    PrintWriter out = response.getWriter();
    String name=request.getParameter("contname");
    String phone=request.getParameter("contphone");
    String address=request.getParameter("contaddress");
    String user=request.getParameter("username");

    System.out.println("the values are as follows");
    System.out.println(name+address+phone+user);
    addDetail(user,name,phone,address);
    HttpSession session=request.getSession(true);
    response.sendRedirect("http://localhost:8080/WebModule1/AddSuccess.jsp");
//    HttpSession session1=request.getSession();
//    session1.setAttribute("AdminName",ob);
//    out.println("The session att ");



  }

  public void addDetail(String user,String name,String phone,String address ){

    try {

    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    Connection con = DriverManager.getConnection("jdbc:odbc:dsn","","");
    Statement st = con.createStatement();
    st.executeUpdate("insert into record(user,name,phone,address) values('"+user+"','"+name+"','"+phone+"','"+address+"')");
    st.close();
          }
    catch (Exception ex) { }
       }
  //Clean up resources
  public void destroy() {
  }
}
