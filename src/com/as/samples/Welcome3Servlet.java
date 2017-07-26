package com.as.samples;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class Welcome3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PersonalInfoBean personalInfoBean = new PersonalInfoBean();

		personalInfoBean.setFirstName(request.getParameter("fname"));
		personalInfoBean.setLastName(request.getParameter("lname"));
		personalInfoBean.setMiddleName(request.getParameter("mname"));

		String errors = "";
		if (checkFieldBlank(personalInfoBean.getFirstName())) {
			errors += "First name is blank <<br/>";
		}
		if (checkFieldBlank(personalInfoBean.getLastName())) {
			errors += "Last name is blank <<br/>";
		}
		if (checkFieldBlank(personalInfoBean.getMiddleName())) {
			errors += "Middle name is blank <<br/>";
		}

		if (checkFieldBlank(errors)) {
			HttpSession ses = request.getSession();
			ses.setAttribute("pInfo", personalInfoBean);

			
			response.sendRedirect("jsp/welcome3.jsp"); // change this to
														// welcome3 and create a
														// new one
		}

		else {

			request.setAttribute("errors", errors);
			RequestDispatcher rd = (RequestDispatcher) request.getRequestDispatcher("jsp/welcome3.jsp");
			rd.forward(request, response);

		}

	}

	private boolean checkFieldBlank(String fieldValue) {
		return fieldValue == null || fieldValue.length() == 0;
	}

}
