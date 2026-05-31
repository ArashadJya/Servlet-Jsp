package com.arashad.filter;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class EncDecFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain fc)
			throws IOException, ServletException {
		
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		
		boolean Status=false;
		//Encryption and Decryption Code
		
		Status=true;
		if(Status) {
			fc.doFilter(req, resp);
		}
		else {
			 out.println("<h3 style='color:red'>Encryption and Decryption failed</h3>");
		}
		
		
	}

}
