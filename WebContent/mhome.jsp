<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% String uniqueid=(String)session.getAttribute("uniqueID");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="design.css"/>

</head>
<body>
<div class="heading">&nbsp;&nbsp;&nbsp;&nbsp;<img src="uim1.png"/></div>
					
<div id="navigation">
<center><ul=>
<li><a href="chome.jsp">HOME</a></li>

<li><a href="ViewProfileServlet">PROFILE</a></li>
<li><a href="AccountServlet">ACCOUNT</a></li>
<li><a href="payments.jsp">PAYMENTS</a></li>
<li><a href="changepass.jsp">CHANGE PASSWORD</a></li>
<li><a href="aboutus.jsp">ABOUT US</a></li>

<li><a href="BeforeUpdateServlet">UPDATE</a></li>
<li><a href="citizenRegistration.jsp">REGISTER</a></li>
<li><a href="login.jsp">LOGOUT</a></li>
</ul>
</center>	

</div>
<div class="card">
<center><h2><font face="monospace"color="red">GET YOUR UNIQUE ID</font></h2></center>
<div class="cardpic">
<center><img src="uidcard.png"></center>
</div>
</div>
<div class="ai">
<div class="p">
<h2 align="center">
<font size="4" face="arial" color="red">
SIGNIFICANT FEATURES
</font>
</h2>
</div>
<marquee bgcolor="#c5d5e2" scrollamount="2" direction="up" loop="true" width="100%"> <left> <font color=""><strong>UID will become the single source of identification<br><br>Residents would be spared the hassle of repeatedly providing supporting identity documents each time they wish to access services<br><br>By providing a clear proof of identity,this will facilitate entry for poor and underpriviledged into the oppurtunity to avail the services provided by government<br> <br> Giving migrants mobility of identity<br><br>Easy distribution of benefits of government schemes </strong></font></left></marquee>
</div>
<div class="a">
<div class="j">
<h2 align="center">
<font size="4" face="arial" color="red">
ABOUT US
</font>
</h2>
</div>
<marquee bgcolor="#c5d5e2" scrollamount="2" direction="up" loop="true" width="100%"> <left> <font color=""><strong>UNIQUE ID MANAGEMENT(UIM),is an agency of govrnment of INDIA resposinble for unique identification project<br><br>UIM will own and operate the Unique Identification Number database <br><br>The authority aims to provide a Unique id number to all Indians,but not smart cards<br> <br>The authority will maintain the database of residents containing bometric and other data<br><br>UIM is the part of planning commission of INDIA  </strong></font></left></marquee>
</div>


</body>
</html>