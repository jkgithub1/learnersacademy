<%@page import="com.entity.TeacherEntity"%> 
<%@ include file="header.jsp" %>



<% TeacherEntity obj = (TeacherEntity)request.getAttribute("data"); %>
  
<div class="container">

<form action="TeacherEdit" method="post">
  <div class="form-group">
    <label for="class name">Teacher Name:</label>
    <input type="text" class="form-control" id="name" value="<%= obj.getName() %>" required name="name">
  </div>
  
  <div class="form-group">
    <label for="email">Email:</label>
    <input type="email" class="form-control" id="email" value="<%= obj.getEmail() %>"  required name="email">
  </div>
  <div class="form-group">
    <label for="city">City:</label>
    <input type="text" class="form-control" id="city" value="<%= obj.getCity() %>"  required name="city">
  </div>
  
  
 
  <input type="hidden" name="id" id="id" value="<%= obj.getId() %>" >
  <button type="submit" class="btn btn-default">Submit</button>
</form>  
  

</div> 


<%@ include file="footer.jsp" %>  