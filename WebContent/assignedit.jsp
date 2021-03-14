<%@page import="java.util.List"%>
<%@page import="com.entity.ClassEntity"%>
<%@page import="com.handler.ClassHandler"%> 

<%@page import="com.entity.SubjectEntity"%>
<%@page import="com.handler.SubjectHandler"%> 

<%@page import="com.entity.TeacherEntity"%>
<%@page import="com.handler.TeacherHandler"%> 

<%@page import="com.entity.AssignEntity"%>

<%@ include file="header.jsp" %>

<% AssignEntity obj = (AssignEntity)request.getAttribute("data"); %>

<%
ClassHandler ch = new ClassHandler();
List<ClassEntity> lst = ch.classList();

SubjectHandler sh = new SubjectHandler();
List<SubjectEntity> slst = sh.list();

TeacherHandler th = new TeacherHandler();
List<TeacherEntity> tlst = th.list();


%>

  
<div class="container">

<form action="AssignEdit" method="post">
  
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
 
  <div class="form-group">
    <label for="class">Subject:</label>
    <select name="fkSubjectId" id="fkSubjectId" required class="form-control">
      <option value="">Select Class</option>
    <% for(SubjectEntity e:slst) {   %> 
    
	      <% if(obj.getFkSubjectId()==e.getId()) {  %>
	      	<option value="<%=e.getId() %>" selected="selected"><%=e.getName() %></option>
	      <% }else{ %>
             <option value="<%=e.getId() %>"><%=e.getName() %></option> 	       
	      <% } %>
      
    <% } %>
    </select>
  </div>


   <div class="form-group">
    <label for="class">Teacher:</label>
    <select name="fkTeacherId" id="fkTeacherId" required class="form-control">
      <option value="">Select Teacher</option>
    <% for(TeacherEntity e:tlst) {   %>
     
	      <% if(obj.getFkTeacherId()==e.getId()) {  %>
	      	<option value="<%=e.getId() %>" selected="selected"><%=e.getName() %></option>
	      <% }else{ %>
             <option value="<%=e.getId() %>"><%=e.getName() %></option> 	       
	      <% } %>
      
      
    <% } %>
    </select>
  </div>
 



  <input type="hidden" name="id" id="id" value="<%= obj.getId() %>">
  <button type="submit" class="btn btn-default">Submit</button>
</form>  
  

</div> 


<%@ include file="footer.jsp" %>  