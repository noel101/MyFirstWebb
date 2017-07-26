package com.as.samples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




public class Welcome2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Welcome2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname=request.getParameter("fname");
		String lastname=request.getParameter("lname");
		String middlename=request.getParameter("mname");
		
		request.getSession().setAttribute("ofname", firstname);
		request.getSession().setAttribute("olname", lastname);
		request.getSession().setAttribute("omname", middlename);
		
		
		//HttpSession ses= request.getSession();
		//response.setContentType("text/html");

																				
		response.sendRedirect("jsp/welcome2.jsp");                                 // change this to welcome3 and create a new one
		

		
		

		
		}
}
