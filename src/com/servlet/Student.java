package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.entity.StudentEntity;
import com.handler.StudentHandler;

/**
 * Servlet implementation Student Student
 */
@WebServlet("/Student")
public class Student extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentHandler handler;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Student() {
        super();
        // TODO Auto-generated constructor stub
        handler = new StudentHandler();
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
		request.getRequestDispatcher("studentlist.jsp").forward(request, response); 

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StudentEntity obj= new StudentEntity(request.getParameter("name"),request.getParameter("email"),request.getParameter("city"),Integer.parseInt(request.getParameter("fkClassId")));
		
		handler.add(obj);
		
		response.sendRedirect("Student");
		
	}

}
