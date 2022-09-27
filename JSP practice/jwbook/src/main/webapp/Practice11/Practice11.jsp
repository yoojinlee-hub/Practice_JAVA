<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Practice11</title>
<style>
	tr{
		border: 1px solid;
	}
	td{
		border: 1px solid;
		padding: 30px;

	}
	table{
		border: 1px solid;
	}
</style>
</head>
<body>
<center>
<h2>구구단 출력</h2>
<hr>
<%
int k=2;
out.println("<table>");
	for(int i=0;i<2;i++){
		out.println("<tr>");
		for(int j=0;j<4;j++){
			//안의 구구단
			out.println("<td>");
			for(int l=1;l<=9;l++)
				out.println(k+"*"+l+"="+k*l+"<br>");
			k+=1;
			out.println("</td>");
		}
		out.println("</tr>");
	}
	out.println("</table>");
	%>
</center>
</body>
</html>