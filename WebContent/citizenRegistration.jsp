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
<div class="main">
			<div class="heading">&nbsp;&nbsp;&nbsp;&nbsp;<img src="uim1.png"/></div>
					<div>
<div id="navigation">
<center><ul=>
<li><a href="home.jsp">HOME</a></li>
<li><a href="profile.jsp">PROFILE</a></li>
<li><a href="account.jsp">ACCOUNT</a></li>
<li><a href="payments.jsp">PAYMENTS</a></li>

<li><a href="aboutus.jsp">ABOUT US</a></li>
<li><a href="update.jsp">UPDATE</a></li>
<li><a href="citizenRegistration.jsp">REGISTER</a></li>
<li><a href="login.jsp">LOGOUT</a></li>
</ul>
</center>
</div>
<div class=about>
<form action=RegisterServlet method=post >
<center>	
		<table>
		<tr>
					
					<%out.println("<center>");%>
					<%out.println("<select name=designation><option value=citizen>");out.print("CITIZEN");out.print("</option><option value=admin>");out.print("ADMIN");out.println("</option><option value=moderator>");out.print("MODERATOR");out.print("</option><option value=govt>");out.print("GOVERNMENT");out.print("</option></select>");%><% out.println("</center>");%>
					
				</tr>
			<tr>
				<td>
					GENERATED UNIQUE ID:
				</td>
				<td>
					<input type="text" name=uniqueid>
				</td>
			</tr>
			<tr>
				<td>
					GENERATED PASSWORD:
				</td>
				<td>
					<input type="password" name=uniqueidpass>
				</td>
			</tr>
			<tr>
				<td>
					FULL NAME:
				</td>
				<td>
					<input type="text" name=fullname>
				</td>
			</tr>
			<tr>
				<td>
					FATHER NAME:
				</td>
				<td>
					<input type="text" name=fathername>
				</td>
			</tr>
			<tr>
				<td>
					MOTHER NAME:
				</td>
				<td>
					<input type="text" name=mothername>
				</td>
			</tr>
			<tr>
				<td>
					AGE:
				</td>
				<td>
					<input type="text" name=age>
				</td>
			</tr>
			<tr>
				<td>
					GENDER
				</td>
				<td>
					<input type="radio" name=sex value=male>male<input type="radio" name=sex value=female>female
				</td>
			</tr>
			<tr>
				<td>
					PANCARD NUMBER:
				</td>
				<td>
					<input type="text" name=pancardnumber>
				</td>
			</tr>
			<tr>
				<td>
					DOOR NUMBER:
				</td>
				<td>
					<input type="text" name=doornumber>
				</td>
			</tr>
			<tr>
				<td>
					STREET:
				</td>
				<td>
					<input type="text" name=street>
				</td>
			</tr>
			<tr>
				<td>
					CITY:
				</td>
				<td>
					<input type="text" name=city>
				</td>
			</tr>	
			<tr>
				<td>
					STATE:
				</td>
				<td>
					<input type="text" name=state>
				</td>
			</tr>		
			<tr>
				<td>
					<input type=submit name=Register value=Register>
				</td>
			</tr>
		</table>
		
</center>
</form>
</div>
</div>
</div>


</body>
</html>