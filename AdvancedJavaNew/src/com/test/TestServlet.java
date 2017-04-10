package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public TestServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*PrintWriter out = response.getWriter();
		String firstName= request.getParameter("firstName");
		String lastName= request.getParameter("lastName");
		out.println("Hi Amit You are inside Servlet");
		out.println("The First Name is :"+firstName);
		System.out.println("The Last Name is :"+lastName);*/
	}
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	//super.doPost(req, resp);
    	System.out.println("Inside Servlet Container");
    	PrintWriter out = response.getWriter();
		String firstName= request.getParameter("firstName");
		String lastName= request.getParameter("lastName");
		out.println("Hi Amit You are inside Servlet");
		out.println("The First Name is :"+firstName);
		out.println("The LastName Is :"+lastName);
		System.out.println("The FirstName is :"+firstName);
		System.out.println("The Last Name is :"+lastName);

    }
}
