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


	<o1> <c:forEach items="${peliculas }" var="pelicula">
		<li>${pelicula }</li>
	</c:forEach> </o1>
	Tabla de películas

	<table border="1">
		<thread>
			<tr>
				<th>Id</th>
				<th>Titulo</th>
				<th>Duracion</th>
				<th>Clasificacion</th>
				<th>Genero</th>
			
			</tr>
		</thread>
		<tbody>
			<c:forEach items="${peliculas }" var="pelicula">
			<tr>
				<td>${pelicula.id }</td>
				<td>${pelicula.titulo }</td>
				<td>${pelicula.duracion } min.</td>
				<td>${pelicula.clasificacion }</td>
				<td>${pelicula.genero }</td>
			</tr>
			</c:forEach> </o1>

		</tbody>
	</table>

</body>
</html>