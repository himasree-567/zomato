package com.zomato.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zomato.entity.ZomatoEmployee;
import com.zomato.service.ZomatoService;
import com.zomato.service.ZomatoServiceInterface;

/**
 * Servlet implementation class GlobalServlet
 */
public class GlobalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @param register 
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response, Object register) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		String option=request.getParameter("ac");
		if(option.equals(register)) {
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		ZomatoEmployee fe=new ZomatoEmployee();
		fe.setName(name);
		fe.setPassword(pass);
		fe.setEmail(email);
		fe.setAddress(address);
		ZomatoServiceInterface fs=ZomatoService.CreateserviceObject();
		int i=fs.createProfile(fe);
		if(i>0) {
			out.println("profile created");
		}
		else {
			out.println("could not create profile");
		}
			
	}
	}
}


