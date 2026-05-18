package com.arashad.main;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myLogin")
public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
//		resp.setContentType("text/html");
		
		String email=req.getParameter("email1");
		String pass=req.getParameter("pass1");
		
		if(email.equals("jya@gmail.com") && pass.equals("jya@123")) {
			 RequestDispatcher rs=req.getRequestDispatcher("/profile.html");
			 rs.forward(req, resp);
		}
		else {
			
			RequestDispatcher rd=req.getRequestDispatcher("/error.html");
			rd.include(req, resp);
			
			RequestDispatcher rd1=req.getRequestDispatcher("/Login.html");
			rd1.include(req, resp);
		}
	}
	

}
