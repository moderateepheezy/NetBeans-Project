<%@ page language="java" %>
<%! String opt="", lang=""; %>
<% response.setContentType("text/vnd.wap.wml"); %>
<?xml version="1.0"?>
<!DOCTYPE wml PUBLIC "-//WAPFORUM//DTD WML 1.1//EN" "http://www.wapforum.org/DTD/wml_1.1.xml">

<wml>
<card title="Entertaintment Selection" >
<p>
<%
opt=request.getParameter("choice");
lang=request.getParameter("lang");

if(opt=="movie")
{
	if(lang=="tamil")
	{
%>
	<a href="http://localhost:8000/tmovie.jsp">Tamil Movie List </a>

<%	}
	else if(lang=="eng")
	{
%>
	<a href="http://localhost:8000/tmovie.jsp">English Movie List </a>	
<%	}
	else
	{
%>
	<a href="http://localhost:8000/tmovie.jsp">Hindi Movie List </a>	
<%
	} 
}
else 
{
	if(lang=="tamil")
	{
%>
	<a href="http://localhost:8000/tmovie.jsp">Tamil Song List </a>	
<%
	}
	else if(lang=="eng")
	{
%>
	<a href="http://localhost:8000/tmovie.jsp">English Song List </a>	
<%
	}
	else
	{
%>
	<a href="http://localhost:8000/tmovie.jsp">Hindi Song List </a>	
<%
	}
}
%>
</p>
</card>
</wml>