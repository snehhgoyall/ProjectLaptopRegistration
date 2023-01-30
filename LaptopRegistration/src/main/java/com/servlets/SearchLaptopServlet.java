package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.config.DatabaseConfig;
import com.servlet.dao.LaptopDAO;
import com.servlet.elements.LaptopDetails;

public class SearchLaptopServlet extends HttpServlet{

	public SearchLaptopServlet() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/HTML");
		PrintWriter out = response.getWriter();

		LaptopDAO dao = new LaptopDAO();
		String laptopName = request.getParameter("Search");

		try {
			List<LaptopDetails> laptopDetails = dao.searchLaptopDetails(laptopName);
			
			out.println("<h1 align='center'>Laptop Details:</h1>");
			// System.out.println(de);
			out.println("<table border='1' bordercolor='black' align='center'>");
			out.println(" <tr><th>Laptop Name</th><th>Laptop Brand</th><th>Laptop Price</th><th>Touch Screen</th><th>Fast Charging</th><th>Processor</th><th>RAM Size</th><th>Storage Capacity</th></tr>");
			for(LaptopDetails de:laptopDetails) {
				out.println("<tr><td>"+de.getLaptopName()+"</td><td>"+de.getLaptopBrand()+"</td><td>"+de.getLaptopPrice()+"</td><td>"+de.getTouchScreen()+"</td><td>"+de.getFastCharging()+"</td><td>"+de.getProcessor()+"</td><td>"+de.getRamSize()+"</td><td>"+de.getStorageCapacity()+"</td></tr>");
			}out.println("</table");
			
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
