package com.ineuron.JDBC.JdbcStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.ineuron.JDBC.JdbcUtil.JdbcUtil;

public class Delete {
	public static void deleteApp() throws SQLException {

		Connection connection = null;
		Statement statement = null;
		

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Your Student id to delete your record : ");
		int sid=scanner.nextInt();
		

		try {
			// Established the connection b/w java and Databases through method created in
			// Jdbc.util package
			connection = JdbcUtil.getJdbcConnection();

			if (connection != null) {

				// create a Statement object
				statement = connection.createStatement();
			}
			if (statement != null) {

				String sqlDeleteQuery = String.format("Delete from student_details where sid=%d" ,sid);

				// using Statement object executing query
				int rowsAffected = statement.executeUpdate(sqlDeleteQuery);
//				System.out.println("Sql query :" +sqlUpdateQuery);
				System.out.println("No of rows affected : " + rowsAffected);
				
				if (rowsAffected == 0) {
					System.out.println("Record is not found for given id: "+sid);
				}else
				{
					System.out.println("Success. Your data has been deleted permanently ");
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
