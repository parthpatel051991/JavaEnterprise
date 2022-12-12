package com.ineuron.JDBC.JdbcStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.ineuron.JDBC.JdbcUtil.JdbcUtil;

public class Update {

	public static void updateApp() throws SQLException {

		Connection connection = null;
		Statement statement = null;
		

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Your Student id :");
		int sid=scanner.nextInt();
		
		
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

				String sqlUpdateQuery = String.format("Update student_details set sname='%s',sage=%d,saddr='%s' where sid=%d" , sname,sage,saddr,sid);

				// using Statement object executing query
				int rowsAffected = statement.executeUpdate(sqlUpdateQuery);
//				System.out.println("Sql query :" +sqlUpdateQuery);
				System.out.println("No of rows affected : " + rowsAffected);
				
				if (rowsAffected == 0) {
					System.out.println("Record is not found for given id: "+sid);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			// Close the connection

			JdbcUtil.closeConnection(null, statement, connection);

			if (scanner != null) {
				scanner.close();
			}
		}

	}

}
