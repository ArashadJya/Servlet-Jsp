package com.arashad.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginform")
public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		
		String email=req.getParameter("email1");
		String password=req.getParameter("pass1");
		
		String name="Arashad Jya";   //it will reterive from database
		
		HttpSession session=req.getSession();
		session.setAttribute("session_name", name);
		
		if(email.equals("jya@gmail.com")&& password.equals("jya@123") ) {
			
			RequestDispatcher rd=req.getRequestDispatcher(resp.encodeUrl("/profile"));
			rd.forward(req, resp);
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("error.html");
			rd.include(req, resp);
			
			RequestDispatcher rd1=req.getRequestDispatcher("Login.html");
			rd1.include(req, resp);
			
		}
	}

}
