package com.arashad.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		
		String name=req.getParameter("name1");
		String Email=req.getParameter("email1");
		String Phone=req.getParameter("phone1");
		String City=req.getParameter("city1");
		
		//database insertion code
		out.println("<h3 style='color:Green'> Sucess</h3>");
		out.println("Name :"+name+ "</br>");
	
		out.println("Email :"+Email +"</br>");
		out.println("Phone No : "+Phone+"</br>");
		out.println("City :"+City+"</br>");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	service(req, resp);	
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		service(req, resp);
		
	}

}
