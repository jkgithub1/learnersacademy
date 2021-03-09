<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Learner&apos;s Academy</title>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">

</head>
<body>
<div class="container">
<h3 class="info">Learner&apos;s Academy</h3>

<% 
String uname=(String)session.getAttribute("uname");  
%>

<% if(uname!= null){ %>
 <div style="float:right;"><a href="">Logout</a></div>
 <br>
 <nav class="navbar navbar-expand-lg navbar-light bg-light">
  

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
    
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Master
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="Class">Class</a>
          <a class="dropdown-item" href="subject.jsp">Subject</a>
           <a class="dropdown-item" href="teacher.jsp">Teacher</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="student.jsp">Student</a>
        </div>
      </li>
      
     
      
    
    </ul>
    
  </div>
</nav>

<%  } %>