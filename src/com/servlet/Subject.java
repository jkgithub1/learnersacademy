package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.entity.SubjectEntity;
import com.handler.SubjectHandler;

/**
 * Servlet implementation Subject Subject
 */
@WebServlet("/Subject")
public class Subject extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SubjectHandler handler;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Subject() {
        super();
        // TODO Auto-generated constructor stub
        handler = new SubjectHandler();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if(request.getParameter("id")!=null) {
			
			int id =Integer.parseInt(request.getParameter("id"));
			
			handler.delete(id);

		}
		
		// TODO Auto-generated method stub
		List<SubjectEntity> lst = handler.list();
		
		request.setAttribute("data", lst); 
		
		request.getRequestDispatcher("subjectlist.jsp").forward(request, response); 

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SubjectEntity obj= new SubjectEntity(request.getParameter("name"));
		
		handler.add(obj);
		
		response.sendRedirect("Subject");
		
	}

}
