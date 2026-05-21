package com.arashad.backend;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginform")
public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email1");
		String password=req.getParameter("pass1");
		
		if(email.equals("jya@gmail.com")&& password.equals("jya@123")) {
			
			String name="Arashad Jya";               //It will reterived from databases
			
			HttpSession session=req.getSession();
			session.setAttribute("session_name", name);
			
			
			RequestDispatcher rd=req.getRequestDispatcher("/profile");
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
