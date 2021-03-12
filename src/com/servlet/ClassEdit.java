package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.ClassEntity;
import com.handler.ClassHandler;

/**
 * Servlet implementation class ClassEdit
 */
@WebServlet("/ClassEdit")
public class ClassEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public ClassHandler ch;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassEdit() {
        super();
        // TODO Auto-generated constructor stub
        ch = new ClassHandler();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ClassEntity c =  ch.loadSpecific(Integer.parseInt(request.getParameter("id")));
		
		request.setAttribute("data", c); 
		
		request.getRequestDispatcher("classedit.jsp").forward(request, response); 

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		out.print(request.getParameter("classid"));
		out.print(request.getParameter("name"));
		
		ch.update(Integer.parseInt(request.getParameter("classid")),request.getParameter("name"));
	    
		response.sendRedirect("Class");
	}

}
