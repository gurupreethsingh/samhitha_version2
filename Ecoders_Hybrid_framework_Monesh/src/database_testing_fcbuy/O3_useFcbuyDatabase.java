package database_testing_fcbuy;

import java.sql.*;

public class O3_useFcbuyDatabase {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fcbuy", "root", "root");

			if (conn == null) {
				System.out.println("Unable to connect to mysql.");
			} else {
				System.out.println("connected to mysql.");
				System.out.println("Connected to fcbuy database.");
				PreparedStatement ps = conn.prepareStatement("show tables");
				 ResultSet rs = ps.executeQuery();
				 
				 while(rs.next())
				 {
					 System.out.println(rs.getString(1));
				 }
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