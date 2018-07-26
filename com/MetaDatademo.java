package com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.connection.MyConnection;

public class MetaDatademo {
	@Author(name = "Bd", purpose = "demo")
	public static void main(String[] args) throws SQLException {
		Connection connection = MyConnection.getConnection();
		connection.setAutoCommit(false);
		Statement statement = connection.createStatement();
		DatabaseMetaData dbInfo = connection.getMetaData();
		System.out.println(dbInfo.storesUpperCaseIdentifiers());
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter table name");
		String tableName=in.next();
		Statement stat = connection.createStatement();
		ResultSet resultset= stat.executeQuery("select * from "+tableName);
		ResultSetMetaData rsmd = resultset.getMetaData();
		int columnCount = rsmd.getColumnCount();
		System.out.println("Result is");
		while (resultset.next()) {
			for (int i = 1; i <= columnCount ; i++) {
				System.out.print(resultset.getString(i) + "  ");
			}
			System.out.println();
		}
			
		
	}
}
