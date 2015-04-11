<%@ page language="java" import="java.sql.* "%>
<% response.setContentType("text/vnd.wap.wml"); %>
<?xml version="1.0"?>
<!DOCTYPE wml PUBLIC "-//WAPFORUM//DTD WML 1.1//EN" "http://www.wapforum.org/DTD/wml_1.1.xml">
<wml> 
<card id="del" title="Delete SMS">
<p>
<center>Select Subject:<br/>

<%
String to=(String)session.getValue("phno");
String get="";
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
}catch(ClassNotFoundException cl){out.println("class not found");}
try
{
Connection cc=DriverManager.getConnection("jdbc:odbc:proj","parthi","lolo");
PreparedStatement p=cc.prepareStatement("select subj from smstable where to=?");
p.setString(1,to);
ResultSet rs=p.executeQuery();%>
<select name="sub">
<%while(rs.next())
{get=rs.getString(1);
%>
<option value="<%=get%>"><%=get%>
<onevent type="onpick" >
<go href= "http://localhost:8000/deletetest.jsp">
<postfield name="sub" value="$sub"/>
</go>
</onevent>
</option>
<%}%>
</select>
<%p.close();
cc.close();
}catch(SQLException ex){out.println("SQL ERROR");}
%>

 </center>
</p>
</card>   
</wml> 
