<%@page import="java.util.Date"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<%= request.getContextPath() %>/style/myStyle.css"
	rel="stylesheet"></link>
<title>dump.jsp</title>
</head>
<body>
	<h1>Dump JSP</h1>
	<%= session.isNew() %>
	<br />
	<%= session.getId() %>
	<br />
	<%= new Date(session.getLastAccessedTime()) %>
	<br />
	<%= new Date(session.getCreationTime()) %>
	<br />
	<%= session.getMaxInactiveInterval() %>
	<br />>
	
	<img src="<%= request.getContextPath() %>/image/images.jpg" />
	<table board='1' style="margin: auto;">
		<tbody>
			<% for (int i = 1; i <= 9; i++) {%>
				<tr>
					<% for (int j = 1; j <= 9; j++) { %>
						<td><%= i %>*<%= j %>=<%= (i*j) %></td>
					<% } %>				
				</tr>
			<% } %>
		</tbody>
	</table>
	<br />
	<% Enumeration<String> headerNames = request.getHeaderNames(); %>
	<table border ='1' style="margin:auto">
		<thead>
			<tr>
				<th>Header name</th>
				<th>Header value</th> 
			</tr>
		</thead>
		<tbody>
			<%while (headerNames.hasMoreElements()) {
				String  headerName = headerNames.nextElement();
				String	headerValue = request.getHeader(headerName);	
			%>
			
			<tr><td><%= headerName %></td><td><%= headerValue %></td></tr>
			<% } %>
		</tbody>
	</table>
	<% session.invalidate(); %>
</body>
</html>