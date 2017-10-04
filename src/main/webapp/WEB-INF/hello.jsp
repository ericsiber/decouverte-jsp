<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<meta charset="UTF-8">
<title>Hello</title>
</head>
<body>
	<c:forEach items="${personnes}" var="p">
		<h1>Hello ${p.prenom} ${p.nom}</h1>	
	</c:forEach>
	<p>Vous naviguez avec ${header['user-agent']}
	<br/><br/>
	Nous sommes le <fmt:formatDate value="${currentDate}" dateStyle="full"/> 
	et il est <fmt:formatDate type="time" value="${currentDate}" timeStyle="full"/>
</body>
</html>