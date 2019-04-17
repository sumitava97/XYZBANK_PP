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
  
  <td colspan="2"><table width="98%" border="0px" align="center" cellpadding="0" cellspacing="0">
        <tr>
        <th colspan="2" scope="col"><div class="box1">
          <marquee>
            <h2><font color="#FF0000">UNIVERSAL BANK OF XYZ COMPANY</font></h2>
            </marquee>
        </div></th>
        </tr>
        
	<form action="customer/checkuser" method="post">
	<table>
	<tr>
              <td width="28%" rowspan="3"><div align="center"><img src="images/icon_module.png" width="48" height="48" /></div></td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
	<tr>
              <td width="24%">Username:</td>
              <td width="48%"><label>
                <input name="user" type="number" id="user" />
              </label></td>
            </tr>
            <tr>
              <td>Password:</td>
              <td><label>
                <input name="password" type="password" id="password" />
              </label></td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td colspan="2"><label>
                
                    <div align="center">
                      <input name="Submit" type="Submit"/>
                    </div>
                  </label></td>
              </tr>
	</form>
	</body>   

    <div style="position: absolute; bottom: 5px; left:5px; background-color: #2175bc">
	<footer><p>&copy; Copyright © 2019 by Sumitava Aich.

All rights reserved. No part of this publication may be reproduced, distributed, or transmitted in any form or by any means, including photocopying, recording, or other electronic or mechanical methods, without the prior written permission of the publisher, except in the case of brief quotations embodied in critical reviews and certain other non-commercial uses permitted by copyright law.</p> 
</footer>
</div>

</html>