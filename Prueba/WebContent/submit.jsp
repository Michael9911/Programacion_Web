<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>Prube clase principal</title>
</head>
<body>

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
          <a class="nav-link disabled" href="submit.jsp">submit</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="login.jsp">Login</a>
        </li>
        </ul>
    </div>

	<div aling="center">
	
		<form action="RespuestaSubmit" method="post">
			<label>Link: <input type="text" name="link" id ="link">   </label>
			<label>Tittle: <input type="text" name="tittle" id ="tittle">   </label>
			<label>Description: <input type="text" name="description" id ="description">   </label>
			<label>Usuario: <input type="text" name="usuario" id ="usuario">   </label>
			<input type="submit" value="submit">
		</form>
		<form action="DeleteSubmit" method="post">
		<p>Borrar Submit</p>
			<label>Id Submit: <input type="text" name="id_submit" id ="id_submit">   </label>
			<label>User name: <input type="text" name="user_name" id ="user_name">   </label>
			<input type="submit" value="submit">
		</form>
		
		<form action="DeleteComment" method="post">
		<p>Borrar Comment</p>
			<label>Id Comment: <input type="text" name="id_comment" id ="id_comment">   </label>
			<label>User name: <input type="text" name="user_name" id ="user_name">   </label>
			<input type="submit" value="submit">
		</form>
		
	</div>
</body>
</html>