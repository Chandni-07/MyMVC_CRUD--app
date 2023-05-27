package com.wu.crmdemo.daao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.wu.crmdemo.utility.Customer;

public class CustomerDAO {
	String databaseDriver="oracle.jdbc.driver.OracleDriver";
	String connectionURL="jdbc:oracle:thin:@localhost:1521:XE";
	String userName="scott";
	String passWord="tiger";
    String sqlQuery="SELECT * FROM CUSTOMER";
    
    public ArrayList<Customer> getCustomers(){
    	ArrayList<Customer>  customers=new ArrayList<Customer>();
    	try {
		
			Class.forName(databaseDriver);
			Connection con=DriverManager.getConnection(connectionURL,userName,passWord);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sqlQuery);
			
			
			while(rs.next()) {
				Customer C1=new Customer();
				
				C1.setFirstname(rs.getString(1));
				C1.setLastname(rs.getString(2));
				C1.setEmail(rs.getString(3));
				customers.add(C1);
			}
		con.close();
		  
		}
		catch(Exception e) {
			e.printStackTrace();
		}
    	
    	return customers;
    }

	public void addCustomer(String firstName, String lastName, String email) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName(databaseDriver);
			Connection con=DriverManager.getConnection(connectionURL,userName,passWord);
			PreparedStatement stmt=con.prepareStatement("INSERT INTO Customer values(?,?,?)");
			// we use preparedStatement for DML queries, insert,update, delete etc
			stmt.setString(1, firstName);
			stmt.setString(2,lastName);
			stmt.setString(3, email);
			
			int i=stmt.executeUpdate();
			System.out.println(i+" Record Added");
			
			con.commit();
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
    	
		
		
	}

	public void updateCustomer(String lastName1,String firstName, String lastName, String email) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName(databaseDriver);
			Connection con=DriverManager.getConnection(connectionURL,userName,passWord);
			PreparedStatement stmt=con.prepareStatement("UPDATE Customer SET FIRST_NAME=? ,LAST_NAME=? ,EMAIL=? WHERE LAST_NAME=?");
			stmt.setString(1, firstName);
			stmt.setString(2,lastName);
			stmt.setString(3, email);
			stmt.setString(4, lastName1);
			
			int i=stmt.executeUpdate();
			System.out.println(i+" Record Updated");
			
			
			con.commit();
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteCustomer(String lastName) {
		// TODO Auto-generated method stub
		try {
			Class.forName(databaseDriver);
			Connection con=DriverManager.getConnection(connectionURL,userName,passWord);
			PreparedStatement stmt=con.prepareStatement("DELETE FROM Customer WHERE LAST_NAME=?");
			stmt.setString(1,lastName);
			
			
			int i=stmt.executeUpdate();
			System.out.println(i+" Record Deleted");
			
			
			con.commit();
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
