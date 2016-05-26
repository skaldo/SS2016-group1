package net.codeJava;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.UnavailableException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/SampleServlet")
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SampleServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		response.getWriter().println("Hello friend!");
		response.getWriter().println();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		Connection conn = null;
		Statement stmt = null;
		
		try {
			try {
			      Class.forName("oracle.jdbc.driver.OracleDriver");
			    }
			    catch (ClassNotFoundException e) {
			      System.out.println("Couldn't load OracleDriver");
			      throw new UnavailableException("Couldn't load OracleDriver");
			    }
			
			conn = DriverManager.getConnection("jdbc:odbc:bus");
			stmt = conn.createStatement();
			
			String query = "Select id, numberPlate, color from bus;";
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next())
			{
				int id = rs.getInt("id");
				String numPlate = rs.getString("numberPlate");
				String color = rs.getString("color");
				
				out.print(id);
				out.print(numPlate);
				out.print(color);
				out.println("\n");
				
			}
			
			
					}
		catch (SQLException e) {
		      out.println("An error occured while retrieving bus info " 
		          + e.toString());
		    } finally {
		      try {
		        if (stmt != null) {
		          stmt.close();
		        }
		        if (conn != null) {
		          conn.close();
		        }
		      } catch (SQLException ex) {
		      }
		    }
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
