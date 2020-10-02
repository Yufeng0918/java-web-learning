<%@ page language="java" import="lecture05.javaBean.Student"
	pageEncoding="UTF-8"%>
<html>
<body>

	<jsp:useBean id="student" scope="application"
		class="lecture05.javaBean.Student" />

	<%=student.getName()%><br>
	<%
		student.setName("cong");
	%>
	<jsp:getProperty name="student" property="classNo" />
	<br>
	<jsp:getProperty name="student" property="name" />
	<br>
	<jsp:getProperty name="student" property="age" />
	<br>
	<jsp:getProperty name="student" property="sexy" />
	<br>
	<%=student.getClassNo()%>
	<br>
	<%=student.getName()%>
	<br>
	<%=student.getAge()%>
	<br>
	<%=student.isSexy()%>
	<br>
	<jsp:useBean id="date" class="java.util.Date" scope="application"></jsp:useBean>
	<%=date.toString()%>
</body>
</html>