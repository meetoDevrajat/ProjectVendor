<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Grizzly Store|Add Product</title>
<style>

.container {
  padding: 16px;
  background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 10px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}



</style>
</head>
<body>


<form action="saveBook" method="Post" modelAttribute="product">
<div  class = "container">

 <h1>Product</h1>
    <p>Please fill in this form to add a product.</p>



  <label >Product Id</label>
  <input type="hidden" name="id" value="${product.id}" required readonly  ><br>

   <div class="form-group">
     <label >Brand </label>
  <input type="text" name="brand" placeholder="Enter Brand"   value="${product.brand }" required> <br>
  </div>
  
   <div class="form-group">
 <label>Category</label>
  <input type="text" name="category"  placeholder="Enter Category"  value="${product.category }" required> <br>
   </div>
  
 <div class="form-group">
  <label>Description</label>
  <input type="text" name="description" placeholder="Enter Description" value="${product.description }" required> <br>
  </div>
<%--   Image:<br>
  <input type="text" name="image" value="${product.image }" required> <br>
   --%>
   
     <div class="form-group">
 <label>Name</label>
  <input type="text" placeholder="Enter Name" name="name" value="${product.name }" required> <br>
     </div>
     

     
  <div class="form-group">
 <label>Price</label>
  <input type="text" name="price" placeholder="Enter Price" value="${product.price }" required> <br>
     </div>
     
      <div class="form-group">
 <label>Rating</label>
  <input type="text" name="rating"  placeholder="Enter Rating" value="${product.rating }" required> <br>
  </div>
    <div class="form-group">
 <label>Vendor Id</label>
  <input type="text" name="rating"  placeholder="Enter Rating" value="${product.vendor_id }" required> <br>
  </div>
  <input type="submit"  class="btn btn-light"  value="Submit">
</div>

</form>
</body>
</html>