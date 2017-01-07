<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
div.heading{
			width:800px;
				background-color:#c5d5e2;
				-webkit-border-radius: 10px;
				-moz-border-radius: 10px;
				border-radius: 20px;
				margin-top:10px;
				margin-left:280px;
				margin-right:350px;
				}
			
			body{ 
					background-color:#183d4a; 
					margin: 0; 
					padding: 0; 
					border: #ffffff; 
					width:100%; 
					height:70%;
					font-family:arial;
					font-size:14px;
					min-width:1300px;
					max-width:1400px;
				}
				input.btn {
					color: black;
					background-color: #c5d5e2;
					border: 1px outset #00008B;
					padding: 2px 4px 2px 4px;
					width:100px;
				}
				
				div.table1{		
						width:350px;
						padding:0px;	
						border:5px ;
						-webkit-border-radius: 100px;
						-moz-border-radius: 100px;
						border-radius: 60px;
						margin-top:100px;
						margin-bottom:50px;
						margin-right:100px;
						margin-left:490px;
						background-color:#c5d5e2;
						}
						#navigation {
	
					font-family: Arial, Helvetica, sans-serif;
					font-size: .9em;
}
#navigation ul {
list-style: none;
margin-top:10px;
margin-left:300px
margin-right:0px
padding: 0;
padding-top: 4px;
}
#navigation li {
display: inline;
}
#navigation a:link, #navigation a:visited {
padding: 3px 10px 2px 10px;
color: black;
background-color:#c5d5e2;
text-decoration: none;
border: 1px solid #183d4a;
}
#navigation a:hover {
color: #FFFFFF;
background-color: #183d4a;
}
div.about{
	width:750px;
	height:250px;
	margin-top:30px;
	-webkit-border-radius: 10px;
				-moz-border-radius: 10px;
				border-radius: 20px;
						margin-bottom:50px;
						margin-right:100px;
						margin-left:280px;
						background-color:#c5d5e2;
		
		}
		</style>
</head>
<body>
<div class="main">
			<div class="heading">&nbsp;&nbsp;&nbsp;&nbsp;<img src="uim1.png"/></div>
					<div>
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
	<%out.println("</br>"); %>
		<h1>CHANGED</h1>
	</center>
</div>
</div>
</div>
</body>
</html>