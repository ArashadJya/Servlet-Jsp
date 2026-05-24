package com.arashad.backend;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/start")
public class start extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		boolean logstatus=false;
		
		Cookie []  ck=req.getCookies();
		
		if(ck!=null) {
			for(Cookie c:ck) {
				if(c.getName().equals("loginstatus")&&c.getValue().equals("true")) {
					logstatus=true;
					break;
				}
			}
			
		}
		
		if(logstatus==true) {
			RequestDispatcher rd=req.getRequestDispatcher("/profile");
			rd.forward(req, resp);
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("Login.html");
			rd.forward(req, resp);
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
