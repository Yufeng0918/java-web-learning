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

<title>My JSP 'el2.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>
<body>

	Test Object Variable
	<br />${ param.username }
	<br /> ${sessionScope.hello }
	<br /> ${paramValues.interest[3] } ${1 + 2 * 4 }
	<br /> ${sessionScope.person["name"]} 1+2=${1+2 }
	<br />
	<br />
	
	
	Test Calculation
	<br /> 10/5=${10/5 }
	<br /> 10 div 5= ${10 / 5 }
	<br /> 10%3=${10 % 3 }
	<br /> 10 mod 3=${10 mod 3 }
	<br />
	
</body>
</html>
