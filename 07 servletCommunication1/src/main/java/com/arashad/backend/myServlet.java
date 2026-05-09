package com.arashad.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/aaa")
public class myServlet extends HttpServlet {
	
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		
//		PrintWriter out=resp.getWriter();
//		
//		out.println("Hello");
//		
//		
//		
//		
//		
//	}

	@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		PrintWriter out=resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title> My Title </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3> Hello Servlet1</h3>");
		out.println("</body>");
		out.println("</html>");
		
		
		
	}

}
//This is a example of servlet communicate with browser
