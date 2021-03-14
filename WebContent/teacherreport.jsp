<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>

<%@page import="org.hibernate.SQLQuery"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.utility.HibernateUtility"%>

<%@page import="com.entity.ClassEntity"%>
<%@page import="com.handler.ClassHandler"%>
<%@ include file="header.jsp" %>
<%
int i=1; int fkClassId=0;

ClassHandler ch = new ClassHandler();
List<ClassEntity> lst = ch.classList();

Session session1= HibernateUtility.getSession();

if(request.getParameter("fkClassId")!=null) {
	fkClassId=Integer.parseInt(request.getParameter("fkClassId"));
}

%>
<h3>Teacher Report</h3>
 
<form name="" method="get">

<div class="form-check form-check-inline">
  <label class="form-label">Class </label>
  <select name="fkClassId" id="fkClassId" class="form-control">
  <option value="">Select Class</option>
       <% for(ClassEntity e:lst) {   %> 
     
	      <% if(fkClassId==e.getId()) {  %>
	      	<option value="<%=e.getId() %>" selected="selected"><%=e.getName() %></option>
	      <% }else{ %>
             <option value="<%=e.getId() %>"><%=e.getName() %></option> 	       
	      <% } %>
      
    <% } %>
   
  </select>
  
</div>

<div class="form-check form-check-inline">
  <button type="submit" class="btn btn-default">Submit</button>
</div>


</form>



  
<div class="container">






<%  if(request.getParameter("fkClassId")!=null) { 

	SQLQuery query = session1.createSQLQuery("SELECT a.assignid,s.subjectname,t.teachername FROM  assignteacher a,subject s,teacher t WHERE  a.fksubjectid=s.subjectid AND a.fkteacherid=t.teacherid AND a.fkclassid=:fkclassid");

	query.setParameter("fkclassid", fkClassId);

	List<Object[]> rows = query.list();


%>


<table class="table">
<thead>
  <tr>
    <th>SNo</th>
    <th>Teacher</th>
    <th>Subject</th>
  </tr>
</thead>
<tbody>



<% for(Object[] row : rows){  %>
	 


<tr>
<td><%=i %></td>
<td><%=row[2].toString() %></td>
<td><%=row[1].toString() %></td>

</tr> 
<% i++; } %> 
</tbody>
</table>
</div> 

<% } %>

<%@ include file="footer.jsp" %>  
