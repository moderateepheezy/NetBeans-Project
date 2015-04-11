<%@ page language="java" import="java.sql.*, java.util.*"  %>
<%! String times="",str="",from="",subj="",mesg="",sql="",arr[]; %>
<%! Connection con=null; %>
<%! PreparedStatement pt=null; %>
<%! int h,m,s; %>
<% response.setContentType("text/vnd.wap.wml"); %>

<?xml version="1.0"?>
<!DOCTYPE wml PUBLIC "-//WAPFORUM//DTD WML 1.1//EN" "http://www.wapforum.org/DTD/wml_1.1.xml">
<wml>

<card title="SMS Messg Sending..." >

<onevent type="onenterforward">
<refresh>
	<setvar name="get" value=""/>
</refresh>
</onevent>	

<p> 

<%
int i=0;
str=request.getParameter("send");

StringTokenizer st=new StringTokenizer(str,"/");

arr=new String[5];
while(st.hasMoreTokens())
{	arr[i]=st.nextToken();
	i=i+1;
}
Calendar cl=Calendar.getInstance();
h=cl.get(Calendar.HOUR);
m=cl.get(Calendar.MINUTE);
s=cl.get(Calendar.SECOND);
times=Integer.toString(h)+":"+Integer.toString(m)+":"+Integer.toString(s);

arr[i]=times;
i=i+1;
try{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
}
catch(ClassNotFoundException cle)
{
	out.println("class not found Exception"); 
} 

try
{
	int j=0,k=1;
	con=DriverManager.getConnection("jdbc:odbc:proj","parthi","lolo");
	sql="insert into smtable values(?,?,?,?,?)";	
	pt=con.prepareStatement(sql);

	while(j<i)
	{
	  pt.setString(k,arr[j]);
	  j=j+1;
	  k=k+1;	
	}
	pt.executeUpdate();
	con.commit();

 out.println("The message has been sent"); 

}

catch(SQLException sq)
{
	out.println("sql error"); 
} 

%>
</p>
</card>
</wml>