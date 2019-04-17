<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BANK SERVICE</title>
<!-- <link href="css/menu.css" rel="stylesheet" type="text/css" />
<style type="text/css"></head>
 --><body style=" background-color:orange">

<table width="900" border="0" align="center" cellpadding="0" cellspacing="0" style=; background-color:#FFFFFF">
  <tr>
    <th colspan="3" scope="col" style="height:90px; background-color:#2175bc;"><object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0" width="900" height="90">
      <param name="movie" value="images/banks.swf" />
      <param name="quality" value="high" />
      <h1><font color="white">Online Banking System</font></h1>
       </object></th>
  </tr>
</head>
<body>
<form action="customer/add" method="post">
	<table>
	<h3>Adding Operation</h3>
	
	<tr>
              <td width="28%" rowspan="3"><div align="center"><img src="images/icon_module.png" width="48" height="48" /></div></td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
	<tr>
              <td width="24%">Enter Amount to enter:</td>
              <td width="48%"><label>
                <input name="money" type="number" />
              </label></td>
            </tr>
            
            <tr>
              <td>&nbsp;</td>
              <td colspan="2"><label>
                
                    <div align="center">
                      <input value="Add" type="submit"/>
                    </div>
                  </label></td>
</tr>
</table>
<tr>
              <label><td width="24%"></td>
              <td width="48%"><br>
		<a href="/index.jsp">Back to Home Page</a>       </br>       </label></td>
            </tr>
            <tr>
              <label><td width="24%"></td>
              <td width="48%">
		<a href="/home.jsp">Back to Operations</a>              </label></td>
            </tr>
	</form>
</body>
<hr size="10">
	<td colspan="2"><table width="98%" border="0px" align="center" cellpadding="0" cellspacing="0">
	<tr>
	   <div style="position: absolute; bottom: 5px; right:5px; background-color: #2175bc">
	<footer> <th colspan="1" scope="col"><div class="box1">
          <marquee><h2><font color="#FF0000"><p>Bank of XYZ Company</p></font></h2></marquee></tr>
</div></th></footer>
</html>