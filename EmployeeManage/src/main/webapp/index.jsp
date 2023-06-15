<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<head>
 <title>Employee Management System</title>
 <style>
  body {
   font-family: Arial, sans-serif;
   margin: 0;
   padding: 0;
  }

  header {
   background-color: #333;
   color: white;
   padding: 20px;
   text-align: center;
  }

  h1 {
   margin: 0;
   font-size: 36px;
  }

  nav {
   background-color: #f2f2f2;
   padding: 10px;
   text-align: center;
   font-size: 18px;
   font-weight: bold;
  }

  nav a {
   color: #333;
   text-decoration: none;
   padding: 10px;
  }

  
  h1{
    text-align: center;
  }


  table {
   border-collapse: collapse;
   width: 100%;
  }


  th, td {
   padding: 10px;
   text-align: left;
   border-bottom: 1px solid #ddd;
  }

  tr:hover {
   background-color:grey;
  }
  .about {
 padding: 50px 0;
 text-align: center;
}

.about h2 {
 font-size: 36px;
 margin-bottom: 20px;
}

.contact {
 background-color:#BAD7E9;
 color: #fff;
 padding: 50px 0;
 text-align: center;
}

.contact h2 {
 font-size: 36px;
 margin-bottom: 20px;
}

form {
 display: inline-block;
 text-align: left;
}

label {
 display: block;
 margin-bottom: 10px;
}

input[type="text"],
input[type="email"],
textarea {
 padding: 10px;
 border-radius: 5px;
 border: none;
 margin-bottom: 20px;
 width: 100%;
}

input[type="submit"] {
 background-color: #fff;
 color: #333;
 padding: 10px 20px;
 border-radius: 5px;
 text-decoration: none;
 font-weight: bold;
 border: none;
 cursor: pointer;
}
  
 </style>
</head>
<body>
 <header>
  <h1>Employee Management System</h1>
 </header>
 
 <nav>
  <a href="#" class="d-inline-flex focus-ring py-1 px-2 text-decoration-none border rounded-2" style="--bs-focus-ring-color: rgba(var(--bs-success-rgb), .25)">Home</a>

  <a href="Add_new_employee.jsp" class="d-inline-flex focus-ring py-1 px-2 text-decoration-none border rounded-2" style="--bs-focus-ring-color: rgba(var(--bs-success-rgb), .25)">Add Employees</a>

  <a href="#" class="d-inline-flex focus-ring py-1 px-2 text-decoration-none border rounded-2" style="--bs-focus-ring-color: rgba(var(--bs-success-rgb), .25)">Departments</a>

  <a href="Login.jsp" class="d-inline-flex focus-ring py-1 px-2 text-decoration-none border rounded-2" style="--bs-focus-ring-color: rgba(var(--bs-success-rgb), .25)">Login</a>
 </nav>

 <main>
  <div id="carouselExampleFade" class="carousel slide carousel-fade">
    <div class="carousel-inner">
      <div class="carousel-item active">
        <img src="https://cdn.pixabay.com/photo/2017/09/15/19/41/businessman-2753324__340.jpg" class="d-block w-100" alt="...">
      </div>
      <div class="carousel-item">
        
        <img src="https://images.pexels.com/photos/5668888/pexels-photo-5668888.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1" class="d-block w-100" alt="...">
      </div>
      <div class="carousel-item">
        <img src="https://linksoftwarellc.com/wp-content/uploads/2021/05/custom-project-management-software-768x439.png" class="d-block w-100" alt="...">
      </div>
    </div>
    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleFade" data-bs-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Previous</span>
    </button>
    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleFade" data-bs-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Next</span>
    </button>
  </div>
  
  </main>
<div>
<br>
  <h1>Our Employees</h1>
  <br>
  <table>
   <tr>
    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
    <th>Department</th>
   </tr>
   <tr>
    <td>1</td>
    <td>John Doe</td>
    <td>john.doe@example.com</td>
    <td>IT</td>
   </tr>
   <tr>
    <td>2</td>
    <td>Jane Smith</td>
    <td>jane.smith@example.com</td>
    <td>HR</td>
   </tr>
   <tr>
    <td>3</td>
    <td>Bob Johnson</td>
    <td>bob.johnson@example.com</td>
    <td>Finance</td>
   </tr>
  </table>
</div>
 </main>
 <br><br>
 <section class="about">
  <h2>About Us</h2>
  <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed euismod, nisl vel tristique commodo, elit ex posuere purus, sit amet luctus urna sapien in lorem. </p>
 </section>

 <section class="contact">
  <h2>Contact Us</h2>
  <form>
   <label for="name">Name:</label>
   <input type="text" id="name" name="name">

   <label for="email">Email:</label>
   <input type="email" id="email" name="email">

   <label for="message">Message:</label>
   <textarea id="message" name="message"></textarea>

   <input type="submit" value="Submit">
  </form>
 </section>
 

</body>
</html>