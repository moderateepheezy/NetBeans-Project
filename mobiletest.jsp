<%@ page language="java" %>
<%! String opt="", lang=""; %>
<% response.setContentType("text/vnd.wap.wml"); %>
<?xml version="1.0"?>
<!DOCTYPE wml PUBLIC "-//WAPFORUM//DTD WML 1.1//EN" "http://www.wapforum.org/DTD/wml_1.1.xml">

<wml> 
<card id="smsmail" title="Short Message Service">
<p>
Mobile No:&nbsp;&nbsp;&nbsp;<input type="text" name="to" maxlength="20"  emptyok="false"> </input>
subject: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="subj" maxlength="20" emptyok="false"></input><br/>
Message: &nbsp;&nbsp;&nbsp;<input type="text" name="mesg" maxlength="100" size="15"></input><br/> 
</p>
<do type="accept" label="sendsms">
	<go method="post" href="http://localhost:8000/sendtest.jsp">
	<postfield name="to" value="$to"/>
	<postfield name="subj" value="$subj"/>
	<postfield name="mesg" value="$mesg"/>
	</go>
</do>

</card>   
 
</wml> 
