package database_testing;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class O1_ConnectToMysql {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
			if (conn != null) {
				System.out.println("Connected successfully to mysql");
			} else {
				System.out.println("Unable to connect to mysql database.");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (conn != null) {
				conn.close();
			}
		}
	}
}