<%@page import="java.util.List"%>
<%@page import="com.entity.TeacherEntity"%> 
<%@ include file="header.jsp" %>



  
<div class="container">

<% List<TeacherEntity> lst =  
            (List<TeacherEntity>)request.getAttribute("data"); 
int i=1;            
%> 
<h3>Teacher Master</h3>
<div style="float:right"><a href="teacher.jsp">ADD</a></div>
<table class="table">
<thead>
  <tr>
    <th>SNo</th>
    <th>Teacher Name</th>
    <th>Email</th>
    <th>City</th>
    <th>Action</th>
  </tr>
</thead>
<tbody>
<% for(TeacherEntity e:lst) {   %> 
<tr>
<td><%=i %></td>
<td><%=e.getName() %></td>
<td><%=e.getEmail() %></td>
<td><%=e.getCity() %></td>
<td>                   
 	<a href="TeacherEdit?id=<%= e.getId() %>">Edit</a>
    &nbsp;&nbsp;&nbsp;&nbsp;<a href="Teacher?id=<%= e.getId() %>">Delete</a>
                    	                   	
</td>
</tr> 
<% i++; } %> 
</tbody>
</table>
</div> 


<%@ include file="footer.jsp" %>  
