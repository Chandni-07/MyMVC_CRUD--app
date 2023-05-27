<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Customer</title>
</head>
<body>
          <div id="wrapper">
             <div id="header">
                    <h1> CRM - CUSTOMER RELATIONSHIP MANAGER</h1>
                          <h2>Add Customers</h2>
                   
             
             </div>
             <form action="AddCustomerController">
             
                     Enter the First Name : <input type="text"  name="fname"><br><br>
                     Enter the Last Name : <input type="text"  name="lname"><br><br>
                     Enter the Email : <input type="text"  name="email"><br><br>
                     
                      <input type="submit" value="SAVE">
             
             </form>
        
          </div>
</body>
</html>