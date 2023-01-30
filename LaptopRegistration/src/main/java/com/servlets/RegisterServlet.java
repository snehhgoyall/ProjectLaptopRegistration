package com.servlets;



import javax.servlet.http.*;

import com.servlet.dao.LaptopDAO;
import com.servlet.elements.LaptopDetails;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;

public class RegisterServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// set the content type of response:
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String laptopName = req.getParameter("laptop_name");
		String laptopBrand = req.getParameter("laptop_brand");
		String laptopPrice = req.getParameter("laptop_price");
		String touchScreen = req.getParameter("touch_screen");
		String fastCharging = req.getParameter("fast_charging");
		String processor = req.getParameter("processor");
		String ramSize = req.getParameter("ram_size");
		String storageCapacity = req.getParameter("storage_capacity");
		


				out.println("<h1>Registration Successfull</h1>");
				out.println(new Date().toString());

				System.out.println("<h2> Laptop Name:" + laptopName + "</h2>");
				System.out.println("<h2> Laptop Brand:" + laptopBrand + "</h2>");
				System.out.println("<h2> Laptop Price:" + laptopPrice + "</h2>");
				System.out.println("<h2> Touch Screen:" + touchScreen + "</h2>");
				System.out.println("<h2> Fast Charging:" + fastCharging + "</h2>");
				System.out.println("<h2> Processor:" + processor + "</h2>");
				System.out.println("<h2> RAM:" + ramSize + "</h2>");
				System.out.println("<h2> Storage Capacity:" + storageCapacity + "</h2>");
				
				
				LaptopDetails de=new LaptopDetails(laptopName,laptopBrand,laptopPrice,touchScreen,fastCharging,processor,ramSize,storageCapacity);
				LaptopDAO dao=new LaptopDAO();
				dao.insertLaptopDetail(de);
			   
//				
//				HttpSession httpSession =req.getSession();
//				httpSession.setAttribute("message","Registration Successfull !!"+laptopName);
//		        resp.sendRedirect("index.jsp");
//	            return;

	}
}

