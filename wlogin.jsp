<%@ page language="java" %>
<%! String opt="", lang=""; %>
<% response.setContentType("text/vnd.wap.wml"); %>
<?xml version="1.0"?>
<!DOCTYPE wml PUBLIC "-//WAPFORUM//DTD WML 1.1//EN" "http://www.wapforum.org/DTD/wml_1.1.xml">

<wml>

<card id="ouser" title="Sign in">

<onevent type="onenterbackward">
<refresh>
	<setvar name="phno" value=""/>
	<setvar name="pass" value=""/>
</refresh>
</onevent>	

<onevent type="onenterforward">
<refresh>
	<setvar name="phno" value=""/>
	<setvar name="pass" value=""/>
</refresh>
</onevent>	

<p>
Mobile no:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="phno" maxlength="10"  emptyok="false"> </input>
Password: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="pass" maxlength="6" emptyok="false"></input>
</p>

<do type="accept" label="login">
	<go method="post" href="http://localhost:8000/logtest.jsp">
	<postfield name="phno" value="$phno"/>
	<postfield name="pass" value="$pass"/>
	</go>
</do>


</card>
</wml>