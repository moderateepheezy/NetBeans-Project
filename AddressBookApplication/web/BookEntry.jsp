<%-- 
    Document   : BookEntry
    Created on : Apr 5, 2015, 1:44:31 PM
    Author     : simpumind
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>All Address Book Entries</h1>
        <table>
    <thead>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Street</th>
        <th>City</th>
        <th>State</th>
        <th>Zip Code</th>
    </thead>
    <tbody>
        <% Iterator <String> itr; %>
        <% List data = (List)request.getAttribute("data");
        for(itr = data.iterator();
                itr.hasNext();){%>
                <tr>
                    <%String s =(String)itr.next(); %>
                    <td><%=itr.next()%>></td>
    <tr><td><%=itr.next()%>></td>
    <tr><td><%=itr.next()%>></td>
    <tr><td><%=itr.next()%>></td>
    <tr><td><%=itr.next()%>></td>
    <tr><td><%=itr.next()%>></td>
    <tr><td><%=itr.next()%>></td>
        <tr><td><%=itr.next()%>></td>
        <tr><td><%=itr.next()%>></td>
<tr><td><%=itr.next()%>></td>
    <tr><td><%=itr.next()%>></td>
    <tr><td><%=itr.next()%>></td>
    <tr><td><%=itr.next()%>></td>
    <tr><td><%=itr.next()%>></td>
    <tr><td><%=itr.next()%>></td>
    <tr><td><%=itr.next()%>></td>
    <tr><td><%=itr.next()%>></td></tr><%} %>
    </tbody>
</table>
    </body>
</html>
