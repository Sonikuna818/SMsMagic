
<!DOCTYPE html>
<html lang="en">
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="./base.jsp" %>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
  <title>Center and Responsive Text</title>

<style>

body{
 background-color: #e6f7ff;
}
a{
 background-color: #007bff;
    color: white;
    padding: 10px 15px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
}
</style>

</head>
<body>

  <div class="container">
    <div class="row">
      <div class="col-sm-12">
       <h1 class="center-text mt-5">Welcome to Client Profile</h1>
        
        <table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">S.No</th>
      <th scope="col">Client Name</th>
      <th scope="col">Client Email</th>
      <th scope="col">Client Phone</th>
      <th scope="col">User Assign</th>
      <th scope="col">Company Assign</th>
      <th scope="col">Action</th>
      
   
    </tr>
  </thead>
  <tbody>
  
  <c:forEach items="${clientcreate }" var="p">
    <tr>
      <th scope="row">${p.clientid }</th>
      <td>${p.name }</td>
      <td>${p.email }</td>
      <td>${p.phone }</td>
      <td>${p.user }</td>
      <td>${p.company }</td>
     
     
      <td><a href="delete1/${p.clientid }"><i class="fa-solid fa-trash-can"></i></a>
           <a href="update2/${p.clientid }"><i class="fa-solid fa-pen-nib"></i></a>
      </td>
    </tr>
   </c:forEach>
  </tbody>
</table>
        
        <a href="${pageContext.request.contextPath }/">Back</a>
      </div>
    </div>
  </div>

  <!-- Bootstrap JS and Popper.js (optional) -->
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>
