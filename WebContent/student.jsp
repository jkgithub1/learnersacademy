<%@page import="java.util.List"%>
<%@page import="com.entity.ClassEntity"%>
<%@page import="com.handler.ClassHandler"%> 
<%@ include file="header.jsp" %>


<%
ClassHandler ch = new ClassHandler();
List<ClassEntity> lst = ch.classList();
%>

  
<div class="container">

<form action="Student" method="post">
  <div class="form-group">
    <label for="teacher name">Student Name:</label>
    <input type="text" class="form-control" id="name" required name="name">
  </div>
  <div class="form-group">
    <label for="email">Email:</label>
    <input type="email" class="form-control" id="email" required name="email">
  </div>
  <div class="form-group">
    <label for="city">City:</label>
    <input type="text" class="form-control" id="city" required name="city">
  </div>
  <div class="form-group">
    <label for="class">Class:</label>
    <select name="fkClassId" id="fkClassId" required class="form-control">
      <option value="">Select Class</option>
    <% for(ClassEntity e:lst) {   %> 
      <option value="<%=e.getId() %>"><%=e.getName() %></option>
    <% } %>
    </select>
  </div>
 

  <button type="submit" class="btn btn-default">Submit</button>
</form>  
  

</div> 


<%@ include file="footer.jsp" %>  