package com.org.helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionHelper {
	
	public static Connection getConObj(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital2","root","Shamii*05");
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}

}