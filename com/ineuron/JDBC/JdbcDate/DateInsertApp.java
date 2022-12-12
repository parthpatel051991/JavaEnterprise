package com.ineuron.JDBC.JdbcDate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.ineuron.JDBC.JdbcUtil.JdbcUtil;

public class DateInsertApp {

	public static void main(String[] args) throws SQLException, ParseException {

		// resource used in JDBC
		Connection connection = null;
		PreparedStatement psmt = null;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Student Name :");
		String sname = scanner.next();

		System.out.print("Enter Student City :");
		String saddr = scanner.next();

		System.out.print("Enter Student Gender :");
		String sgen = scanner.next();

		System.out.print("Enter Student Date of Birth(dd-MM-yyyy) :");
		String sdob = scanner.next();

		System.out.print("Enter Student Date of join(MM-dd-yyyy) :");
		String sdoj = scanner.next();

		System.out.print("Enter Student Date of marraige(yyyy-MM-dd) :");
		String sdom = scanner.next();

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date uDob = sdf.parse(sdob);

		SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-yyyy");
		java.util.Date uDoj = sdf1.parse(sdoj);

		long dobTime = uDob.getTime();
		long dojTime = uDoj.getTime();

		java.sql.Date sqlDob = new java.sql.Date(dobTime);
		java.sql.Date sqlDoj = new java.sql.Date(dojTime);

		java.sql.Date sqlDom = java.sql.Date.valueOf(sdom);

		System.out.println("SqlDOb is :" + sqlDob);
		System.out.println("SqlDoj is :" + sqlDoj);
		System.out.println("SqlDom is :" + sqlDom);

		String sqlInsertQuery = "insert into user_details(`name`,`address`,`gender`,`dob`,`doj`,`dom`)values(?,?,?,?,?,?)";
		try {

			connection = JdbcUtil.getJdbcConnection();
//					System.out.println(connection);

			if (connection != null) {

				psmt = connection.prepareStatement(sqlInsertQuery);

			}
			if (psmt != null) {
				psmt.setString(1, sname);
				psmt.setString(2, saddr);
				psmt.setString(3, sgen);
				psmt.setDate(4, sqlDob);
				psmt.setDate(5, sqlDoj);
				psmt.setDate(6, sqlDom);

				int rowAffected = psmt.executeUpdate();
				System.out.println("No. of rows affected :" + rowAffected);

			}

		} catch (SQLException se) {
			// TODO Auto-generated catch block
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			JdbcUtil.closeConnection(null, psmt, connection);

			if (scanner != null) {
				scanner.close();
			}

		}

	}

}
