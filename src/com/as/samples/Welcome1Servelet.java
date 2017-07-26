package com.as.samples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome1Servelet
 */
public class Welcome1Servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Welcome1Servelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String firstname=request.getParameter("fname");
		String lastname=request.getParameter("lname");
		String middlename=request.getParameter("mname");
		
		
		
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> My First Page </title>");
		out.println("<head>");
		out.println("<font color=red size=20> Firstname </font>"+firstname);
		out.println("<font color=red size=20> Lastname </font>"+lastname);
		out.println("<font color=red size=20> Middlename </font>"+middlename);
		
		out.println("<body>");
		out.println("</html>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
