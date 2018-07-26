package com;
//using batch
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.connection.MyConnection;

public class JDBCInsertTest3 {
	public static void main(String[] args) throws SQLException {
		Connection connection = MyConnection.getConnection();
		connection.setAutoCommit(false);
			Statement statement = connection.createStatement();
			statement.addBatch("insert into stu_d values(11,'Megha')");
			statement.addBatch("insert into stu_d values(12,'Seetha')");
			statement.addBatch("insert into stu_d values(13,'Shruthi')");
			int [] updateCounts =statement.executeBatch();
			connection.commit();
		
	}
}
