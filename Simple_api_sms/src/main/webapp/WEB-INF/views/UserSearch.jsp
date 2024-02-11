<!DOCTYPE html>
<html lang="en">
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="./base.jsp" %>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="style.css">
  <title>Center and Responsive Text</title>
  <style>
  body {
    background-color: #e6f7ff; /* Light blue */
}
  </style>
</head>
<body>

  <div class="container">
    <div class="row">
      <div class="col-sm-12">
      <h2 class="center-text mt-5">User Searching</h2>
      <form action="${pageContext.request.contextPath }/search" method="get">
      <label for="email">Enter Email:</label>
      <input type="text" id="email" name="email" required>
      <button type="submit">Get Profile</button>
      </form>

      </div>
    </div>
  </div>
  
  <div class="container">
    <div class="row">
      <div class="col-sm-12">
       <h1 class="center-text mt-5">Outputs :</h1>
        
        <table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">S.No</th>
      <th scope="col">User Name</th>
      <th scope="col">User Email</th>
      <th scope="col">User phone</th>
      <th scope="col">User Date</th>
      
    </tr>
  </thead>
  <tbody>
  
  <c:forEach items="${usercreate }" var="p">
    <tr>
      <th scope="row">${p.userid }</th>
      <td>${p.name }</td>
      <td>${p.email }</td>
      <td>${p.phone }</td>
      <td>${p.date }</td>
    </tr>
   </c:forEach>
  </tbody>
</table>
        
        
      </div>
    </div>
  </div>
  

  <!-- Bootstrap JS and Popper.js (optional) -->
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>
