package com.raj.dev;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class HelloCookie
 */
@WebServlet("/helloCookie")
public class HelloCookie extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloCookie() {
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
		
		
		HttpSession session = request.getSession(false);
		
		if(session!=null) {
			//Type casting
			boolean isAuthenticated = (boolean) session.getAttribute("isAuthenticated");
		    System.out.println(isAuthenticated);
		    
		    Integer numberOfItemsOnCart = (Integer)session.
		    		getAttribute("numberOfItemsOnCart");
;		System.out.println(numberOfItemsOnCart)
;		    }
		
		Cookie[] cookies = request.getCookies();
		//Enhanced for loop
		for(Cookie c:cookies) {
			if(c.getName().equals("username")) {
				String str = c.getValue();
				System.out.println(str);
			}
			if(c.getName().equals("email")) {
				String email = c.getValue();
				System.out.println(email)
;			}
		}
		
		RequestDispatcher ds = request.getRequestDispatcher("home.jsp");
		ds.forward(request, response);
		doGet(request, response);
	}

}
