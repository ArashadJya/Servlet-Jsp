package com.arashad.filter;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class ValidationFilter implements Filter {
	
	FilterConfig filterConfig;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig=filterConfig;
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain fc)
			throws IOException, ServletException {
	
		String str=filterConfig.getInitParameter("appName");
		System.out.println("Str "+str);
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		
		String name=req.getParameter("name1");
		String Email=req.getParameter("email1");
		String Phone=req.getParameter("phone1");
		String City=req.getParameter("city1");
		
		if(name.length()<3) {
			out.println("<h3 style='color:red'> Name length should be greater then 3 characters</h3>");
		}
		
		else if (!Email.endsWith("@gmail.com")) {
			out.println("<h3 style='color:red'> Email Id is not Valid</h3>");
			
		}
		else if (Phone.length()!=10) {
			
			out.println("<h3 style='color:red'> Phone Number is not Valid</h3>");
			
		}
		else if (City.length()<3) {
			out.println("<h3 style='color:red'> City Name length should be greater then 3 digits </h3>");
			
		}
		else {
			fc.doFilter(req, resp);
		}
	}

}
