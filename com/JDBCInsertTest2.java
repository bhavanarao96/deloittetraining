package com;
// to insert row using scanner 
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.connection.MyConnection;

public class JDBCInsertTest2 {
	public static void main(String[] args) throws SQLException {
		Connection connection = MyConnection.getConnection();
		connection.setAutoCommit(false);
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter roll");
			int roll=scanner.nextInt();
			System.out.println("Enter name");
			String name =scanner.next();
			PreparedStatement statement = 
					connection.prepareStatement("insert into stu_d values(?,?)");
			statement.setInt(1,roll);
			statement.setString(2, name);
			statement.executeUpdate();
			System.out.println("1st row added.");
			
			System.out.println("Enter roll");
			int roll2 =scanner.nextInt();
			System.out.println("Enter name");
			String name2 =scanner.next();
			PreparedStatement statement2 = 
					connection.prepareStatement("insert into stu_d values(?,?)");
			statement2.setInt(1,roll2);
			statement2.setString(2, name2);
			statement2.executeUpdate();
			System.out.println("2nd row added.");
			
			connection.commit();
			connection.close();
		} catch (Exception e) {
			connection.rollback();
			e.printStackTrace();
		}
	}
}
