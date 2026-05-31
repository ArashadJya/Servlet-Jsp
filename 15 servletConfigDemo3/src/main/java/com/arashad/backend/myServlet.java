package com.arashad.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet( urlPatterns = {"/myServlet"},
                             initParams = {
                            		 @WebInitParam(name="name1",value = "Arashad Jya"),
                            		 @WebInitParam(name="email1",value = "jya@gmail.com")
                             }
		)
public class myServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		
	ServletConfig config=getServletConfig();
	String myname=config.getInitParameter("name1");
	String myEmail=config.getInitParameter("email1");
	 
	out.println("Name "+myname);
	out.println("Email "+myEmail);
	
	//this is a example of store data in a servletConfig object through the annotation
	
	}

}
