package com.ineuron.JDBC.JdbcUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcUtil {

	private JdbcUtil() {

	}

	public static Connection getJdbcConnection() throws SQLException {

		//Resource used in JDBC Application
		Connection connection = null;

		// Established the connection b/w java and Databases
		String url = "jdbc:mysql://localhost:3306/student";
		String username = "root";
		String password = "rootpassword";

		
			connection = DriverManager.getConnection(url, username, password);

			if (connection != null) {
				return connection;
			}
	

		return connection;
	}
	
	public static void closeConnection(ResultSet resultSet, Statement statement, Connection connection)
			throws SQLException {
		
		// Close the connection
		
		if (resultSet != null) {
			resultSet.close();
		}

		if (statement != null) {
			statement.close();
		}
		if (connection != null) {
			connection.close();
		}
	}
}
