<html xmlns:v="urn:schemas-microsoft-com:vml" xmlns:o="urn:schemas-microsoft-com:office:office" xmlns="http://www.w3.org/TR/REC-html40">
<head>

<title>My Address Book---Search Details</title>

<script>

function form_validator()
{

  	if(theForm.search.value == "") {
		 alert("Please Enter Name To Search!");
		 theForm.search.focus();
		 return(false);
	}
}
</script>
</head>
<BODY bgcolor="#ffffff" bgproperties="fixed" background="images/pusar.GIF">

<BLOCKQUOTE dir=ltr style="MARGIN-RIGHT: 0px">

<P align=center></P>

<P align=center></P>

<P align=center></P>

<P align=center><strong><font face="Verdana" color="#800000">





<form onsubmit="form_validator()" name="theForm" action="http://localhost:8080/WebModule1/searchserver">
            <!--<input type="hidden" value="0" name="flag">-->
             <%
//    	String name=(String)session.getAttribute("u");
//	String add=(String)session.getAttribute("uu");
//    	out.println("this is Search Result page"+name +add );>
  	String name=(String)session.getAttribute("username");

              if(name==null){
          response.sendRedirect("http://localhost:8080/WebModule1/SessionExpire.jsp");
        }

	Object data=session.getAttribute("info");
        out.println("This is data"+data);
            %>

</font></strong></P>


<div style="position:absolute; top:197; left:306; z-index:2; width:666; height:163">
  <i><font color="#99CCCC" face="Monotype Corsiva" size="5">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Please Enter Name /ID of
  Person&nbsp;To View Details </font></i>
  <p>&nbsp;<br>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <input type="text" style="background-color:#99CCCC" size="28" name="search" style="color:green"><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="submit" value="  Search  " style="background-color:#EFEFEF"> </div>

<p>&nbsp;</p>
<table cellSpacing="0" cellPadding="0" width="770" align="center" border="0">
  <tr>
    <td>
    <table cellSpacing="0" cellPadding="2" width="100%" bgColor="#99cccc" border="0">
      <tr>
        <td vAlign="top">&nbsp;<table cellSpacing="0" cellPadding="0" width="100%" bgColor="#ffffff" border="0">
          <tr>
            <td noWrap width="1%" height="1%">
            <img height="30" src="blue_top.gif" width="583"></td>
          </tr>
        </table>
        <table height="100%" cellSpacing="0" cellPadding="6" width="100%" bgColor="#ffffff" border="0">
          <tr>
            <td>

            <p align="center">&nbsp;</p>
            <font face="VERDANA" color="blue" size="1"><b>
            <font face="verdana" color="blue" size="1"><font color="blue">
            <table cellSpacing="0" cellPadding="0" width="152" border="0" height="45">
              <tr>
            <font color="blue" face="verdana" size="1">
                <td height="34" width="161">
                <img border="0" src="new.GIF" width="154" height="34"></td>
              </font>
              </tr>
              <tr>
            <font color="blue" face="verdana" size="1">
                <td width="161" background="menu_02.gif" height="18">
                <p align="center"><font color="#99CCCC" face="ms sans serif">&nbsp;</font></font></font><font color="#314f6b"><a style="text-decoration: none" href="usermain.jsp"><font color="#99CCCC" face="Verdana">HOME</font></a></font></td>
              </font>
              </tr>
              <tr>
            <font face="VERDANA" color="blue" size="1">
            <font color="blue" face="verdana" size="1">
                <td width="161" background="menu_02.gif" height="19">&nbsp;</td>
              </font>
              </tr>
              <tr>
            <font face="VERDANA" color="blue" size="1">
                <font face="VERDANA" size="1" color="#99CCCC">
                <td width="161" background="menu_02.gif" height="1"></font>
            </font></font>
            <font face="VERDANA" color="blue">
                <p align="center">
                <font face="MS Sans Serif" color="#99CCCC">&nbsp;&nbsp;&nbsp;</font></font></font><font face="VERDANA" color="blue"><font face="VERDANA" color="#99CCCC"><a href="EnterDetail.jsp" style="text-decoration: none"><font color="#99CCCC">ADD
                CONTACT</font></a></font></p>
                </font>
                <font face="VERDANA" color="#99CCCC" size="1">
                <p>
                </td>
              </tr>
              <tr>
            <font face="VERDANA" color="blue" size="1">
            <font face="VERDANA" color="blue" size="1">
            <font color="blue" face="verdana" size="1">
                <td width="161" background="menu_02.gif" height="18">
                <p align="center"><font color="#99CCCC" face="ms sans serif">&nbsp;</font></font></font></font></font></font><font color="blue"><a style="text-decoration: none" href="SearchDetail.jsp"><font color="#99CCCC" face="Verdana">SEARCH
                CONTACT</font></a></td>
              </font>
              </tr>
              <tr>
            <font face="VERDANA" color="blue" size="1">
            <font face="VERDANA" color="blue" size="1">
            <font face="VERDANA" color="blue" size="1">
            <font color="blue" face="verdana" size="1">
                <td width="161" background="menu_02.gif" height="19">&nbsp;</td>
              </font>
              </font>
              </tr>
              <tr>
            <font face="VERDANA" color="blue" size="1">
            <font face="VERDANA" color="blue" size="1">
            <font face="VERDANA" color="blue" size="1">
            <font color="blue" face="verdana">
                <td width="161" background="menu_02.gif" height="18">
                <p align="center"><font color="#99CCCC" face="ms sans serif">&nbsp;</font></font></font><font color="#99CCCC"><a style="text-decoration: none" href="Default.jsp"><font color="#99CCCC" face="Verdana">SIGN
                OUT</font></a></td>
            </font>
              </tr>
              <tr>
            <font face="VERDANA" color="blue" size="1">
            <font face="VERDANA" color="blue" size="1">
            <font face="VERDANA" color="blue" size="1">
            <font color="blue" face="verdana" size="1">
                <td width="161" background="menu_02.gif" height="19">&nbsp;</td>
              </font>
              </tr>
              <tr>
            <font face="VERDANA" color="blue" size="1">
            <font face="VERDANA" color="blue" size="1">
            <font face="VERDANA" color="blue" size="1">
                <font face="VERDANA" size="1" color="#99CCCC">
                <td height="33" width="161">
            <b>
                <font face="VERDANA" color="blue" size="1">
                <img border="0" src="newnew.GIF" width="156" height="33"></font></b><p>&nbsp;</p>
                <p>&nbsp;</p>
                <p>&nbsp;</p>
                <p></td>
            </font>
              </tr>
            <font face="VERDANA" color="blue" size="1">
            <font face="verdana" color="blue" size="1">
              </font>
              </font>
            <font face="VERDANA" color="blue" size="1"><font face="VERDANA" size="1" color="#99CCCC">
              </font><font face="VERDANA" size="1" color="#99CCCC">
              </table>
            </font></font></b>
            <p align="center">&nbsp;</td>
          </tr>
        </table>
        <table height="100%" cellSpacing="0" cellPadding="0" width="100%" bgColor="#ffffff" border="0">
          <tr>
            <td>&nbsp;</td>
          </tr>
        </table>
        </td>
      </tr>
    </table>
    </td>
  </tr>
</table>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
</form>

</BODY>
</HTML>