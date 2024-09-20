<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>create Successsful</title>
<link href="<%=request.getContextPath()%>/style/myStyle.css"
	rel="stylesheet"></link>


</head>
<body>
	<h2>顧客資料建立成功</h2>
	<table border='1' style='margin: auto; text-align: left'>
		<tbody>
			<tr>
				<td>姓名</td>
				<td>${ customer.name }</td>
			</tr>
			<tr>
				<td>電郵</td>
				<td>${ customer.email }</td>
			</tr>
			<tr>
				<td>電話</td>
				<td>${ customer.telephone }</td>
			</tr>
			<tr>
				<td>地址</td>
				<td>${ customer.address }</td>
			</tr>
			<tr>
				<td>生日</td>
				<td>${ customer.birth }</td>
			</tr>
			<tr>
				<td>性別</td>
				<td>${ customer.gender }</td>
			</tr>
			<tr>
				<td>嗜好</td>
				<td>${ customer.habitString }</td>
			</tr>
		</tbody>
	</table>
	<a href="../"><p>Go Home</p></a>
</body>
</html>