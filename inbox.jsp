<html>
<body>
<%@ page language="java" import="java.sql.*, java.net.* " %>
<%!String time="", subj="",sql="",from="",to="",mesg="",hname=""; %>
<%! int bool=1; %>
<%

try{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
}catch(ClassNotFoundException cn){out.println("class not found");} 
try{
hname=request.getParameter("hname");
//out.println(hname);
Connection con=DriverManager.getConnection("jdbc:odbc:sms");
Statement st=con.createStatement();
//sql="select * from smtable where to='sytem10'";
sql="select * from smtable where to='"+hname+"'";
ResultSet rs=st.executeQuery(sql);

while(rs.next())
{
	bool=0;	
	from=rs.getString("mfrom");
	to=rs.getString("to");
	time=rs.getString("time");
	subj=rs.getString("subj");
	mesg=rs.getString("data");
	
%>
<b>Welcome to</b> <% out.println(to); %>
<br><b>From:</b><% out.println(from); %>
<br><b>To:</b> <% out.println(to); %>
<br><b>Subj:</b> <% out.println(subj); %>
<br><b>Message:</b><% out.println(mesg); %>

<br><hr>
<%
}

if(bool==1)
	out.println("You have no message");

}catch(SQLException sq){out.println("sql exception"); }
%>

</body>
</html>