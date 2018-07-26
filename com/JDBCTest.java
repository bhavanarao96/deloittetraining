package com;

import java.sql.*;
// to display all rows: (select * from stu_d)
public class JDBCTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// to load driver
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		System.out.println("Driver loaded");
		//define and establish connection
		Connection connection = 
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		System.out.println("Connected.");
		//Create statement Object
		Statement stat = connection.createStatement();
		//execute query
		//stat.executeQuery("delete * from stu_d");
		ResultSet resultSet = stat.executeQuery("select * from stu_d");
		while(resultSet.next()) {
			System.out.print(resultSet.getString(1)+"   ");
			System.out.println(resultSet.getString(2));
		}
		
		//close connection
		connection.close();
		System.out.println("Connection closed.");
	}
}
