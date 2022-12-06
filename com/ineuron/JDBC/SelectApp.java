package com.ineuron.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class SelectApp {

	public static void main(String[] args) throws SQLException {

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

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

					String sqlSelectQuery = "select id,country,firstName,lastName,middleName from student where id =1";

					// Step4 : using Statement object executing query
					resultSet = statement.executeQuery(sqlSelectQuery);

					if (resultSet != null) {

						// Step5 :Process the result from Resultset
						
						System.out.println("id\tcountry\tfirstName\tlastName\tmiddleName");
						

						while (resultSet.next()) {
							Integer id = resultSet.getInt(1);
							String country = resultSet.getString(2);
							String firstName = resultSet.getString(3);
							String lastName = resultSet.getString(4);
							String middleName = resultSet.getString(5);
							System.out.println(
									id + " \t " + country + " \t " + firstName + " \t " + lastName + "\t" + middleName);
						}
					}

				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			// Step6 ::Close the connection

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

}
