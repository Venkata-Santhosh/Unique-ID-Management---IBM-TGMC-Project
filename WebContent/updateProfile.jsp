<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList" %>
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
<li><a href="changepic.jsp">CHANGE PIC</a></li>
<li><a href="aboutus.jsp">ABOUT US</a></li>
<li><a href="update.jsp">UPDATE</a></li>
<li><a href="citizenRegistration.jsp">REGISTER</a></li>
<li><a href="login.jsp">LOGOUT</a></li>
</ul>
</center>
</div>
<div class=about>
<%
ArrayList<String> list=(ArrayList<String>)session.getAttribute("updateList");


String uniqueid1=(String)session.getAttribute("uniqueID");
%>

<form action="UpdateServlet" method=post >
<center>	
		<table>
			<tr>
				<td>
					GENERATED UNIQUE ID:
				</td>
				<td>
					<input type="text" name=uniqueid value="<%=list.get(0) %>" >
				</td>
			</tr>
			<tr>
				<td>
					FULL NAME:
				</td>
				<td>
					<%out.println(list.get(1)); %>
				</td>
			</tr>
			<tr>
				<td>
					FATHER NAME:
				</td>
				<td>
					<%out.println(list.get(2)); %>
				</td>
			</tr>
			<tr>
				<td>
					MOTHER NAME:
				</td>
				<td>
				<%out.println(list.get(3)); %> 
				</td>
			</tr>
			<tr>
				<td>
					AGE:
				</td>
				<td>
					<%out.println(list.get(4)); %>
				</td>
			</tr>
			<tr>
				<td>
					PANCARD NUMBER:
				</td>
				<td>
					<%out.println(list.get(6)); %>
				</td>
			</tr>
			<tr>
				<td>
					DOOR NUMBER:
				</td>
				<td>
					<input type="text" name=doornumber value="<%=list.get(7) %>" >
				</td>
			</tr>
			<tr>
				<td>
					STREET:
				</td>
				<td>
					<input type="text" name=street value="<%=list.get(8) %>" >
				</td>
			</tr>
			<tr>
				<td>
					CITY:
				</td>
				<td>
					<input type="text" name=city value="<%=list.get(9) %>" >
				</td>
			</tr>	
			<tr>
				<td>
					STATE:
				</td>
				<td>
					<input type="text" name=state value="<%=list.get(10) %>" >
				</td>
			</tr>		
			<tr>
				<td>
					<input type=submit name=submit value=submit>
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