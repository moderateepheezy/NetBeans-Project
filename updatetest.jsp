<%@page buffer="none" language="java" import="javax.servlet.*, javax.servlet.http.*, java.sql.*" %>

<%! Connection con=null; %>
<%! PreparedStatement pt; %>
<%! String pw,m="",phno,un,db,cit,st,cy,sql,str=""; %>
<%! Statement stmt; %>
<%! ResultSet rs; %>
<%! boolean b; %>
<% response.setContentType("text/vnd.wap.wml"); %>

<?xml version="1.0"?>
<!DOCTYPE wml PUBLIC "-//WAPFORUM//DTD WML 1.1//EN" "http://www.wapforum.org/DTD/wml_1.1.xml">

<wml>
<card title="New User Updation..." >
<p>
<%
phno=request.getParameter("pno");
un=request.getParameter("uname");
m=request.getParameter("pass");
db=request.getParameter("dob");
cit=request.getParameter("city");
st=request.getParameter("state");
cy=request.getParameter("country");

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:proj","parthi","lolo");

stmt=con.createStatement();
rs=stmt.executeQuery("select pno from reg where pno='"+phno+"' ");
b=rs.next();
if(b)
{
	out.println(rs.getString("pno"));
	out.println("This Phone number is already exist");
}
else
{

/* FOR ENCRYPTION--->

  Encryption method - Find ascii value of each character in given string
  and it is multiplying with 1 to string length and also multiply with 8 */

      int i,j,l=m.length();
      long k[]=new long[l];
      pw=" ";
	
	
      for(i=0,j=1;i<l&&j<=l;i++,j++) 
      {  k[i]=(long)m.charAt(i);  //find ascii value of each char
         k[i]=k[i]*j*8;
      }
      for(i=0;i<l;i++)
      {  
	 if(pw==" ") 		
            pw=String.valueOf(k[i]); //converting long to string

         else

            pw=pw+String.valueOf(k[i]);
      }

sql="insert into reg values(?,?,?,?,?,?,?)";
pt= con.prepareStatement(sql);

	pt.setString(1,phno);
	pt.setString(2,un);
	pt.setString(3,pw);
	pt.setString(4,db);
	pt.setString(5,cit);
	pt.setString(6,st);
	pt.setString(7,cy);
	pt.executeUpdate();
	con.commit();	
	out.println("updated");

%>
<br/>	<a href="http://localhost:8000/login.jsp">Sign in for confirmation</a>
	
<%
} %>

</p>
</card>
</wml>
