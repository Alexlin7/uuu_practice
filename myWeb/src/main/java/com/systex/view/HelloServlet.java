package com.systex.view;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;");
		response.setCharacterEncoding("UTF-8");
		
		String croot = request.getContextPath();
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet HelloServlet</title>");
		out.println("<link href=\"" + croot + "/style/myStyle.css\" rel=\"stylesheet\"></link>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>現在Server的時間" + new Date() + "</h2>");
		out.println("<table border ='1' style=\"margin:auto\">");
		out.println("<tbody>");
		out.println("<tr>");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <=9; j++) {
				out.println("<td>" + i + "*" + j + "= " + (i*j) +"</td>");
			}
			out.println("</tr>");
		}
		

		out.println("</tbody>");
		out.println("</table>");
		out.println("<a href=\"" + croot + "\"><img src=\"../image/images.jpg\" /></a>");
		out.println("<br />");
		out.println("<a href=\"" + croot + "\">Go home</a>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
