<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.control.operations.oSubmit" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  <title>Hacker.net</title>
</head>

<body>
  <div class="container">

    <!--Barra de navegacion-->
    <div class="nav">
      <ul class="nav">
        <li class="nav-item">
          <a class="nav-link" href="index.jsp">Hacker</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="news.jsp">News</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="comments.jsp">Comments</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="show.jsp">Show</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="ask.jsp">Ask</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="job.jsp">Job</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="submit.jsp">submit</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="login.jsp">Login</a>
        </li>
        </ul>
    </div>
    <!--Login-->
    <div class="body">
    
    <%
    	oSubmit o = new oSubmit(); 
    	String lista = o.mostrarAsk();
    	out.println(lista);
     %>
     <form action="Puntaje" method="post">
			<label>Id Submit: <input type="text" name="id_submit" id ="id_submit">   </label>
			<label>User Name: <input type="text" name="user_name" id ="user_name">   </label>
			<input type="submit" value="submit">
		</form>
    </div>
  </div>
</body>

</html>