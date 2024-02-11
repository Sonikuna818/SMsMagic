<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="style.css">
  <title>User Creation</title>
  <style>
  
  body{
  margin: 0;
  padding: 0;
  background: aqua;
  }
  
  .container {
    display: flex;
    align-items: center;
    justify-content: center;
    height: 100vh;
   
    
}

form{
    width: 600px;
    padding: 20px;
    border-radius: 5px;
}

label {
    display: block;
    margin-bottom: 5px;
    font-weight: bold;
}

input {
    width: 100%;
    padding: 8px;
    margin-bottom: 10px;
    box-sizing: border-box;
}

button,a {
    background-color: #007bff;
    color: white;
    padding: 10px 15px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
}

button:hover {
    background-color: #0056b3;
}
  
  </style>
</head>
<body>

  <div class="container">
    <div class="row">
      <div class="col-sm-12">
      <h2 class="center-text mt-5 text-center">User Creation</h2>
      <form action="add-users" method="post">
  
      <label for="id">User ID:</label>
      <input type="text" id="id" name="userid" required>
      
      <label for="name">User Name:</label>
      <input type="text" id="name" name="name" required>
      
      <label for="email">Enter Email:</label>
      <input type="email" id="email" name="email" required>
      
      
      <label for="phone">Phone Number:</label>
      <input type="text" id="phone" name="phone" required>
      
      
      <label for="date">Date:</label>
      <input type="text" id="date" name="date" required>
      
      
      
      <button type="submit" class="btn btn-primary">Add User</button> 
      </form>

      </div>
    </div>
  </div>

  <!-- Bootstrap JS and Popper.js (optional) -->
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>
