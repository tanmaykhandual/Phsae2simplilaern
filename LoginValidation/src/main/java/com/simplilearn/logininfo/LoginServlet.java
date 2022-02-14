package com.simplilearn.logininfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID= 1L;
	public String username,password;
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setContentType("text/html");
		
		username=req.getParameter("username");
		password=req.getParameter("password");
		
		PrintWriter out=resp.getWriter();
		
		if ((username.equals("tanmay"))&&(password.equals("tanmay123"))) {
			out.println("Welcome Login Successful");
		}
		else {
			out.println("Login failed...............");
		}
		
	}

}
