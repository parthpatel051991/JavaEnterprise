package com.ineuron.JDBC.JdbcStatement;

import java.sql.SQLException;
import java.util.Scanner;

public class OperationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String reply;

		Scanner scanner = new Scanner(System.in);

		do {
			
			try {
				System.out.println("Welcome to Student Database. Choose the option for your task from the Menu.");
				System.out.println();
				System.out.println("Opertation Menu \n" + "1.Check details \n" + "2.Insert data \n" + "3.Update data \n"
						+ "4.Delete data");
				System.out.println("select your option: ");
				int option = Integer.parseInt(scanner.nextLine());

				System.out
						.println("===================================================================================");

				switch (option) {
					case 1:
						Select.selectApp();
						break;
					case 2:
						Insert.InsertApp();
						break;
					case 3:
						Update.updateApp();
						break;
					case 4:
						Delete.deleteApp();
						break;
					default:
						System.out.println("choose valid option . Thank you");
						break;
				}
			}catch(SQLException se) {
				se.printStackTrace();
			}
			catch (Exception e) {
				e.printStackTrace();
			}finally {
				System.out.println("Continue ? Reply Yes to continue");
				reply = scanner.nextLine();
			}
						
		} while (reply.equalsIgnoreCase("yes"));

		scanner.close();

	}

}
