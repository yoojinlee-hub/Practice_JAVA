<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3c//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<HEAD>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<TITLE>HelloWorld</TITLE>
</HEAD>
<BODY>
<center>
<H2> Hello World </H2>
<HR>
현재 날짜와 시간은 : <%= java.time.LocalDateTime.now() %>  <!-- 표현태그 -->
</center>
</BODY>
</HTML>