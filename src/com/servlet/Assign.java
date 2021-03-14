package com.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.entity.AssignEntity;
import com.handler.AssignHandler;

/**
 * Servlet implementation Assign Assign
 */
@WebServlet("/Assign")
public class Assign extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AssignHandler handler;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Assign() {
        super();
        // TODO Auto-generated constructor stub
        handler = new AssignHandler();
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
		request.getRequestDispatcher("assignlist.jsp").forward(request, response); 

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AssignEntity obj= new AssignEntity(Integer.parseInt(request.getParameter("fkClassId")),Integer.parseInt(request.getParameter("fkSubjectId")),Integer.parseInt(request.getParameter("fkTeacherId")));
		
		handler.add(obj);
		
		response.sendRedirect("Assign");
		
	}

}
