<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Customer</title>
</head>
<body>
              <div id="wrapper">
             <div id="header">
                    <h1> CRM - CUSTOMER RELATIONSHIP MANAGER</h1>
                          <h2>Update Customer Form</h2>
                   
             
             </div>
             <br>
              <form action="UpdateCustomerController">
                     
                     Enter the First Name : <input type="text" value=<%= request.getParameter("firstName") %>  name="fname"><br><br>
                     Enter the Last Name : <input type="text"value=<%= request.getParameter("lastName") %>  name="lname"><br><br>
                     Enter the Email : <input type="text" value=<%= request.getParameter("email") %> name="email"><br><br>
                     <input type="hidden"value=<%= request.getParameter("lastName") %>  name="hidden"><br><br>
                     
                     
                      <input type="submit" value="UPDATE">   
             </form>
            </div> 
</body>
</html>