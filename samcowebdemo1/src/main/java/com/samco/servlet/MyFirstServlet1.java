package com.samco.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyFirstServlet1() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		if(password.equals("dileep")) {
			out.println("Password is authenticated");
		}else {
			out.println("Invalid Password");
		}
	}
}