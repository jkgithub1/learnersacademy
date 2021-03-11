package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.entity.ClassEntity;

import com.handler.ClassHandler;

/**
 * Servlet implementation class Class
 */
@WebServlet("/Class")
public class Class extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Class() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ClassHandler ch = new ClassHandler();
		
		List<ClassEntity> lst = ch.classList();
		
		request.setAttribute("data", lst); 
		
		request.getRequestDispatcher("classlist.jsp").forward(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ClassEntity obj= new ClassEntity(request.getParameter("name"));
		
		ClassHandler ch = new ClassHandler();
		
		ch.addClass(obj);
		
		response.sendRedirect("Class");
		
	}

}
