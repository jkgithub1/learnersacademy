package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.AssignEntity;
import com.handler.AssignHandler;

/**
 * Servlet implementation class AssignEdit
 */
@WebServlet("/AssignEdit")
public class AssignEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public AssignHandler handler;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssignEdit() {
        super();
        // TODO Auto-generated constructor stub
        handler = new AssignHandler();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AssignEntity c =  handler.loadSpecific(Integer.parseInt(request.getParameter("id")));
		
		request.setAttribute("data", c); 
		
		request.getRequestDispatcher("assignedit.jsp").forward(request, response); 

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		handler.update(Integer.parseInt(request.getParameter("id")),Integer.parseInt(request.getParameter("fkClassId")),Integer.parseInt(request.getParameter("fkSubjectId")),Integer.parseInt(request.getParameter("fkTeacherId")));
	    
		response.sendRedirect("Assign");
	}

}
