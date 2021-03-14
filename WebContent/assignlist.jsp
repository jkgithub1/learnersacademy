<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>

<%@page import="org.hibernate.SQLQuery"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.utility.HibernateUtility"%>
<%@ include file="header.jsp" %>
<%
int i=1;
Session session1= HibernateUtility.getSession();

SQLQuery query = session1.createSQLQuery("SELECT a.assignid,s.subjectname,c.name,t.teachername FROM  assignteacher a,subject s,class c,teacher t WHERE a.fkclassid=c.id AND a.fksubjectid=s.subjectid AND a.fkteacherid=t.teacherid");


List<Object[]> rows = query.list();

%>

 




  
<div class="container">


<h3>Assign Teacher / Subject</h3>
<div style="float:right"><a href="assign.jsp">ADD</a></div>
<table class="table">
<thead>
  <tr>
    <th>SNo</th>
    <th>Class</th>
    <th>Subject</th>
    <th>Teacher</th>
    
    <th>Action</th>
  </tr>
</thead>
<tbody>



<% for(Object[] row : rows){  %>
	 


<tr>
<td><%=i %></td>
<td><%=row[2].toString() %></td>
<td><%=row[1].toString() %></td>
<td><%=row[3].toString() %></td>
<td>                   
 	<a href="AssignEdit?id=<%= row[0].toString() %>">Edit</a>
    &nbsp;&nbsp;&nbsp;&nbsp;<a href="Assign?id=<%= row[0].toString() %>">Delete</a>
                    	                   	
</td>
</tr> 
<% i++; } %> 
</tbody>
</table>
</div> 


<%@ include file="footer.jsp" %>  
