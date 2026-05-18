package com.arashad.backend;

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
//		RequestDispatcher rd=req.getRequestDispatcher("/index.html");
//		rd.forward(req, resp);
		
		
		RequestDispatcher rd=req.getRequestDispatcher("/bbb");
		rd.forward(req, resp);
		
	}
	
	//This method is used to forward in another pages like as JSP,Servlet,ets through the url but internally in the project 

}
