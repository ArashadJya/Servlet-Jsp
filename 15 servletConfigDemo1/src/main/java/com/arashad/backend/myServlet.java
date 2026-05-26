package com.arashad.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class myServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		
		ServletConfig config=getServletConfig();
		String name=config.getInitParameter("name1");
		String Email=config.getInitParameter("email1");
		String City=config.getInitParameter("city1");
		
		
		out.println("Name : "+name);
		out.println("Email : "+Email);
		out.println("City : "+City);
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	service(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	service(req, resp);	
	}

}
//This is a example of store data through the web.xml file
