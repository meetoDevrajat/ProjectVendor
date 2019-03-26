<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<style>
/* Create three equal columns that floats next to each other */
.column {
  float: left;
  width: 33.33%;
  padding: 15px;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

/* Responsive layout - makes the three columns stack on top of each other instead of next to each other */
@media screen and (max-width:600px) {
  .column {
    width: 100%;
  }
}



</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<!-- Nav Bar -->
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Grizzly Store</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
    
   
      </li>
      
    </ul>
    <ul class="nav navbar-nav navbar-right">
    
      <li><a href="<c:url value='/product/logout' />"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
    </ul>
  </div>
</nav>
  



<div class="container">
<h3 ><b>Profile</b></h3>
  <div class="col-md-3">
    <div class="card">
  <img src="https://images.pexels.com/photos/555790/pexels-photo-555790.png?auto=compress&cs=tinysrgb&dpr=1&w=500" alt="John" style="width:100%">
  <br>
   <h3 align="center"><b>ID</b></h3>
  <p align="center">Rajat Bishnoi</p>
   <h3 align="center"><b>Designation</b></h3>
   <p align="center">Sr.Admin</p>
   
   <h3 align="center"><b>Office</b></h3>
   <p align="center">Pune</p>
 

 
</div>
  </div>
<div class="col-md-9">
<table class="table">
  <thead>
  <h4>Welcome to the Grizzly Store,${ pageContext.request.userPrincipal.name}!</h4>
		<nav class="navbar navbar-default">

 
    <ul class="nav navbar-nav">
      <li class="active"><a href="/demo/product/list">Products</a></li>
      <li><a href="/demo/vendor/vendorlist">Vendors</a></li>
    
    </ul>
 
</nav>
              
      <tr>
    
      <th scope="col">Brand</th>
      <th scope="col">Category</th>
      <th scope="col">Description</th>
       <th scope="col">Name</th>
      <th scope="col">Price</th>
      <th scope="col">Rating</th>
      </tr>
      </thead>
  		
  
  
 <tbody>
  
   <c:forEach var ="tempProduct" items = "${vendor.products}">
   
  
   
   <c:url var = "viewLink" value="/vendor/viewVendorProducts">
  
  <c:param name="id" value="${tempProduct.id}"></c:param>
  
  </c:url>
   
   
    
   <tr>

    <td>${tempProduct.brand}</td>
    <td>${tempProduct.category}</td>
    <td>${tempProduct.description}</td>
    <td>${tempProduct.name}</td>
    <td>${tempProduct.price}</td>
    <td>${tempProduct.rating}</td>
   <td>
   


    
  
   </td>
   </tbody>
   </tr>
   </c:forEach>
      </table>

    
         </div>
         </div>

</body>
</html>