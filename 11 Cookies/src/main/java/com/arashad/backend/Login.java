package com.arashad.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String myEmail=req.getParameter("email1");
		String password=req.getParameter("pass1");
		String myRemember=req.getParameter("remember1");
		
		if(myEmail.equals("jya@gmail.com") && password.equals("jya@123")) {
			
			if(myRemember!=null) {
				Cookie cookies=new Cookie("loginstatus", "true");
				cookies.setMaxAge(60*60*24*365);
				resp.addCookie(cookies);
			}
			
			RequestDispatcher rd=req.getRequestDispatcher("/profile");
			rd.forward(req, resp);
			
			
		}
		RequestDispatcher rd1=req.getRequestDispatcher("error.html");
		rd1.include(req, resp);
		
		RequestDispatcher rd2=req.getRequestDispatcher("Login.html");
		rd2.include(req, resp);
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
