<%@ include file="header.jsp" %>



  
<div class="container">

<form action="Teacher" method="post">
  <div class="form-group">
    <label for="teacher name">Teacher Name:</label>
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
 

  <button type="submit" class="btn btn-default">Submit</button>
</form>  
  

</div> 


<%@ include file="footer.jsp" %>  