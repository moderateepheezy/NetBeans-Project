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
   
  <card id="card1" title="Entertainment"> 
<p>
Choice:<select  name="choice" multiple="false" >
		<option value="movie">Movies</option>
		<option value="song">Songs</option>
	</select>
	Language:<select name="lang" multiple="false">
	<option value="tamil">Tamil</option>
	<option value="eng">English</option>
	<option value="hindi">Hindi</option>
</select>
    <do type="accept" label="Enjoy">
      <go href="http://localhost:8000/jollytest.jsp"/>
    </do> 
</p>
 </card> 
   
 
</wml> 
