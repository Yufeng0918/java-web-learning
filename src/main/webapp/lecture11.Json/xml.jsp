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

<title>My JSP 'xml.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript"
	src="<%=basePath%>lecture11.Json/jquery-1.4.4.js"></script>

<script type="text/javascript">
	$(function() {
		/*
		$("#button1").click(function()
		{
			$.ajax({
				
				type: "POST",
				url: "XMLServlet",
				dateType: "xml",
				data: {name: $("#name").val()},
				success: function(returnedData){
					
					var id = $(returnedData).find("id").text();
					var name = $(returnedData).find("name").text();
					var age = $(returnedData).find("age").text();
					var address = $(returnedData).find("address").text();
					
					var html = "<table width='60%' border='1' align='center'><tr><th>id</th><th>name</th><th>age</th><th>address</th><tr align='center'><td>" + id + "</td><td>" + name + "</td><td>" + age + "</td><td>" + address + "</td></tr></table>";
				
					$("#theBody table:eq(0)").remove();
					$("#theBody").append(html);
					
				}
			});
		});
		
		 */

		$("#button1")
				.click(
						function() {
							$
									.get(
											"XMLServlet",
											{
												name : $("#name").val()
											},
											function(returnedData, status) {
												var id = $(returnedData).find(
														"id").text();
												var name = $(returnedData)
														.find("name").text();
												var age = $(returnedData).find(
														"age").text();
												var address = $(returnedData)
														.find("address").text();

												var html = "<table width='60%' border='1' align='center'><tr><th>id</th><th>name</th><th>age</th><th>address</th><tr align='center'><td>"
														+ id
														+ "</td><td>"
														+ name
														+ "</td><td>"
														+ age
														+ "</td><td>"
														+ address
														+ "</td></tr></table>";

												$("#theBody table:eq(0)")
														.remove();
												$("#theBody").append(html);
											});

						});

	});
</script>

</head>

<body id="theBody">

	<select id="name">
		<option value="zhangsan">zhangsan</option>
		<option value="lisi">lisi</option>
	</select>

	<input type="button" id="button1" value="get content from server">


</body>
</html>
