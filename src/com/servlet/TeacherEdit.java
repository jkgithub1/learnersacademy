package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.TeacherEntity;
import com.handler.TeacherHandler;

/**
 * Servlet implementation class TeacherEdit
 */
@WebServlet("/TeacherEdit")
public class TeacherEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public TeacherHandler handler;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherEdit() {
        super();
        // TODO Auto-generated constructor stub
        handler = new TeacherHandler();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		TeacherEntity c =  handler.loadSpecific(Integer.parseInt(request.getParameter("id")));
		
		request.setAttribute("data", c); 
		
		request.getRequestDispatcher("teacheredit.jsp").forward(request, response); 

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		handler.update(Integer.parseInt(request.getParameter("id")),request.getParameter("name"),request.getParameter("email"),request.getParameter("city"));
	    
		response.sendRedirect("Teacher");
	}

}
