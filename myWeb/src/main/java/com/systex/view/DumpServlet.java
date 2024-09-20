package com.systex.view;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.foreign.Linker.Option;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.Optional;

/**
 * Servlet implementation class DumpServlet
 */
public class DumpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DumpServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Enumeration<String> parmNames = request.getParameterNames();

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		String croot = request.getContextPath();
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>收到的資料有：</title>");
		out.println("<link href=\"" + croot + "/style/myStyle.css\" rel=\"stylesheet\" /></link>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>DumpServlet</h2>");

		out.println("<table border ='1' style=\"margin:auto\">");
		out.println("<thead><tr><th>Parm name</th><th>Parm value</th> </tr></thead>");
		out.println("<tbody>");
		while (parmNames.hasMoreElements()) {
			String name = (String) parmNames.nextElement();
			if ("habbit".equals(name)) {
				String[] values = request.getParameterValues(name);
				out.println("<tr><td>" + name + "</td><td>" + Arrays.toString(values) + "</td></tr>");
			} else {
				out.println("<tr><td>" + name + "</td><td>" + request.getParameter(name) + "</td></tr>");
			}

		}

		out.println("</tbody>");
		out.println("</table>");
		out.println("<a href=\"" + croot + "\"><img src=\"../image/images.jpg\" /></a>");
		out.println("<br />");
		out.println("<a href=\"" + croot + "\">Go home</a>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
