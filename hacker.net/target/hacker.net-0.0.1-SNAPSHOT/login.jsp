<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="includes/header.jsp" %>




<form method="post" action="http://localhost:9000/hacker.net/User/login">

<label> User Name: <input type="text" id="user_name" name="user_name">  
</label>

<label> Password: <input type="password" id="password" name="password">  
</label>

<label> <input type="submit" id="enviar" name="enviar" value="Enviar">  
</label>

</form>
<a class="nav-link" href="newUser.jsp">Nuevo Usuario</a>



<%@include file="includes/footer.jsp" %>