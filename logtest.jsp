<%@page language="java" session="true" import="javax.servlet.*, javax.servlet.http.*, java.sql.*" %>

<%! Connection con=null; %>
<%! Statement st; %>
<%! ResultSet rs; %>
<%! String pn=" ",phone=" ",sql; %>
<% response.setContentType("text/vnd.wap.wml"); %>

<?xml version="1.0"?>
<!DOCTYPE wml PUBLIC "-//WAPFORUM//DTD WML 1.1//EN" "http://www.wapforum.org/DTD/wml_1.1.xml">

<wml>
<card title="Signin validation.." >
<p>

<%

int valid=0;		
String m,as=" ", pwd=" ";
int i=0,j,l=1;

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:proj","parthi","lolo");
pn=request.getParameter("phno");
m=request.getParameter("pass");
st= con.createStatement();
rs=st.executeQuery("select pw from reg where pno='"+pn+"' ");

if(rs.next())
	pwd=rs.getString("pw");

	//out.println("get messg:" +m);
	//out.println("pwd from DB:" +pwd);

l=m.length();
long k[]=new long[l];

/*
   FOR ENCRYPTION--->

  Parthi Encryption Algorithm (PEA)- Find ascii value of each character in given string
  and it is multiplying with 1 to string length and also multiply with 8 
  
*/
	
      for(i=0,j=1;i<l&&j<=l;i++,j++) 
      {  k[i]=(long)m.charAt(i);
         k[i]=k[i]*j*8;
      }

      for(i=0;i<l;i++)
      {
         if(as.equals(" "))
            as=String.valueOf(k[i]);

         else
            as=as+String.valueOf(k[i]);
      }
	      //out.println("Final encrypted messg:" +as);


 	//compare the encrypted password and database password

	if(as.equals(pwd)) 
	{	
		session.putValue("phno",pn);
		valid=1;	
%>
	<a href="http://localhost:8000/service.jsp">Services </a>
<%
	}	
	else
	{
%>
	<b>! Invalid Mobile user or password !</b><br/><br/>
	<a href="http://localhost:8000/login.jsp">Try Again....</a>		
<%
	}  
%>
			
</p>
</card>
</wml>


