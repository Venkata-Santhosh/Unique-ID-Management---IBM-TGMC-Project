<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
<link rel="stylesheet" type="text/css" href="design.css"/>
<script language="javascript" type="text/javascript">
				function fn(val)
				{	
					
					if(val.uniqueid.value=="")
					{	
						alert("Please enter UNIQUE ID");
						val.uniqueid.focus();
						return false;
					}
					if(val.uniqueidpass.value=="")
					{		
						alert("please enter the UNIQUE ID password");
						val.uniqueidpass.focus();
						return false;
						
					}
					return true;
				}
						</script>

</head>
<body>
<div class="main">
			<div class="heading">&nbsp;&nbsp;&nbsp;&nbsp;<img src="uim1.png"/></div>
		<form name=val action="LoginServlet" method=POST onsubmit="return fn()">
			<div class="table1" align=center>
			<h1>&nbsp;LOGIN</h1><%out.println("</br></br>"); %>
			<center><table>
					<tr>
					
					<%out.println("<center>");%>
					<%out.println("<select name=designation><option value=citizen>");out.print("CITIZEN");out.print("</option><option value=admin>");out.print("ADMIN");out.println("</option><option value=moderator>");out.print("MODERATOR");out.print("</option><option value=govt>");out.print("GOVERNMENT");out.print("</option></select>");%><% out.println("</center>");%>
					
				</tr>
				<tr>
					<td>
						UNIQUE ID:
					</td>
					<td>
						<input type=text name=uniqueid>
					</td>
				</tr>
				<tr><td>
				<% out.println("</br>");%>
				</td>
				</tr>
				<tr>
					<td>
						PASSWORD:
					</td>
					<td>
						<input type=password name=uniqueidpass>
					</td>
				</tr>
				
			</table></center><%out.println("</br>"); %>
			<center><input type="submit" onclick="fn(val)" value="LOGIN" class="btn"></center><%out.println("</br>"); %>
			</div>
		</form>
		</div>

</body>
</html>