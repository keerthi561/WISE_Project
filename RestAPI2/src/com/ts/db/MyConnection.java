package com.ts.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyConnection {
	public static Connection getConnection() {
		Connection con = null;
//		try {
//			System.out.println("inside try myconnection");
//			Class.forName("com.postgresql.Driver");
//			
//			
//
//			String url = "jdbc:postgresql://localhost:3306/db?user=root&password=root&ssl=true";
//			con = DriverManager.getConnection(url);
//			
//			
////			con = DriverManager.getConnection("jdbc:postgresql://localhost:3306/db","root","root");
////			System.out.println("inside next try myconnection");
//		} catch (ClassNotFoundException e) { 
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		try {
			System.out.println("inside try myconnection");
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
			System.out.println("inside next try myconnection");
		} catch (ClassNotFoundException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
