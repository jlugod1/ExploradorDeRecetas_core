<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Información de usuario</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row">
        <h1>Recetas disponibles</h1>
    </div>
    <div class="row">
        <ul class="list-group">
            <c:forEach items="${listaRecetas}" var="receta">
                <li class="list-group-item">
                    <a href="/recetas/${receta}">${receta}</a>
                </li>
            </c:forEach>
        </ul>
    </div>
</div>
</body>
</html>