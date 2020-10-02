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
<title>Form2</title>
</head>
<base href="<%=basePath%>">
<body>

	<%
		String username = request.getParameter("username");
	%>
	username:
	<%=username%>

	<form method="post" action="lecture04.BuiltInObject/Form3.jsp">
		Amuse: <input type="text" name="amuse"> <input
			type="hidden" name="username" value="<%=username%>"> <input
			type="submit" value="submit">
	</form>
</body>
</html>