<%@ page language="java" %>
<%! String opt="", lang=""; %>
<% response.setContentType("text/vnd.wap.wml"); %>
<?xml version="1.0"?>
<!DOCTYPE wml PUBLIC "-//WAPFORUM//DTD WML 1.1//EN" "http://www.wapforum.org/DTD/wml_1.1.xml">

<wml> 
 
  <template> 
    <do type="prev"><prev/>
	</do> 
  </template> 
   
  <card id="card1" title="Card #1"> 
<p>
<b>SMS for:</b>&nbsp; &nbsp;<select  name="sms" multiple="false" >
		<option value=""></option>
		
		<option value="Mobile">Mobile
		<onevent type="onpick" >
		<go href="http://localhost:8000/mobiletest.jsp"/>
		</onevent>
		</option>

		<option value="Email">Email
		<onevent type="onpick" >
		<go href= "http://localhost:8000/mailtest.jsp"/>
		</onevent>
		</option>
	</select>
</p>

 </card> 
</wml> 
