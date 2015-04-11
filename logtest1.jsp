<%@page language="java" session="true" import="javax.servlet.*, javax.servlet.http.*, java.sql.*" %>

<% response.setContentType("text/vnd.wap.wml"); %>

<?xml version="1.0"?>
<!DOCTYPE wml PUBLIC "-//WAPFORUM//DTD WML 1.1//EN" "http://www.wapforum.org/DTD/wml_1.1.xml">

<wml>
<card title="Signin validation.." >
<p>
<%
out.println(request.getParameter("api_id"));
out.println(request.getParameter("to"));
out.println(request.getParameter("text"));
out.println(request.getParameter("user"));
out.println(request.getParameter("password"));
%>
</p>
</card>
</wml>


