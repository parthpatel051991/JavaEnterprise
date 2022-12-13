package com.ineuron.JDBC.JdbcStatement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.ineuron.JDBC.JdbcUtil.JdbcUtil;

public class Insert {

	public static void InsertApp() throws SQLException {

		Connection connection = null;
		Statement statement = null;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Student Name :");
		String sname = scanner.next();

		System.out.print("Enter Student Age :");
		int sage = scanner.nextInt();

		System.out.print("Enter Student City :");
		String saddr = scanner.next();

		try {
			// Established the connection b/w java and Databases through method created in
			// Jdbc.util package
			connection = JdbcUtil.getJdbcConnection();

			if (connection != null) {

				// create a Statement object
				statement = connection.createStatement();
			}
			if (statement != null) {

				String sqlInsertQuery = String.format(
						"Insert into student_details(`sname`,`sage`,`saddr`)values('%s',%d,'%s')", sname, sage, saddr);

				// using Statement object executing query
				int rowsAffected = statement.executeUpdate(sqlInsertQuery);
				System.out.println("No of rows affected : " + rowsAffected);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			// Close the connection

			JdbcUtil.closeConnection(null, statement, connection);

		}

	}

}
