package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.servlet.dao.LaptopDAO;

public class DeleteLaptopServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
	        PrintWriter out=response.getWriter();
			String s = request.getParameter("delete");
			LaptopDAO dao=new LaptopDAO();
			dao.delete(s);
		
	//		response.sendRedirect("index.jsp");
			
			HttpSession httpSession =request.getSession();
			httpSession.setAttribute("message","Data Deleted Successfully !!");
	        response.sendRedirect("index.jsp");
            return;
	}

}
