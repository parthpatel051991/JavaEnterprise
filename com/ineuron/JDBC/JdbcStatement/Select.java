package com.ineuron.JDBC.JdbcStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.ineuron.JDBC.JdbcUtil.JdbcUtil;

public class Select {

	public static void selectApp() throws SQLException {

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Student id :");
		int sid = scanner.nextInt();

		try {
			// Established the connection b/w java and Databases through method created in
			// Jdbc.util package
			connection = JdbcUtil.getJdbcConnection();

			if (connection != null) {

				// create a Statement object
				statement = connection.createStatement();
			}
			if (statement != null) {

				String sqlSelectQuery = "select sid,sname,sage,saddr from student_details where sid =" + sid + "";

				// using Statement object executing query
				resultSet = statement.executeQuery(sqlSelectQuery);
			}
			if (resultSet != null) {

				// Process the result from Resultset

				if (resultSet.next()) {

					System.out.println("sid\tsname\tsage\tsaddr");

					Integer id = resultSet.getInt(1);
					String name = resultSet.getString(2);
					Integer age = resultSet.getInt(3);
					String address = resultSet.getString(4);
					System.out.println(id + "\t" + name + "\t" + age + "\t" + address);
				} else {
					System.out.println("Record is not available for given id :" + sid);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			// Close the connection

			JdbcUtil.closeConnection(resultSet, statement, connection);

		}

	}

}
