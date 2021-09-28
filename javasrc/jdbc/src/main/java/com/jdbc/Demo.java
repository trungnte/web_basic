/**
 * 
 */
package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
//import org.postgresql.Driver;
/**
 * @author trung
 *
 */
public class Demo {

	private static String driver = "org.postgresql.Driver";
	private static String dburl = "jdbc:postgresql://localhost:5432/eshopv10";
	private static String user = "postgres";
	private static String pass = "trung123";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		insert();

	}

	private static void insert() {
		try {
			// TODO Auto-generated method stub
			// Step1: Load driver
			Class.forName(driver);
			// Step2: Open connection to database
			Connection connection = DriverManager.getConnection(dburl, user, pass);
			// Step3: Create Statement 
			Statement statement = connection.createStatement();
			// Step4: Create and execute SQL command
			String sql = "INSERT INTO Customers(Id, Password, Fullname, Email, Photo, Activated, Admin)"
					+ " VALUES (N'DEMO1', N'2', N'2', N'2', N'1.jpg', B'1', B'1');";
			statement.executeUpdate(sql);
			// Step5: Close connection
			connection.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
