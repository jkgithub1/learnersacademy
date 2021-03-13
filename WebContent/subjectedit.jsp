<%@page import="com.entity.SubjectEntity"%> 
<%@ include file="header.jsp" %>



<% SubjectEntity obj = (SubjectEntity)request.getAttribute("data"); %>
  
<div class="container">

<form action="SubjectEdit" method="post">
  <div class="form-group">
    <label for="class name">Subject Name:</label>
    <input type="text" class="form-control" id="name" value="<%= obj.getName() %>" required name="name">
  </div>
 
  <input type="hidden" name="id" id="id" value="<%= obj.getId() %>" >
  <button type="submit" class="btn btn-default">Submit</button>
</form>  
  

</div> 


<%@ include file="footer.jsp" %>  