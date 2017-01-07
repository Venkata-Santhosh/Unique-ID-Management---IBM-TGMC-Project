


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;


/**
 * Servlet implementation class for Servlet: AccountServlet
 *
 */
 public class AccountServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public AccountServlet() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		String uniqueid=(String)session.getAttribute("uniqueID");
		
		Connection con = null;
		 try {
			  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			  con = DriverManager.getConnection("jdbc:odbc:UIM","db2admin","db2admin");
			 
			  Statement st=con.createStatement();
			  String str1="select AMOUNT from ACCOUNT where uniqueid='"+uniqueid+"'";
			  
			  ResultSet rs1=st.executeQuery(str1);
			  rs1.next();  
			  String s=rs1.getString(1);
			  session.setAttribute("Amount",s);

			  
		 }
		 catch(Exception e){
				e.printStackTrace();
				System.out.println(e);
			}
		 response.sendRedirect("viewAccount.jsp");
	}  	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}   	  	    
}