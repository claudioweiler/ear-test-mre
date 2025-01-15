package com.github.claudioweiler.eartest;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "Inner WAR Test Servlet", urlPatterns = { "/test/inner.do" })
public class InnerTestServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private static final Logger LOG = System.getLogger(InnerTestServlet.class.getName());

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LOG.log(Level.DEBUG, "Inner WAR servlet loaded");
		
		response.getWriter().println("Hi from inner WAR servlet!");
	}
	
}