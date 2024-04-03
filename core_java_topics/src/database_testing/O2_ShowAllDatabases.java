package database_testing;

import java.sql.*;

public class O2_ShowAllDatabases {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
			if (conn == null) {
				System.out.println("Unable to connect to mysql database.");
			} else {
				// connected to ecoders_testing database.
				PreparedStatement ps = conn.prepareStatement("show databases");
				// execute the sql query
				ResultSet rs = ps.executeQuery();
				// fetch all the databases names from the mysql
				while (rs.next()) {
					System.out.println(rs.getString(1));
				}
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
