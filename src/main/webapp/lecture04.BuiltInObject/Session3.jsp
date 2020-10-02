<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<HTML>
	<BODY>
		<% String yourName = (String)session.getAttribute("logName"); 
			
		if (yourName == null) { %>
			
			Haven't Login
		
		 <% }else { %>
		
		 "<%= yourName%>"  Login
		 
		 <% } %>
	</BODY>
</HTML>