package com.arashad.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class myServlet1 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		
		ServletConfig config=getServletConfig();
	Enumeration<String> enumeration=	config.getInitParameterNames();
	while (enumeration.hasMoreElements()) {
		String paramName =  enumeration.nextElement();
		
	String paramValue=	config.getInitParameter(paramName);
		
		out.print(paramName+"  ");
		out.println(paramValue);
		
	}
		
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

//This is example of store data through the web.xml