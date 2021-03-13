
<%@page import="java.util.List"%>
<%@page import="com.entity.ClassEntity"%>
<%@page import="com.entity.StudentEntity"%>
<%@page import="com.handler.ClassHandler"%> 
<%@ include file="header.jsp" %>

<% StudentEntity obj = (StudentEntity)request.getAttribute("data"); %>

<%
ClassHandler ch = new ClassHandler();
List<ClassEntity> lst = ch.classList();
%>

  
<div class="container">

<form action="StudentEdit" method="post">
  <div class="form-group">
    <label for="teacher name">Student Name:</label>
    <input type="text" class="form-control" id="name" value="<%=obj.getName() %>" required name="name">
  </div>
  <div class="form-group">
    <label for="email">Email:</label>
    <input type="email" class="form-control" id="email" value="<%=obj.getEmail() %>" required name="email">
  </div>
  <div class="form-group">
    <label for="city">City:</label>
    <input type="text" class="form-control" id="city"  value="<%=obj.getCity() %>" required name="city">
  </div>
  <div class="form-group">
    <label for="class">Class:</label>
    <select name="fkClassId" id="fkClassId" required class="form-control">
      <option value="">Select Class</option>
    <% for(ClassEntity e:lst) {   %> 
     
	      <% if(obj.getFkClassId()==e.getId()) {  %>
	      	<option value="<%=e.getId() %>" selected="selected"><%=e.getName() %></option>
	      <% }else{ %>
             <option value="<%=e.getId() %>"><%=e.getName() %></option> 	       
	      <% } %>
      
    <% } %>
    </select>
  </div>
 
  <input type="hidden" name="id" id="id" value="<%= obj.getId() %>" >
  <button type="submit" class="btn btn-default">Submit</button>
</form>  
  

</div> 


<%@ include file="footer.jsp" %>  