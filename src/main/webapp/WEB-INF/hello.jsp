<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="co.simplon.poleEmploi.decouverte.jsp.model.Personne"%>
<jsp:useBean id="personnes" scope="request" type="java.util.List" />
<html>
<head>
<meta charset="UTF-8">
<title>Hello</title>
</head>
<body>
	<%
		for(Personne p : (List<Personne>) personnes) {
			pageContext.setAttribute("p", p);
	%>
		<h1>Hello ${p.prenom} ${p.nom}</h1>
	<%
		}
	%>
	<p>Vous naviguez avec ${header['user-agent']})
</body>
</html>