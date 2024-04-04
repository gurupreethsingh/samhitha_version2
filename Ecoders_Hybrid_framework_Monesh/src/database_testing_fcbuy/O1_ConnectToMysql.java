package database_testing_fcbuy;

import java.sql.*;

public class O1_ConnectToMysql {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");

			if (conn != null) {
				System.out.println("You are connect to mysql.");
			} else {
				System.out.println("Unable to connect to mysql.");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		finally {
			if (conn != null) {
				conn.close();
			}
		}

	}
}
