<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Test jstl function</title>
</head>
<body>
	<h1>Test jstl function</h1>
	<hr>
	hello.length=(jsp script):<%=((String)request.getAttribute("hello")).length() %><br>
	hello.length(jstl fuction，prefix:function name):${fn:length(hello) }<br>
	list.length:${fn:length(list) }<br>
	<p>
</body>
</html>