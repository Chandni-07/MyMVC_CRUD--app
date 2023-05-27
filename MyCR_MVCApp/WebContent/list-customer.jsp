<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import = "java.util.ArrayList" %>
 <%@ page import = "com.wu.crmdemo.utility.Customer" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Customers</title>
</head>
<body>
              <div id="wrapper">
                   <div id="header">
                          <h1> CRM - CUSTOMER RELATIONSHIP MANAGER</h1>
                          <h2>List of Customers</h2>
                   
                   </div>
                   
                </div>   
                   <div id="buttondiv">
                         <form action ="showFormForAdd.jsp">
                                 <input type="submit" value="ADD CUSTOMER">
                         </form>
                   </div>
                   
           
              
              <div id="tablediv">
                  <!-------Adding HTML Table here----------->
                  <br><br>
                  <table border="1">
                      <tr>
                         <th>First Name</th>
                         <th>Last Name</th>
                         <th>Email </th>
                         <th>Action</th>
                         <th>Action</th>
                         
                      </tr> 
                      <% ArrayList<Customer> customers=(ArrayList<Customer>)request.getAttribute("custdata"); %>
                      <!-------iterating through Customer List----------->
                      <% for(Customer cust:customers )
                      {%>
                    	  
                    	  <tr>
                    	     <td><%=cust.getFirstname() %></td>
                    	     <td><%=cust.getLastname() %></td>
                    	     <td><%=cust.getEmail() %></td>
                    	     <td><a href="showFormForUpdate.jsp?firstName=<%=cust.getFirstname() %>
                    	                  &lastName=<%=cust.getLastname() %>
                    	                  &email=<%=cust.getEmail() %> ">UPDATE</a></td>
                    	     <!--we can always add values at end of URL,   they are called as query strings(parameters) - -->
                    	     <!-- Query Strings start with ? and separated &- -->
                    	     
                    	     <td><a href="DeleteCustomerController?lastName=<%=cust.getLastname()%>">DELETE</a></td>
                    	  </tr>
                    	  
                     <%}%> 
                      
                     
                  
                  </table>
              
              </div>
</body>
</html>