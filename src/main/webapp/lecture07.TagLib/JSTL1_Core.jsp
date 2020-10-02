<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test JSTL Core</title>
</head>
<body>
	<h1>JSTL Core</h1>
	<hr>
	<li>Test c:out</li>
	<br /> hello(default):
	<c:out value="${hello}" />
	<br /> hello(EL):${hello }
	<br /> hello(default="123"):
	<c:out value="${abc}" default="123" />
	<br /> hello(default="123"):
	<c:out value="${abc}">123</c:out>
	<br /> WelStr(defalut):
	<c:out value="${WelStr}" />
	<br /> WelStr(escapeXml="true"):
	<c:out value="${WelStr}" escapeXml="true" />
	<br /> WelStr(escapeXml="false"):
	<c:out value="${WelStr}" escapeXml="false" />
	<br /> WelStr(EL):${WelStr }
	<br />
	<p />
	<hr>
	<li>Test c:set and c:remove</li>
	<br />
	<c:set value="123" var="temp" />
	temp:${temp }
	<br />
	<c:remove var="temp" />
	temp:${temp }
	<br />
	<p>
	<hr>
	<li>Test c:if</li>
	<br />
	<c:if test="${v1 lt v2}" var="v">
		v1 lt v2<br />v=${v }<br />
	</c:if>
	<c:if test="${empty v3}">
		v3 emtpy<br />
	</c:if>
	<c:if test="${empty v4}">
		v4 empty<br />
	</c:if>

	<hr>
	<li>Test condition control c:choose,c:when,c:otherwise</li>
	<br />
	<c:choose>
		<c:when test="${v1 lt v2}">
			v1 less than v2<br/>
		</c:when>
		<c:otherwise>
			v1 greater than v2<br/>
		</c:otherwise>
	</c:choose>
	<c:choose>
		<c:when test="${empty v4}">
			v4 is empty<br/>
		</c:when>
		<c:otherwise>
			v4 is not empty<br/>
		</c:otherwise>
	</c:choose>
	<p>
	<hr>
	<li>Test c:forEach</li>
	<br/>
	<table border="1">
		<tr>
			<td>Name</td>
			<td>Age</td>
			<td>Group</td>
		</tr>
		<c:choose>
			<c:when test="${empty userlist}">
				<tr>
					<td colspan="3">No valid data</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${userlist}" var="u">
					<tr>
						<td>${u.username }</td>
						<td>${u.age }</td>
						<td>${u.group.name }</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>
	<p>
	<li>Test c:forEach,varstatus</li>
	<br/>
	<table border="1">
		<tr>
			<td>Name</td>
			<td>Age</td>
			<td>Group</td>
			<td>Count</td>
		</tr>
		<c:choose>
			<c:when test="${empty userlist}">
				<tr>
					<td colspan="4">No valid data</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${userlist}" var="user" varStatus="vs">
					<c:choose>
						<c:when test="${vs.count % 2 == 0}">
							<tr bgcolor="red">
						</c:when>
						<c:otherwise>
							<tr>
						</c:otherwise>
					</c:choose>
					<td><c:out value="${user.username}" /></td>
					<td><c:out value="${user.age}" /></td>
					<td><c:out value="${user.group.name}" /></td>
					<td><c:out value="${vs.count}" /></td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>
	<p>
	<li>Test c:forEach,begin,end,step</li>
	<br/>
	<table border="1">
		<tr>
			<td>Name</td>
			<td>Age</td>
			<td>Group</td>
		</tr>
		<c:choose>
			<c:when test="${empty userlist}">
				<tr>
					<td colspan="3">No valid data!</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${userlist}" var="user" begin="2" end="8" step="2">
					<tr>
						<td>${user.username}</td>
						<td>${user.age}</td>
						<td>${user.group.name }</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>
	<p>
	<li>Test c:forEach，Loop</li>
	<br/>
	<c:forEach begin="1" end="10">
		a<br/>
	</c:forEach>
	<p>
	<li>Test c:forEach，in Map</li>
	<br/>
	<c:forEach items="${mapvalue}" var="v">
		${v.key }=${v.value }<br/>
	</c:forEach>
	<p>
	<hr>
	<li>Test c:forTokens</li>
	<br/>
	<c:forTokens items="${strTokens}" delims="," var="v">
		${v }<br/>
	</c:forTokens>
	<p>
	<hr>
	<c:catch var="exinfo">
		<%
			Integer.parseInt("asdfsdf");
		%>
	</c:catch>
	${exinfo }
	<br />
	<p>
	<hr>
	<li>Test c:import</li>
	<br/>
	<c:import url="http://localhost:8080/J2EE_Fundamental/index.jsp" />
	<p>
	<hr>
	<li>Test c:url and c:param</li>
	<br/>
	<c:url value="http://localhost:8080/J2EE_Fundamental/index.jsp" var="v">
		<c:param name="username" value="Jack" />
		<c:param name="age" value="20" />
	</c:url>
	${v }
	<br />
	<hr>
	<li>Test c:redirect</li>
	<br />
	<!--  c:redirect context="/J2EE_Fundamental" url="/index.jsp" / -->
</html>