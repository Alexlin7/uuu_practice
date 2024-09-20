package com.systex.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;

import com.systex.model.Customer;

/**
 * Servlet implementation class CreateCustomerController
 */
public class CreateCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateCustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		RequestDispatcher view;
		LinkedList<String> errorMessages = new LinkedList<>();
		request.setAttribute("errors", errorMessages);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//1. Retrieve Form Data
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String telephone = request.getParameter("telephone");
		String address = request.getParameter("address");
		String birth = request.getParameter("birth");
		String gender = request.getParameter("gender");
		String[] habits = request.getParameterValues("habbit");
		//2. Convert Form Data
		//N/A
		//3.Validate Form Data
		if (name == null || name.trim().isEmpty()) {
			errorMessages.add("姓名欄位必須填寫");
		}
		if (email == null || email.trim().isEmpty()) {
			errorMessages.add("電郵欄位必須填寫");
		}
		if (telephone == null || telephone.trim().isEmpty()) {
			errorMessages.add("電話欄位必須填寫");
		}
		if (address == null || address.trim().isEmpty()) {
			errorMessages.add("地址欄位必須填寫");
		}
		if (birth == null || birth.trim().isEmpty()) {
			errorMessages.add("生日欄位必須填寫");
		}
		if (gender == null || gender.trim().isEmpty()) {
			errorMessages.add("請勾選性別欄位");
		}
		if (habits == null) {
			errorMessages.add("請至少勾選一項");
		}
		if (!errorMessages.isEmpty()) {
			view = request.getRequestDispatcher("createCustomer.jsp");
			view.forward(request, response);
			return;//控制權還給container
		}
		//4. Invoke Biz Logic
		try {
			Customer customer = new Customer();
			customer.setName(name);
			customer.setEmail(email);
			customer.setTelephone(telephone);
			customer.setAddress(address);
			customer.setBirth(birth);
			customer.setGender(gender);
			customer.setHabits(habits);
			
			request.setAttribute("customer", customer);
			view = request.getRequestDispatcher("createSuccessful.jsp");
			view.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			errorMessages.add(e.getMessage());
		}
		//5. Select Next View
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
