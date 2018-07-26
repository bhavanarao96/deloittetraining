package com;
//using procedure
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.connection.MyConnection;

public class JDBCInsertTest4 {
	public static void main(String[] args) throws SQLException {
		Connection connection = MyConnection.getConnection();
		connection.setAutoCommit(false);
			CallableStatement statement = connection.prepareCall("{call firstp(?,?)}");
			statement.setInt(1, 1011);
			statement.setString(2, "Amit");
			statement.execute();
			connection.commit();
		
	}
}
