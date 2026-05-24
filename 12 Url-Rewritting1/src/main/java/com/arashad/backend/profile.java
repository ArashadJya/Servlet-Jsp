package com.arashad.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

@WebServlet("/profile")
public class profile  extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
         PrintWriter out=resp.getWriter();
         resp.setContentType("text/html");
		
		HttpSession session=req.getSession();
		String name=(String)session.getAttribute("session_name");
		
		out.println(" <h3  style='color: green'>Name : "+name+"</h3>");
		
//		out.println("<a href='home'>Home</a>"); 
		out.println("<a href='"+resp.encodeUrl("home")+"'> Home</a>");
		out.println("  &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
		
		
		out.println("<a href='"+resp.encodeUrl("profile")+"'> Profile</a>");
		out.println("  &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
		
		
		out.println("<a href='"+resp.encodeUrl("contactUs")+"'> ContactUs</a>");
		out.println("  &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
		
		
		out.println("<a href='"+resp.encodeUrl("logout")+"'> LogOut</a>");
		
		
		out.println("<br/><br/><br/>");
		
		out.println("<h3>Profile page</h3>");
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
