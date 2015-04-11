<%@ page language="java" %>
<%! String opt="", lang=""; %>
<% response.setContentType("text/vnd.wap.wml"); %>
<?xml version="1.0"?>
<!DOCTYPE wml PUBLIC "-//WAPFORUM//DTD WML 1.1//EN" "http://www.wapforum.org/DTD/wml_1.1.xml">

<wml>
<card id="nuser" title="Welcome To Mobile World">

<onevent type="onenterbackward">
<refresh>
	<setvar name="pno" value=""/>
	<setvar name="uname" value=""/>
	<setvar name="pass" value=""/>
	<setvar name="dob" value=""/>
	<setvar name="city" value=""/>
	<setvar name="state" value=""/>
	<setvar name="country" value=""/>
</refresh>
</onevent>	

<p align="center"><em>Sign up</em></p>
<p align="left">
Mobile no:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="pno" maxlength="10"  emptyok="false"> </input>
Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="text" name="uname" maxlength="20" tabindex="3"></input>
Password: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="pass" maxlength="6" emptyok="false"></input>
D.O.B:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="dob" maxlength="10" tabindex="3"></input>
City:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="city" maxlength="20"  tabindex="3"></input>
State:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="state" maxlength="25" tabindex="3"></input>
Country:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select name="country" multiple="false" tabindex="3">
<option value="ind">India</option>
<option value="sri">Srilanka</option>
<option value="sin">Singapore</option>
<option value="us">United States</option>
</select>

<do type="accept" label="ok">
	<go method="post" href="http://localhost:8000/updatetest.jsp">
	<postfield name="pno" value="$pno"/>
	<postfield name="uname" value="$uname"/>
	<postfield name="pass" value="$pass"/>
	<postfield name="dob" value="$dob"/>
	<postfield name="city" value="$city"/>
	<postfield name="state" value="$state"/>
	<postfield name="country" value="$country"/>
</go>
</do>

</p>

</card>
</wml>