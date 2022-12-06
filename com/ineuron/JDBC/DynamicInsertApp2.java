package com.ineuron.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicInsertApp2 {
	public static void main(String[] args) throws SQLException {

		Connection connection = null;
		Statement statement = null;

		// Step2.Established the connection b/w java and Databases
		String url = "jdbc:mysql://localhost:3306/student_details";
		String username = "root";
		String password = "rootpassword";
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Name :");
		String name=scanner.next();
		
		System.out.println("Enter Age :");
		int age=scanner.nextInt();
		
		

		try {

			connection = DriverManager.getConnection(url, username, password);

			if (connection != null) {

				// Step3 ::create a Statement object
				statement = connection.createStatement();

				if (statement != null) {

					String insertSqlQuery = String.format("insert into student1(`name`,`age`)values('%s',%d)",name,age);
					System.out.println(insertSqlQuery);

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
			if (scanner != null) {
				scanner.close();
			}
		}

	}
}
