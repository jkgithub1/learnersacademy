<%@ include file="header.jsp" %>



  
<div class="col-md-8 offset-md-2">

<form action="Login" method="post">
  <div class="form-group">
    <label for="email">User name:</label>
    <input type="name" class="form-control" id="uname" name="uname">
  </div>
  <div class="form-group">
    <label for="pwd">Password:</label>
    <input type="password" class="form-control" id="pwd" name="pwd">
  </div>

  <button type="submit" class="btn btn-default">Login</button>
</form>  
  

</div> 


<%@ include file="footer.jsp" %>  