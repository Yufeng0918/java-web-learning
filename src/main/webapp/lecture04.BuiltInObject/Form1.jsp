<%@ page contentType="text/html;charset=gb2312"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
<title>Form1</title>
</head>
<base href="<%=basePath%>">
<body>

	<form method="post" action="lecture04.BuiltInObject/Form2.jsp">
		Input Name <input type="text" name="username"> <input
			type="submit" value="submit">
	</form>

</body>
</html>