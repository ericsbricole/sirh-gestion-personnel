<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
</head>
<body>
	<h1>Les collaborateurs</h1>
	<ul>
		<%
		List<String> listeDeNoms = (List<String>) request.getAttribute("listeNoms");
		for (String nom : listeDeNoms){
			%>
			<li><%=nom%></li>
			<%
		}
		%>
	</ul>
</body>
</html>