<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
          <a class="nav-link disabled" href="login.jsp">Login</a>
        </li>
        </ul>
    </div>
    
    <!--Login-->
    <div class="body">
      <form action="RespuestaCompany" method="post">
        <label>
          Company:<input type="text" name="user_company" id="user_company">
        </label>
        <br>
        <label>
          Password:<input type="password" name="password" id="password">
        </label>
        <br>
        <label>
          <input type="submit" value="Send">
        </label>
      </form>
    </div>
  </div>
</body>

</html>