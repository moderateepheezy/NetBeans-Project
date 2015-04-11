<%@ page language="java" import="java.sql.*" %>
<%!String time="", subj="",sql="",from="",to="",mesg=""; %>
<%! int bool=1;%>
<%
 to=(String)session.getValue("phno");
try{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
}catch(ClassNotFoundException cn){out.println("class not found");} 
try{
Connection con=DriverManager.getConnection("jdbc:odbc:proj","parthi","lolo");
Statement st=con.createStatement();
sql="select mfrom,subj,data  from smstable where to='"+to+"'";
ResultSet rs=st.executeQuery(sql);
while(rs.next())
{
	bool=0;	
	from=rs.getString("mfrom");
	subj=rs.getString("subj");
	mesg=rs.getString("data");
       
	
%>
<b>Welcome to</b> <% out.println(to); %>
<br><b>From:</b><% out.println(from); %>
<br><b>Subj:</b> <% out.println(subj); %>
<br><b>Message:</b><% out.println(mesg); %>


<br><hr>
<%
}

if(bool==1)
	out.println("You have no message");

}catch(SQLException sq){out.println("sql exception"); }
%>

