package com.ineuron.JDBC.JdbcPreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.ineuron.JDBC.JdbcUtil.JdbcUtil;

public class InsertApp {

	public static void main(String[] args) throws SQLException {
		// resource used in JDBC
		Connection connection = null;
		PreparedStatement psmt = null;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Student Name :");
		String sname = scanner.next();

		System.out.print("Enter Student Age :");
		int sage = scanner.nextInt();

		System.out.print("Enter Student City :");
		String saddr = scanner.next();

		String sqlInsertQuery = "insert into student_details(`sname`,`sage`,`saddr`)values(?,?,?)";
		try {

			connection = JdbcUtil.getJdbcConnection();
//			System.out.println(connection);

			if (connection != null) {

				psmt = connection.prepareStatement(sqlInsertQuery);

			}
			if (psmt != null) {
				psmt.setString(1, sname);
				psmt.setInt(2, sage);
				psmt.setString(3, saddr);

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
