<%@page import="java.util.LinkedList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<%=request.getContextPath()%>/style/myStyle.css"
	rel="stylesheet"></link>
<title>新增顧客</title>
</head>
<body>
	<h2>新增顧客</h2>
	<%-- 此處為錯誤報告 --%>
	<%
	LinkedList<String> errors = (LinkedList<String>) request.getAttribute("errors");
	%>
	<%
	if (errors != null) {
	%>
	<ul style="color: red; font-size: 0.8em">
		<table boarder='0' style="margin: auto; text-align: left;">

			<%
			for (String error : errors) {
			%>
			<tr>
				<td>
					<li><%=error%></li>
				</td>
			</tr>
			<%
			}
			%>

		</table>
	</ul>


	<%
	}
	%>
	<form action="ccController.do" method="POST">
		<table board='0' style="margin: auto;">
			<tbody>
				<tr>
					<td>姓名</td>
					<td>
						<input type="text" id="name" name="name" value="${ param.name }" />
					</td>
				</tr>
				
				<tr>
					<td>電郵</td>
					<td>
						<input type="email" id="email" name="email" value="${ param.email }" />
					</td>
				</tr>
				<tr>
					<td>電話</td>
					<td><input type="tel" id="telephone" name="telephone" value="${ param.telephone }" /></td>
				</tr>
				
				<tr>
					<td>地址</td>
					<td><input type="text" id="address" name="address" value="${ param.address }" /></td>
				</tr>
				<tr>
					<td>生日</td>
					<td>
						<input type="date" id="birth" name="birth" value="${param.birth }" />
					</td>
				</tr>
				<tr>
					<% 
						String isMale = "";
						String isFemale = "";
						String gender = request.getParameter("gender");
						if (gender != null) {
							if (gender.equals("male")) {
								isMale = "checked";
							} else {
								isFemale = "checked";
							}
						}
					%>
					<td>性別</td>
					<td><input type="radio" id="male" name="gender" value="male" <%= isMale %> />
						<lable for="male">男</lable> 
						
						<input type="radio" id="female" name="gender" value="female" <%= isFemale %> /> 
						<lable for="female">女</lable></td>

				</tr>
				<tr>
					<%
					String[] habbits = request.getParameterValues("habbit");
					%>
					<%
					String isMusic = "";
					String isShopping = "";
					String isReading = "";
					%>
					<%
					if (habbits != null) {
						for (String habbit : habbits) {
							if (habbit.equals("music")) {
								isMusic = "checked";
							}
							if (habbit.equals("shopping")) {
								isShopping = "checked";
							}
							if (habbit.equals("reading")) {
								isReading = "checked";
							}
						}

					}
					%>

					<td>嗜好</td>
					<td>
						<input type="checkbox" id="music" name="habbit"	value="music" <%= isMusic %> /> 
						<lable for="music">聽音樂</lable>
						 
						<input type="checkbox" id="shopping" name="habbit" value="shopping" <%= isShopping %> /> 
						<lable for="shopping">逛大街</lable> 
						
						<input type="checkbox" id="reading" name="habbit" value="reading" <%= isReading %> /> 
						<lable for="reading">讀好書</lable>
					</td>
				</tr>
				<tr>
					<td></td>
					<td><input type="reset" id="reset" name="reset" /> <input
						type="submit" id="submit" name="submit" /></td>
				</tr>

			</tbody>
		</table>
	</form>

</body>
</html>