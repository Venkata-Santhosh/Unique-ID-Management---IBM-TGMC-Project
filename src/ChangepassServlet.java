


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class for Servlet: ChangepassServlet
 *
 */
 public class ChangepassServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public ChangepassServlet() {
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
		String uniqueid1=(String)session.getAttribute("uniqueID");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String uniqueid=request.getParameter("uniqueid");
		String uniqueidpass=request.getParameter("uniqueidpass");
		String cuniqueidpass=request.getParameter("cuniqueidpass");
		 Connection con = null;
		 try {
			  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			  con = DriverManager.getConnection("jdbc:odbc:UIM","db2admin","db2admin");
			  Statement st=con.createStatement();
			  
			  	String cstr="select uniqueid,uniqueidpass from Logintable where uniqueid='"+uniqueid+"'and uniqueidpass='"+uniqueidpass+"'";
			  	
			  	ResultSet cres=st.executeQuery(cstr);
			  	 if(cres.next()){
			  		
			  		 String cpass="update logintable set uniqueidpass='"+cuniqueidpass+"'where uniqueidpass='"+uniqueidpass+"'and uniqueid='"+uniqueid+"'";
			  		 st.executeUpdate(cpass);
			  		 String cpass2="update profile set uniqueidpass='"+cuniqueidpass+"'where uniqueidpass='"+uniqueidpass+"'and uniqueid='"+uniqueid+"'";
			  		 st.executeUpdate(cpass2);
			  		 response.sendRedirect("changeconfirm.jsp");
			  	 } 
			  	else{
					  out.println("Enter valid uniqueid and pass word");
					  out.print("<a href=changepass.jsp >Back </a>");
				  }
				  
				  
				  con.close();

				  System.out.println("Connection closed");
		 
		 }
		 	catch (Exception e) {
		 			e.printStackTrace();
		 			System.out.println(e);
		 		}  	    

	}   	  	    
}