package Servlet;

import jakarta.servlet.ServletException;
import Model.*;
import Controller.*;
import View.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Controller.ProductController;

/**
 * Servlet implementation class ServletClassCheck
 */
public class ServletClassCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletClassCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int Item_Id=Integer.parseInt("Item_Id");
		String Item_Name=request.getParameter("Item_Name");
		int Amount=Integer.parseInt("Amount");
		int TotStack_Avail=Integer.parseInt("TotStack_Avail");
		Product product=new Product(Item_Id,Item_Name,Amount,TotStack_Avail);
		System.out.println(product);
		
		ProductController productcontroller= new ProductController();
		productcontroller.save();
	}

}
