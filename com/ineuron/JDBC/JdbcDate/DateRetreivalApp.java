package com.ineuron.JDBC.JdbcDate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.ineuron.JDBC.JdbcUtil.JdbcUtil;

public class DateRetreivalApp {
	public static void main(String[] args) throws SQLException {
		
		// resource used in JDBC
		Connection connection = null;
		PreparedStatement psmt = null;
		ResultSet resultSet = null;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Student id :");
		int sid = scanner.nextInt();

		String sqlSelectQuery = "select id,name,address,gender,dob,doj,dom from user_details where id=?";
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
					
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					String sDob =sdf.format(resultSet.getDate(5));
					String sDoj =sdf.format(resultSet.getDate(6));
					String sDom =sdf.format(resultSet.getDate(7));
					
					System.out.println("id\tname\taddress\tgender\tdob\tdoj\tdom");
					System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3)
							+ "\t" + resultSet.getString(4)+"\t" + sDob +"\t" + sDoj +"\t" + sDom);
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
