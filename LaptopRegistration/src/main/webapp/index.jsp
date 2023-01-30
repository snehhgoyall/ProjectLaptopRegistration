<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

  
    <title>Registration Form</title>
    <%@include file="Components/css_js_common.jsp" %>
  </head>
  <body>
  
    <%@include file="Components/navbar.jsp" %>
     <%@include file="Components/message.jsp"%> 

	
	
	
	
  <!-- registration form -->  
   <div class="container col-md-4 offset-md-4 ">
     <div class="card bg-light mx-auto">
       <div class="card-body">
       <h4 class="card-title mt-3 text-center">Register Here</h4>
       <p class="text-center">Fill your details Carefully.</p>
       </div>
     </div>
    </div>
    
       
     <div class="row mt-2">
       <div class="col-md-4 offset-md-4 text-right">   

       <form action="RegisterServlet" method="post">
         <div class="form-group">
         <label for="laptop_name" class="form-label">Laptop Name</label>
         <input type="text" class="form-control" name="laptop_name" id="laptop_name" placeholder="Enter Laptop Name Here" aria-describedby="emailHelp">
         </div>
         
         	<div>
				<label for="laptop_brand" class="form-label">Laptop Brand</label>
                <input class="form-select" list="Options" name="laptop_brand" id="laptop_brand" placeholder="Type to search...">
                <datalist id="Options">
                <option value="HP">HP</option>
                <option value="Apple">Apple</option>
                <option value="Dell">Dell</option>
                <option value="Asus">Asus</option>
                <option value="Lenovo">Lenovo</option>
                 <option value="Acer">Acer</option>
                  <option value="Other">Other</option>
                </datalist>
                </div>
         
         
         <div class="form-group">
         <label for="laptop_price" class="form-label">Laptop Price</label>
         <input type="text" class="form-control" name="laptop_price" id="laptop_price" placeholder="Enter Laptop Price Here" aria-describedby="emailHelp">
         </div>
 	

<div class="form-group my-3">
<label class="radio-inline"><input type="radio" name="touch_screen" value="yes">is Touch Screen</label>
<label class="radio-inline"><input type="radio" name="touch_screen" value="no">not Touch Screen</label>
</div>



<div class="form-group my-3 ">
<label class="radio-inline"><input type="radio" name="fast_charging" value="yes">is Fast Charging</label>
<label class="radio-inline"><input type="radio" name="fast_charging" value="no">not Fast Charging</label>
</div>
         
         <div class="form-group">
         <label for="processor" class="form-label">Processor Type</label>
         <input type="text" class="form-control"  name="processor" id="processor" placeholder="Enter Laptop processor Here" aria-describedby="emailHelp">
         </div>
         
         
       	<div>
				<label for="ram_size" class="form-label">RAM Size</label>
                <input class="form-select" list="Options2"  name="ram_size" id="ram_size" placeholder="Type to search...">
                <datalist id="Options2">
                            <option value="4GB"></option>
							<option value="8GB"></option>
							<option value="16GB"></option>
							<option value="32GB"></option>
							<option value="64GB"></option>
							<option value="128GB"></option>
                </datalist>
                </div>
       	<div>
				<label for="storage_capacity" class="form-label">Storage Capacity</label>
                <input class="form-select" list="Options3" name="storage_capacity" id="storage_capacity" placeholder="Type to search...">
                <datalist id="Options3">
                            <option value="4GB"></option>
							<option value="8GB"></option>
							<option value="16GB"></option>
							<option value="32GB"></option>
							<option value="64GB"></option>
							<option value="128GB"></option>
							<option value="256GB"></option>
							<option value="512GB"></option>
                </datalist>
                </div>
         
          <div class="container text-center my-3">
                  <button type="submit" class="btn btn-outline-success">Register</button>
                <button type="reset" class="btn btn-outline-warning">Reset</button>
          </div>
         </form>
         </div>
         </div>
   <!-- Delete Form -->
   
    <form class="d-flex border=2px" action="DeleteLaptopServlet" method="get">
      <div class="position-absolute bottom-0 start-50 translate-middle-x">
         <div class="form-outline " style=width:80rem align="right">
                     <label class="form-label text-left" for="laptop_name">Laptop Name</label>
                     <input type="text" name="delete" id="laptop_name" class="form-group"/>
                     
               <div>     <button type="submit" class="btn btn-outline-success">Delete</button>
                <button type="reset" class="btn btn-outline-warning">Reset</button></div> 
                </div>
                </div>
                
           </form>
         
	

                
      
            
<!-- Footer -->
<footer class="page-footer font-dark custom-bg text-center">
 <div class="footer-copyright py-3">
                  <a href="ViewLaptopServlet">View All Registered Laptops</a>
                 </div>

  

</footer>
<!-- Footer -->
  </body>
</html>