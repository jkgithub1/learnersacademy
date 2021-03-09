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
<td></td>
</tr> 
<% i++; } %> 
</tbody>
</table>
</div> 


<%@ include file="footer.jsp" %>  