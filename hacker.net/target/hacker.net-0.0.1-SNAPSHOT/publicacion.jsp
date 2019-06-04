<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="includes/header.jsp" %>


<form method="post" action="http://localhost:9000/hacker.net/publicacion/createSubmit">

<label> Link: <input type="text" id="link" name="link">  
</label>

<label> Tittle: <input type="text" id="tittle" name="tittle">  
</label>

<label> Description: <input type="text" id="description" name="description">  
</label>

<label> <input type="submit" id="enviar" name="enviar" value="Enviar">  
</label>

</form>

<%@include file="includes/footer.jsp" %>
