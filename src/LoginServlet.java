


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.*;
import java.sql.*;

/**
 * Servlet implementation class for Servlet: LoginServlet
 *
 */
 public class LoginServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}  	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String design=request.getParameter("designation");
		String user=request.getParameter("uniqueid");
		String password=request.getParameter("uniqueidpass");
		 Connection con = null;
		 try {
			  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			  con = DriverManager.getConnection("jdbc:odbc:UIM","db2admin","db2admin");
			 
			  Statement st=con.createStatement();
			  
			  String dbString="select uniqueid,uniqueidpass from Logintable where designation='"+design+"'and uniqueid='"+user+"'";
			
			  ResultSet rs=st.executeQuery(dbString);
			 
			  if(rs.next()){
				 
				if(rs.getString(2).equals(password)){
					 
					if(design.equals("citizen")){
						session.setAttribute("uniqueID",user);
						response.sendRedirect("chome.jsp");
					}
					else if(design.equals("admin")){
						session.setAttribute("uniqueID",user);
						response.sendRedirect("chome.jsp");
					}
					else if(design.equals("moderator")){
						session.setAttribute("uniqueID",user);
						response.sendRedirect("mhome.jsp");
					}
					else if(design.equals("govt")){
						session.setAttribute("uniqueID",user);
						response.sendRedirect("ghome.jsp");
					}
				}
				
			  }
			  else{
				  out.println("Invalid Login");
				  out.print("<a href=Login.jsp >Back </a>");
			  }
			  
			  
			  con.close();

			  System.out.println("Connection closed");



			  } catch (Exception e) {
				  e.printStackTrace();
			  System.out.println(e);

			  }

	}   	  	    
}