package com.login.dao;

import java.sql.*;

public class LoginDao {
	
	
	String url="jdbc:mysql://localhost:3306/users";
	String username="root";
	String password="08121999";
	String sql= "SELECT * FROM login WHERE uname=? AND pass=?";
	
	public boolean check(String uname, String pass) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, pass);
			ResultSet rt = st.executeQuery();
			
			if(rt.next()) {
				return true;
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return false;
	}

}
