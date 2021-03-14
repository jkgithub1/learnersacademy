<%@page import="java.util.List"%>
<%@page import="com.entity.ClassEntity"%>
<%@page import="com.handler.ClassHandler"%> 

<%@page import="com.entity.SubjectEntity"%>
<%@page import="com.handler.SubjectHandler"%> 

<%@page import="com.entity.TeacherEntity"%>
<%@page import="com.handler.TeacherHandler"%> 


<%@ include file="header.jsp" %>


<%
ClassHandler ch = new ClassHandler();
List<ClassEntity> lst = ch.classList();

SubjectHandler sh = new SubjectHandler();
List<SubjectEntity> slst = sh.list();

TeacherHandler th = new TeacherHandler();
List<TeacherEntity> tlst = th.list();


%>

  
<div class="container">

<form action="Assign" method="post">
  
  <div class="form-group">
    <label for="class">Class:</label>
    <select name="fkClassId" id="fkClassId" required class="form-control">
      <option value="">Select Class</option>
    <% for(ClassEntity e:lst) {   %> 
      <option value="<%=e.getId() %>"><%=e.getName() %></option>
    <% } %>
    </select>
  </div>
 
  <div class="form-group">
    <label for="class">Subject:</label>
    <select name="fkSubjectId" id="fkSubjectId" required class="form-control">
      <option value="">Select Class</option>
    <% for(SubjectEntity e:slst) {   %> 
      <option value="<%=e.getId() %>"><%=e.getName() %></option>
    <% } %>
    </select>
  </div>


   <div class="form-group">
    <label for="class">Teacher:</label>
    <select name="fkTeacherId" id="fkTeacherId" required class="form-control">
      <option value="">Select Teacher</option>
    <% for(TeacherEntity e:tlst) {   %> 
      <option value="<%=e.getId() %>"><%=e.getName() %></option>
    <% } %>
    </select>
  </div>
 




  <button type="submit" class="btn btn-default">Submit</button>
</form>  
  

</div> 


<%@ include file="footer.jsp" %>  