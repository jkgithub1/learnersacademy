<%@page import="com.entity.ClassEntity"%> 
<%@ include file="header.jsp" %>



<% ClassEntity obj = (ClassEntity)request.getAttribute("data"); %>
  
<div class="container">

<form action="ClassEdit" method="post">
  <div class="form-group">
    <label for="class name">Class Name:</label>
    <input type="text" class="form-control" id="name" value="<%= obj.getName() %>" required name="name">
  </div>
 
  <input type="hidden" name="classid" id="classid" value="<%= obj.getId() %>" >
  <button type="submit" class="btn btn-default">Submit</button>
</form>  
  

</div> 


<%@ include file="footer.jsp" %>  