package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.entity.TeacherEntity;
import com.handler.TeacherHandler;

/**
 * Servlet implementation Teacher Teacher
 */
@WebServlet("/Teacher")
public class Teacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TeacherHandler handler;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Teacher() {
        super();
        // TODO Auto-generated constructor stub
        handler = new TeacherHandler();
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
		List<TeacherEntity> lst = handler.list();
		
		request.setAttribute("data", lst); 
		
		request.getRequestDispatcher("teacherlist.jsp").forward(request, response); 

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		TeacherEntity obj= new TeacherEntity(request.getParameter("name"),request.getParameter("email"),request.getParameter("city"));
		
		handler.add(obj);
		
		response.sendRedirect("Teacher");
		
	}

}
