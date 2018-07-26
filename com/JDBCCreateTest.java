package com;
//to create a table
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.connection.MyConnection;

public class JDBCCreateTest {
	public static void main(String[] args) throws SQLException {
		Connection connection = MyConnection.getConnection();
		Statement statement = connection.createStatement();
		statement.execute("create table student(roll number, name varchar2(20))");
		System.out.println("Table created.");
		connection.close();
	}
}
