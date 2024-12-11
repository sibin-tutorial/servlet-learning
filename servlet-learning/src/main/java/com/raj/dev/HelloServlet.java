package com.raj.dev;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HelloServlet() {
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
		
		//Servlet session
		HttpSession session = request.getSession(true);
		session.setAttribute("isAuthenticated", true);
		session.setAttribute("numberOfItemsOnCart", 15);
		
		
		//Servlet Cookie
		Cookie cookie = new Cookie("username", "Rahul");
		Cookie cookie2 = new Cookie("email","rahil1990@gmail.com");
		
		cookie.setMaxAge(1000);
		cookie2.setMaxAge(1000);
		
		response.addCookie(cookie);
		response.addCookie(cookie2);
		
		String yourName = request.getParameter("youName");
		System.out.println("Name:"+yourName);
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Hello " + yourName + "</h1> <form action=\"helloCookie\" method=\"post\">\r\n"
				+ "<input type=\"submit\" value=\"Submit\"/>\r\n"
				+ "\r\n"
				+ "</form>");
		writer.close(); 
		doGet(request, response);
	}

}
