<%@page language="java" import="java.sql.*" %>

<% response.setContentType("text/vnd.wap.wml"); %>
<?xml version="1.0"?>
<!DOCTYPE wml PUBLIC "-//WAPFORUM//DTD WML 1.1//EN" "http://www.wapforum.org/DTD/wml_1.1.xml">
<wml>
<card title="Delete SMS" >
<p>
<%
String sub=request.getParameter("sub");
String to=(String)session.getValue("phno");
out.println(sub);
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
}catch(ClassNotFoundException ex){out.println("SQL EXception");}
try
{
Connection cc=DriverManager.getConnection("jdbc:odbc:proj","parthi","lolo");
PreparedStatement p=cc.prepareStatement("delete * from smstable where to=? and subj=?");
p.setString(1,to);
p.setString(2,sub);
p.executeUpdate();
out.println("Deleted");

}catch(SQLException ee){out.println("SQL Error");}

%>	
</p>
</card>
</wml>
