package com.ineuron.JDBC.JdbcStatement;

import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class TestApp {

	public static void main(String[] args) throws SQLException {

		// Step1:: Load and Register the Driver
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		System.out.println("Driver registered successfully");

		
		// Step2.Established the connection b/w java and Databases
		String url = "jdbc:mysql://localhost:3306/student_details";
		String username = "root";
		String password = "rootpassword";

		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Object is created:: " + connection);

		
		// Step3 ::create a Statement object
		Statement statement = connection.createStatement();
		System.out.println("Statement object is created:: " + statement);

		
		// Step4 :Sending and execute the Query
		String sqlSelectQuery = "select * from student";
		ResultSet resultSet = statement.executeQuery(sqlSelectQuery);
		System.out.println("ResultSet object is created:: " + resultSet);
		System.out.println("\n");
		
		// Step5 :Process the result from Resultset
		System.out.println("id\t  country\t  firstName\t  lastName\t  middleName");
		System.out.println("\n");

		while (resultSet.next()) {
			Integer id = resultSet.getInt(1);
			String country = resultSet.getString(2);
			String firstName = resultSet.getString(3);
			String lastName = resultSet.getString(4);
			String middleName = resultSet.getString(5);
			System.out.println(id + "\t" + country + "\t" + firstName + "\t" + lastName + "\t" + middleName);
		}

		
		// Step6 ::Close the connection
		connection.close();
		System.out.println("Closing the connection...");

	}

}
