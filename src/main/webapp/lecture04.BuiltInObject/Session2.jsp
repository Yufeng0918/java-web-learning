<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<HTML>
	<BODY>
		<%
			String name = request.getParameter("username");
			session.setAttribute("logName", name);
		%>
		Your: "<%= name%>" Session
		<br>
		<a href='Session3.jsp'>check</a>
	</BODY>
</HTML>