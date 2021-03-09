package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("uname").equals("admin") &&  request.getParameter("pwd").equals("Admin_123")) {
			HttpSession session  = request.getSession();
			session.setAttribute("uname", request.getParameter("uname"));
			response.sendRedirect("dashboard.jsp");
		}else {
			response.setContentType("text/html");  
			PrintWriter out = response.getWriter();  
			out.print("Sorry UserName or Password Error!<br>");  
			RequestDispatcher rd= request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		
		
	}

}
