<%@ page contentType="text/html;charset=UTF-8"%>
<!--forwardTo.jsp-->
<%
	String useName = request.getParameter("userName");
	String hello = request.getParameter("hello");
	System.out.println(hello);
	String outStr = "Thank You, ";
	outStr += useName;
	out.println(outStr);
%>