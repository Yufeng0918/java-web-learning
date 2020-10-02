<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>Request1</title>

<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>
<body>
	<form action="lecture04.BuiltInObject/Request2.jsp">
		username: <input type="text" name="username"> <input
			type="submit" value="submit">
	</form>
</body>
</html>
