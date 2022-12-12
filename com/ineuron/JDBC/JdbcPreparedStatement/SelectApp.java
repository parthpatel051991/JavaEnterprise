package com.ineuron.JDBC.JdbcPreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.ineuron.JDBC.JdbcUtil.JdbcUtil;

public class SelectApp {

	public static void main(String[] args) throws SQLException {
		// resource used in JDBC
		Connection connection = null;
		PreparedStatement psmt = null;
		ResultSet resultSet = null;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Student id :");
		int sid = scanner.nextInt();

		String sqlSelectQuery = "select sid,sname,sage,saddr from student_details where sid=?";
		try {

			connection = JdbcUtil.getJdbcConnection();
//			System.out.println(connection);

			if (connection != null) {

				psmt = connection.prepareStatement(sqlSelectQuery);

			}
			if (psmt != null) {
				psmt.setInt(1, sid);
				resultSet = psmt.executeQuery();
			}
			if (resultSet != null) {

				if (resultSet.next()) {
					System.out.println("sid\tsname\tsage\tsaddr");
					System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3)
							+ "\t" + resultSet.getString(4));
				} else {
					System.out.println("Record is not available for given id : " + sid);
				}
			}

		} catch (SQLException se) {
			// TODO Auto-generated catch block
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			JdbcUtil.closeConnection(resultSet, psmt, connection);

			if (scanner != null) {
				scanner.close();
			}

		}

	}

}
