package com.wu.crmdemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class testdb
 */
@WebServlet("/testdb")
public class testdb extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public testdb() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String databaseDriver="oracle.jdbc.driver.OracleDriver";
		String connectionURL="jdbc:oracle:thin:@localhost:1521:XE";
		String userName="scott";
		String passWord="tiger";
		

		try {
			PrintWriter out=response.getWriter();
	
			
			Class.forName(databaseDriver);
			Connection con=DriverManager.getConnection(connectionURL,userName,passWord);
			out.println("Hello Everyone ....!!! ");
			out.println("Successfully Connected to database server ");
			con.close();
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
