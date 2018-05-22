package com.rekha.test;

import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sun.corba.se.pept.transport.Connection;

public class database {
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.OracleDriver");
		   System.out.println("Driver Loaded");
		   
		   
		      
		    // This will connect with Database , getConnection taking three argument
		   //  first argument Test_Oracle is the dsn which you can change as per your system,
		   // second argument is username and third argument is password
		 
		   java.sql.Connection con= DriverManager.getConnection("jdbc:oracle:thin:@drdm01-scan:1521:dppdqa","sit_test","newtest");
		 
		   System.out.println("Connection created");
		   
		  // This will create statement  
		         java.sql.Statement smt=  con.createStatement();
		         
		         System.out.println("Statement created");
		 
		  // Now execute the query, here facebook is the table which I have created in DB 
		      
		 ResultSet rs=  smt.executeQuery("Select * from dppdec.dec_charge where CHARGE_ID ='213743'");

		 System.out.println("Query Executed");
		 while(rs.next())
		 {
		 System.out.println(rs.getInt(1));
		 }
		 
		/* 
		 pass parameter in sql query 
		 statement =con.prepareStatement("SELECT * from employee WHERE  userID = :userId");
		   statement.setString(userId, userID);
		   ResultSet rs = statement.executeQuery();
		Or, you can use ? in place of named value - :userId..

		   statement =con.prepareStatement("SELECT * from employee WHERE  userID = ?");
		   statement.setString(1, userID);
		   */
	}

}
