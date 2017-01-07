

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for Servlet: RegisterServlet
 *
 */
 public class RegisterServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
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
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String uniqueid=request.getParameter("uniqueid");
		String uniqueidpass=request.getParameter("uniqueidpass");
		String fullname=request.getParameter("fullname");
		String fathername=request.getParameter("fathername");
		String mothername=request.getParameter("mothername");
		String age=request.getParameter("age");
		String gender=request.getParameter("sex");
		String pancardnumber=request.getParameter("pancardnumber");
		String doornumber=request.getParameter("doornumber");
		String street=request.getParameter("street");
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		String design=request.getParameter("designation");
		int x=10000;
		 Connection con = null;
		 try {
			  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			  con = DriverManager.getConnection("jdbc:odbc:UIM","db2admin","db2admin");
			 
			  Statement st=con.createStatement();
			  String str1="insert into logintable values('"+design+"','"+uniqueid+"','"+uniqueidpass+"')";
			  st.executeUpdate(str1);
			  String str="insert into profile values ('"+uniqueid+"','"+fullname+"','"+fathername+"','"+mothername+"','"+age+"','"+gender+"','"+pancardnumber+"','"+doornumber+"','"+street+"','"+city+"','"+state+"','"+uniqueidpass+"','"+design+"')";
			  System.out.println(str);
			   st.executeUpdate(str);
		    String str2="insert into ACCOUNT values('"+uniqueid+"','"+x+"')";
			   st.executeUpdate(str2);
			   response.sendRedirect("Regconfirm.jsp");
		 	}   
		 catch (Exception e) {
	
			  e.printStackTrace();
		  System.out.println(e);

		  }

	}   	  	    
}