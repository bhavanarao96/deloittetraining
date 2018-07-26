package com;
//to insert row giving values
//delete row
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.SQLException;

import com.connection.MyConnection;

public class JDBCInsertTest {
	public static void main(String[] args) throws SQLException {
		Connection connection = MyConnection.getConnection();
		Statement statement = connection.createStatement();
		int rowsAffected = statement.executeUpdate("insert into stu_d values(4,'Kapoor')");
//		int rowsAffected = statement.executeUpdate("delete from stu_d where name ='Manu'");
		System.out.println(rowsAffected+ " row(s) inserted successfully");
		connection.close();
	}
}
