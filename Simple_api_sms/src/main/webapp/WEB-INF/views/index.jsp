
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
  
  body {
    background-color: #f4f4f4;
    font-family: Arial, sans-serif;
}

.container {
    margin-top: 50px; 
}

.center-text {
    text-align: center;
    color: red;
}

.row {
    display: flex;
    justify-content: center;
    align-items: center;
}

.col-sm-12 {
    max-width: 1100px; 
    margin: 0 auto;
    padding: 20px;
    background-color: #ffffff;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

a {
    display: block;
    margin: 10px 0;
    text-decoration: none;
    color: #007bff; 
    font-size: 20px;
}

a:hover {
    color: #0056b3;
    text-decoration: none;
}
  
span{
color: red;
}
  
  </style>
  
</head>
<body>

  <div class="container">
    <div class="row">
      <div class="col-sm-12">
       <h1 class="center-text mt-5">Welcome to the Company and Client Management System</h1>
    
      
        <a href="${pageContext.request.contextPath }/UCreation"><span class="sno">1.</span> Add User Profile Details</a><br>
        <a href="${pageContext.request.contextPath }/Companies"><span class="sno">2.</span> Add Company Profile Details</a><br>
        <a href="${pageContext.request.contextPath }/CCreation"><span class="sno">3.</span> Add Client Profile Details</a><br>
        <a href="${pageContext.request.contextPath }/userprofile"><span class="sno">4.</span> User Profile Details</a><br>
        <a href="${pageContext.request.contextPath }/companyprofile1"><span class="sno">5.</span> Company Profile Details</a><br>
        <a href="${pageContext.request.contextPath }/clientprofile1"><span class="sno">6.</span> Client Profile Details</a><br>
        
        
      </div>
    </div>
  </div>

  <!-- Bootstrap JS and Popper.js (optional) -->
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>
