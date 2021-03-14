<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>

<%@page import="org.hibernate.SQLQuery"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.utility.HibernateUtility"%>
<%@ include file="header.jsp" %>
<%
int i=1;
Session session1= HibernateUtility.getSession();

SQLQuery query = session1.createSQLQuery("SELECT {s.*}, {c.*} FROM student s,class c WHERE s.fkclassid=c.id");


List<Object[]> rows = query.list();

%>

 




  
<div class="container">


<h3>Student Report</h3>





<div style="float:right"><a href="student.jsp">ADD</a></div>
<table class="table">
<thead>
  <tr>
    <th>SNo</th>
    <th>Student Name</th>
    <th>Email</th>
    <th>city</th>
    <th>class</th>
    <th>Action</th>
  </tr>
</thead>
<tbody>



<% for(Object[] row : rows){  %>
	 


<tr>
<td><%=i %></td>
<td><%=row[4].toString() %></td>
<td><%=row[2].toString() %></td>
<td><%=row[1].toString() %></td>
<td><%=row[6].toString() %></td>
<td>                   
 	<a href="StudentEdit?id=<%= row[0].toString() %>">Edit</a>
    &nbsp;&nbsp;&nbsp;&nbsp;<a href="Student?id=<%= row[0].toString() %>">Delete</a>
                    	                   	
</td>
</tr> 
<% i++; } %> 
</tbody>
</table>
</div> 


<%@ include file="footer.jsp" %>  
