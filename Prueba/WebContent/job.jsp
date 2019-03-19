<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    <%@page import="com.control.operations.oJobs"
     %>
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
          <a class="nav-link disabled" href="job.jsp">Job</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="submit.jsp">submit</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="login.jsp">Login</a>
        </li>
        </ul>
    </div>

	<div class="container">
	
		<%
		oJobs oj = new oJobs();
		out.println( oj.printJob() );
		%>
		
	</div>
</body>
</html>