package com.ineuron.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertApp {

	public static void main(String[] args) throws SQLException {

		Connection connection = null;
		Statement statement = null;

		// Step2.Established the connection b/w java and Databases
		String url = "jdbc:mysql://localhost:3306/student_details";
		String username = "root";
		String password = "rootpassword";

		try {

			connection = DriverManager.getConnection(url, username, password);

			if (connection != null) {

				// Step3 ::create a Statement object
				statement = connection.createStatement();

				if (statement != null) {

					String insertSqlQuery = "Insert into student1(`id`,`name`,`age`)values(3,'Kohli',39)";

					// Step4 : using Statement object executing query
					int noOfRows = statement.executeUpdate(insertSqlQuery);

					System.out.println("No of rows affected :" + noOfRows);

				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			// Step6 ::Close the connection

			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		}

	}

}
