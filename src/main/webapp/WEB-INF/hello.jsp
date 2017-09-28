<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello</title>
</head>
<jsp:useBean id="nomAffiche" scope="request" class="java.lang.String" />
<body>
	<h1>Hello <%= nomAffiche %></h1>
</body>
</html>