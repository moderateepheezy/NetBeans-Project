<%@ page language="java" %>
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
Mobile no:<input type="text" name="to" maxlength="14"  emptyok="false"> </input>
Message: <input type="text" name="text" maxlength="400" emptyok="false"></input>
</p>

<do type="accept" label="SMS-Send">
	<go method="post" href="http://api.vodazone.co.za/http/sendmsg?api_id=1620&user=ramu&password=ramurose1">
     <postfield name="to" value="$to"/>
     <postfield name="text" value="$text"/>	
</go>
</do>
</card>
</wml>