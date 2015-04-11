<%@ page language="java" import="java.sql.*" %>
<% response.setContentType("text/vnd.wap.wml"); %> 

<?xml version="1.0"?>
<!DOCTYPE wml PUBLIC "-//WAPFORUM//DTD WML 1.1//EN" "http://www.wapforum.org/DTD/wml_1.1.xml">
<wml>
<card title="SMS-send-testing" >
<p> 
<%

String ph=(String)session.getValue("phno");
String cell=request.getParameter("to");
String subj=request.getParameter("subj");
String mesg=request.getParameter("mesg");

try{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
}
catch(ClassNotFoundException cle)
{
	out.println("class not found Exception"); 
} 
try
{
	
	Connection con=DriverManager.getConnection("jdbc:odbc:proj","parthi","lolo");
	String sql="insert into smstable(mfrom,to,subj,data) values(?,?,?,?)";	
	PreparedStatement pt=con.prepareStatement(sql);
	pt.setString(1,ph);
	pt.setString(2,cell);
	pt.setString(3,subj);
	pt.setString(4,mesg);
	pt.executeUpdate();
	pt.close();
	con.close();

 out.println("The message has been sent"); 

}

catch(SQLException sq)
{
	out.println("sql error"); 
}

%>
inside
</p>
</card>
</wml> 