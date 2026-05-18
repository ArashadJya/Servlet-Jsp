package com.arashad.main;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/aaa")
public class MyServlet1 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.getWriter().println("Hello Servlet 1");
		resp.setContentType("text/html");
		
		RequestDispatcher rd=req.getRequestDispatcher("/index.html");
		rd.include(req, resp);
	}

}
//By using this method we include the any other pages(Servlet,jsp,etc ) in a current pages
