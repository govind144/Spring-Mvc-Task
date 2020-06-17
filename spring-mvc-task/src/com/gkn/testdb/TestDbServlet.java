package com.gkn.testdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = "root";
		String pass = "";
		
		String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/band";
		String driver = "com.mysql.jdbc.Driver";
		try {
			PrintWriter out = response.getWriter();
			
			out.println("connecting" +jdbcUrl);
			Class.forName(driver);
			
			Connection mycon = DriverManager.getConnection(jdbcUrl,user,pass);
			out.println("Success!!");
			mycon.close();
		}
		catch (Exception ex) {
			
			ex.printStackTrace();
			throw new ServletException(ex);
		}
		
	}

}
