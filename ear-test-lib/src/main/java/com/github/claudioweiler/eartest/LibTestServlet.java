package com.github.claudioweiler.eartest;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "Lib Test Servlet", urlPatterns = { "/test/lib.do" })
public class LibTestServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private static final Logger LOG = System.getLogger(LibTestServlet.class.getName());

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LOG.log(Level.DEBUG, "Lib Servlet loaded");
		
		response.getWriter().println("Hi from lib servlet!");
	}
	
}