

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class for Servlet: UpdateServlet
 *
 */
 public class UpdateServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public UpdateServlet() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String uniqueid=request.getParameter("uniqueid");
		
		
		String doornumber=request.getParameter("doornumber");
		String street=request.getParameter("street");
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		
		HttpSession session=request.getSession();
		String uniqueid1=(String)session.getAttribute("uniqueID");

		System.out.println(uniqueid1);
	
		Connection con = null;
		 try {
			  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			  con = DriverManager.getConnection("jdbc:odbc:UIM","db2admin","db2admin");
			 
			  Statement st=con.createStatement();
			  String str="update profile set doornumber='"+doornumber+"'where uniqueid='"+uniqueid+"'";
			 System.out.println(str);
			  st.executeUpdate(str);
			response.sendRedirect("updateconfirm.jsp");
		 }
			catch(Exception e){
				e.printStackTrace();
				
			}
	}  	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}   	  	    
}