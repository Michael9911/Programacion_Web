<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  <link rel="shortcut icon" href="img/logo.png" />
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
    
     <form action="UpdateComment" method="post">
			<label>User Name: <input type="text" name="user_name" id ="user_name">   </label>
			<label>Id Comment: <input type="text" name="id_comment" id ="id_comment">   </label>
			<label>Content: <input type="text" name="content" id ="content">   </label>
			<input type="submit" value="submit">
		</form>
    </div>
  </div>
</body>

</html>