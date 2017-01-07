

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;

import com.ibm.keymanager.s;

/**
 * Servlet implementation class for Servlet: ViewProfileServlet
 *
 */
 public class ViewProfileServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public ViewProfileServlet() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		String uniqueid=(String)session.getAttribute("uniqueID");
	
		ArrayList<String> list=new ArrayList<String>();
		Connection con = null;
		 try {
			  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			  con = DriverManager.getConnection("jdbc:odbc:UIM","db2admin","db2admin");
			 
			  Statement st=con.createStatement();

				String str="select uniqueid,fullname,fathername,mothername,age,sex,pancardnumber,doornumber,street,city,state from profile where uniqueid='"+uniqueid+"'";
				System.out.println(str);
				ResultSet rs1=st.executeQuery(str);
				rs1.next();
				list.add(rs1.getString(1));
				  list.add(rs1.getString(2));
				  list.add(rs1.getString(3));
				  list.add(rs1.getString(4));
				  list.add(rs1.getString(5));
				  list.add(rs1.getString(6));
				  list.add(rs1.getString(7));
				  list.add(rs1.getString(8));
				  list.add(rs1.getString(9));
				  list.add(rs1.getString(10));
				  list.add(rs1.getString(11));
				  session.setAttribute("profileList",list);
				System.out.print(rs1.getString("uniqueid")+""+rs1.getString(2)+""+rs1.getString(3));
		 }   	
		 catch(Exception e){
				e.printStackTrace();
			}
		 response.sendRedirect("ViewProfile.jsp");
		
	}  	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		
}
	}