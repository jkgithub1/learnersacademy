<%@page import="java.util.List"%>
<%@page import="com.entity.SubjectEntity"%> 
<%@ include file="header.jsp" %>



  
<div class="container">

<% List<SubjectEntity> lst =  
            (List<SubjectEntity>)request.getAttribute("data"); 
int i=1;            
%> 
<h3>Subject Master</h3>
<div style="float:right"><a href="subject.jsp">ADD</a></div>
<table class="table">
<thead>
  <tr>
    <th>SNo</th>
    <th>Subject Name</th>
    <th>Action</th>
  </tr>
</thead>
<tbody>
<% for(SubjectEntity e:lst) {   %> 
<tr>
<td><%=i %></td>
<td><%=e.getName() %></td>
<td>                   
 	<a href="SubjectEdit?id=<%= e.getId() %>">Edit</a>
    &nbsp;&nbsp;&nbsp;&nbsp;<a href="Subject?id=<%= e.getId() %>">Delete</a>
                    	                   	
</td>
</tr> 
<% i++; } %> 
</tbody>
</table>
</div> 


<%@ include file="footer.jsp" %>  
