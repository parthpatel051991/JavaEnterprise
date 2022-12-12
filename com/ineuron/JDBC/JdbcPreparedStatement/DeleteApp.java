package com.ineuron.JDBC.JdbcPreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.ineuron.JDBC.JdbcUtil.JdbcUtil;

public class DeleteApp {
	
	public static void main(String[] args) throws SQLException {

		// resource used in JDBC
		Connection connection = null;
		PreparedStatement psmt = null;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Student id :");
		int sid = scanner.nextInt();


		String sqlDeleteQuery = "delete from student_details where sid=? ";
		try {

			connection = JdbcUtil.getJdbcConnection();
//			System.out.println(connection);

			if (connection != null) {

				psmt = connection.prepareStatement(sqlDeleteQuery);

			}
			if (psmt != null) {
				psmt.setInt(1, sid);
				int noOfRows = psmt.executeUpdate();
				System.out.println("Sql query: " + psmt);
				System.out.println("No of of rows Affected: " + noOfRows);

				if (noOfRows == 0) {
					System.out.println("Record is not found for  id : " + sid);
				}else
				{
					System.out.println("Success. Your data has been deleted permanently ");
				}
			}

		} catch (SQLException se) {
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
