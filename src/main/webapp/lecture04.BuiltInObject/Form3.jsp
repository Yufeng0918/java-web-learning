<%@ page language="java"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
<title>Form3</title>
</head>
<base href="<%=basePath%>">
<body>

	<%
		String amuse = "";
	%>
	<%
		amuse = request.getParameter("amuse");
		String user = (String) session.getAttribute("username");
	%>
	Name: 
	<%=request.getParameter("username")%>
	<br/>
	Amuse:
	<%=amuse%>
</body>
</html>