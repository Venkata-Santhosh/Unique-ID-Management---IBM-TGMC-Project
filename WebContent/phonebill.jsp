<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<li><a href="login.jsp">LOGOUT</a></li>
</ul>
	
</center>

</div>
<div class=about>
<center>	
	<form action="PhoneBillServlet" method=POST>
		<table>
			<tr>
				<td>
					ENTER PHONE BILL
				</td>
				<td>
					<input type=text name=electricbill>
				</td>
			</tr>
			
			
			<tr>
				<td>
					<input type=submit name=change value=change>
				</td>
			</tr>
		</table>
	
	</form>


</center>
</div>
</body>
</html>