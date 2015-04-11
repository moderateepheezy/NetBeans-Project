<%@ page language="java" %>
<%! String opt="", lang=""; %>
<% response.setContentType("text/vnd.wap.wml"); %>
<?xml version="1.0"?>
<!DOCTYPE wml PUBLIC "-//WAPFORUM//DTD WML 1.1//EN" "http://www.wapforum.org/DTD/wml_1.1.xml">

<wml>  
  <card id="sms" title="SMS">   
    <p align="left"> 
		<a href="http://localhost:8000/smschoice.jsp">Send</a><br/>
		<a href="http://localhost:8000/viewtest.jsp">view</a><br/>
		<a href="http://localhost:8000/delete.jsp">Delete</a>
    </p>     
  </card>   
</wml> 
