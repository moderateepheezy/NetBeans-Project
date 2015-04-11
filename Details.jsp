<?xml version="1.0" encoding="utf-8"?> 
<!DOCTYPE wml PUBLIC "-//WAPFORUM//DTD WML 1.3//EN" 
     "http://www.wapforum.org/DTD/wml13.dtd"> 
<wml>

<card id="card1" title="DIRECTORY">

  <p> 
  
    
  
     <%@ page language="java" import="java.sql.*" %>
     <% 
     try{
       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
       Connection c=DriverManager.getConnection("jdbc:odbc:proj","parthi","lolo");
       PreparedStatement ps=c.prepareStatement("select * from customer_details where Mobile_No=?");
       
       String Mob_no=request.getParameter("mob_no");
       ps.setString(1,Mob_no);
       ResultSet rs=ps.executeQuery(); 
       
       while(rs.next())
       {
        %>

	<big>
	        
	Name :<%= rs.getString(2) %>
        Place:<%= rs.getString(3) %>
        City :<%= rs.getString(4) %>
	
	</big>
        
      <% }
      }
      catch(Exception e) {}
      %>
        
  </p>
</card>
</wml>