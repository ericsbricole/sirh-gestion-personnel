<%@page import="javax.swing.text.DateFormatter"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="dev.sgp.web.Collaborateur"%>
<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-4.3.1-dist/css/bootstrap.css">
</head>
<body>
	<h1>Les collaborateurs</h1>
	<ul>
		<%
		List<Collaborateur> listeDeNoms = (List<Collaborateur>) request.getAttribute("listeCollaborateur");
		for (Collaborateur c : listeDeNoms){
			%>
			<li><%=c.getNom()%> <%=c.getPrenom()%>, né le <%=c.getDateDeNaissance() %></li>
			<%
		}
		%>
	</ul>
</body>
</html>