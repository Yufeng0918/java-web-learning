<%@ page contentType="text/html;charset=UTF-8"%>
<html>
	<head>
		<title>Application2</title>
	</head>
	
	<body>
		
		<%
			
		out.println("Java Servlet API Version "
					+ application.getMajorVersion() + "."
					+ application.getMinorVersion() + "<br>");
			
		out.println("URL of 'application2.jsp' is: "
					+ application.getResource("/lecture04.BuiltInObject/Application2.jsp") + "<br>");
			
		out.println("getServerInfo()=" + application.getServerInfo()
					+ "<br>");
		out.println(application.getRealPath("/lecture04.BuiltInObject/Application2.jsp"));
		%>
	</body>
</html>