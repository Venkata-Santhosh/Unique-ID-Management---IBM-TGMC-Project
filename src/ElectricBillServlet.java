

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
 * Servlet implementation class for Servlet: ElectricBillServlet
 *
 */
 public class ElectricBillServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public ElectricBillServlet() {
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
		String uniqueid=(String)session.getAttribute("uniqueID");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int electricbill=Integer.parseInt(request.getParameter("electricbill"));
		Connection con = null;
		 try {
			  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			  con = DriverManager.getConnection("jdbc:odbc:UIM","db2admin","db2admin");
			  Statement st=con.createStatement();
			  String str="select amount from ACCOUNT where uniqueid='"+uniqueid+"'";
			  ResultSet rs=st.executeQuery(str);
			if(  rs.next()){
			  int y=Integer.parseInt(rs.getString(1));
			  int z=y-electricbill;
			  String str1="update ACCOUNT set amount='"+z+"'where uniqueid='"+uniqueid+"'";
			  st.executeUpdate(str1);
			  response.sendRedirect("paid.jsp");
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