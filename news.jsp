<%@ page language="java" %>
<%! String opt="", lang=""; %>
<% response.setContentType("text/vnd.wap.wml"); %>
<?xml version="1.0"?>
<!DOCTYPE wml PUBLIC "-//WAPFORUM//DTD WML 1.1//EN" "http://www.wapforum.org/DTD/wml_1.1.xml">

<wml>

<card id="news" title="News">      
    <p align="left"> 
     &nbsp;&nbsp; <a href="http://localhost:8000/cnews.jsp">Current Affairs</a></p> 
    <p> &nbsp;&nbsp; <a href="http://localhost:8000/enews.jsp">Education</a></p> 
    <p> &nbsp;&nbsp; <a href="http://localhost:8000/pnews.jsp">Politics</a></p> 
    <p> &nbsp;&nbsp; <a href="http://localhost:8000/snews.jsp">SPorts</a></p> 	

  </card> 

</wml>