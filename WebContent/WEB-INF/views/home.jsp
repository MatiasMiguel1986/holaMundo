<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bienvenidos a Cineapp</title>
</head>
<body>
	<h1>Lista de peliculas</h1>
	
	
	<o1>
		<c:forEach items="${peliculas }" var ="pelicula">
			<li> ${pelicula } </li> 
			
		</c:forEach>
	</o1>

</body>
</html>