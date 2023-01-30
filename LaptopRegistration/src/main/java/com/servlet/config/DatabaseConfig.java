package com.servlet.config;



import java.sql.*;

public class DatabaseConfig {
	//singleton design pattern
	private static Connection con;

	public static Connection getConnection() throws SQLException {
		System.out.println("invoked getConnection()");
		try {
			if (con==null) {
				// load the driver:
				Class.forName("com.mysql.cj.jdbc.Driver");

				// Creating a Connection:
				String url = "jdbc:mysql://localhost:3306/information";
				String username = "root";
				String password = "Sneha@1234";
				con = DriverManager.getConnection(url, username, password);
				System.out.println("Connection created : "+con);
				return con;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
//connection closed
	public static void closeConnection() {
		System.out.println("Invoked closeConnection()");
		try {
			if (con != null) {
				con.close();
				System.out.println("Connection closed");
			}else {
				System.out.println("Connection not closed");
			}
		} catch (SQLException e) {
          System.out.println("something went worong ");
		}

	}

}

