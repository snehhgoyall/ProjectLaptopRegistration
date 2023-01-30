package com.servlets;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;


import java.util.List;

import com.servlet.config.DatabaseConfig;
import com.servlet.dao.LaptopDAO;
import com.servlet.elements.LaptopDetails;

public class ViewLaptopServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.println("<a href='index.jsp'>Add New Laptop Information</a>");
		out.println("<h1 align='center'>All Registered Information:</h1>");
	    try {
	    	System.out.println("Inside Servlet");
	        out.println("<table border='4' bgcolor='lightyellow' bordercolor='orange' align='center'>");
	        out.println(" <tr><th>Laptop Name</th><th>Laptop Brand</th><th>Laptop Price</th><th>Touch Screen</th><th>Fast Charging</th><th>Processor</th><th>RAM Size</th><th>Storage Capacity</th></tr>");
	        LaptopDAO dao=new LaptopDAO();
		    List<LaptopDetails> list=dao.getLaptopDetails();
			for(LaptopDetails de:list) {
				out.println("<tr><td>"+de.getLaptopName()+"</td><td>"+de.getLaptopBrand()+"</td><td>"+de.getLaptopPrice()+"</td><td>"+de.getTouchScreen()+"</td><td>"+de.getFastCharging()+"</td><td>"+de.getProcessor()+"</td><td>"+de.getRamSize()+"</td><td>"+de.getStorageCapacity()+"</td></tr>");
			}
			out.print("</table>");
            out.close();
		    }catch(Exception e) {
			     System.out.println(e);
		    }
	    }
}

