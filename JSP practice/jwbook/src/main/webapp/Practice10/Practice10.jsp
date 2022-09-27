<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Practice10</title>
<style>
	tr{
		border: 1px solid;
	}
	td{
		border: 1px solid;
		width: 100px;
		height: 30px;
		text-align:center;
	}
	table{
		border: 1px solid;
	}
</style>
</head>
<body>
<%

	out.println("<center><table>");
	out.println("<tr><td><font color=\"red\">일</font></td><td>월</td><td>화</td><td>수</td><td>목</td><td>금</td><td><font color=\"blue\">토</font></td></tr>");
	for(int i=0;i<4;i++){
		out.println("<tr>");
		for(int j=0;j<7;j++){
			out.println("<td>&nbsp;</td>");
		}
		out.println("</tr>");
	}
	out.println("</table></center>");
%>
</body>
</html>