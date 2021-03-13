package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.StudentEntity;
import com.handler.StudentHandler;

/**
 * Servlet implementation class StudentEdit
 */
@WebServlet("/StudentEdit")
public class StudentEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public StudentHandler handler;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentEdit() {
        super();
        // TODO Auto-generated constructor stub
        handler = new StudentHandler();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StudentEntity c =  handler.loadSpecific(Integer.parseInt(request.getParameter("id")));
		
		request.setAttribute("data", c); 
		
		request.getRequestDispatcher("studentedit.jsp").forward(request, response); 

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		handler.update(Integer.parseInt(request.getParameter("id")),request.getParameter("name"),request.getParameter("email"),request.getParameter("city"),Integer.parseInt(request.getParameter("fkClassId")));
	    
		response.sendRedirect("Student");
	}

}
