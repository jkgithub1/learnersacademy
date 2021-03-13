package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.SubjectEntity;
import com.handler.SubjectHandler;

/**
 * Servlet implementation class SubjectEdit
 */
@WebServlet("/SubjectEdit")
public class SubjectEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public SubjectHandler handler;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectEdit() {
        super();
        // TODO Auto-generated constructor stub
        handler = new SubjectHandler();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SubjectEntity c =  handler.loadSpecific(Integer.parseInt(request.getParameter("id")));
		
		request.setAttribute("data", c); 
		
		request.getRequestDispatcher("SubjectEdit.jsp").forward(request, response); 

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		out.print(request.getParameter("id"));
		out.print(request.getParameter("name"));
		
		handler.update(Integer.parseInt(request.getParameter("id")),request.getParameter("name"));
	    
		response.sendRedirect("Subject");
	}

}
