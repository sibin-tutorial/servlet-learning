package com.raj.dev;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 request.setAttribute("username", "Tom");
		 
		 User u = new User();
		 u.setRole("User");
		 
		 request.setAttribute("userbean", u);
		 
		 request.setAttribute("isAdmin", true);
		 
		 
		 ArrayList<String> strList = new ArrayList<>();
		 strList.add("Apple");
		 strList.add("Orange");
		 strList.add("Pinapple");
		 
		 request.setAttribute("fruitList", strList);
		 
	        // Redirect to a JSP page to display success message or list uploaded files
	        request.getRequestDispatcher("/jstllearning.jsp").forward(request, response);
	     
		//doGet(request, response);
	}

}
