<%@page import="java.util.List"%>
<%@page import="com.entity.ClassEntity"%> 
<%@ include file="header.jsp" %>



  
<div class="container">

<% List<ClassEntity> lst =  
            (List<ClassEntity>)request.getAttribute("data"); 
int i=1;            
%> 
<h3>Class Master</h3>
<div style="float:right"><a href="class.jsp">ADD</a></div>
<table class="table">
<thead>
  <tr>
    <th>SNo</th>
    <th>Class Name</th>
    <th>Action</th>
  </tr>
</thead>
<tbody>
<% for(ClassEntity e:lst) {   %> 
<tr>
<td><%=i %></td>
<td><%=e.getName() %></td>
<td>                   
 	<a href="ClassEdit?id=<%= e.getId() %>">Edit</a>
    &nbsp;&nbsp;&nbsp;&nbsp;<a href="Class?id=<%= e.getId() %>">Delete</a>
                    	                   	
</td>
</tr> 
<% i++; } %> 
</tbody>
</table>
</div> 


<%@ include file="footer.jsp" %>  