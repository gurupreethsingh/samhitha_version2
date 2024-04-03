package database_testing;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.*;

public class O5_FetchFromStudent {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// connect to ecoders_testing, database
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecoders_testing", "root", "root");
			if (conn == null) {
				System.out.println("Unable to connect to mysql database.");
			} else {
				// connected to ecoders_testing database.
				PreparedStatement ps = conn.prepareStatement("select * from student");
				// execute the sql query
				ResultSet rs = ps.executeQuery();
				// fetch all the rows from student table
				System.out.println("ID" + " | " + "Name" + " | " + "Email");
				while (rs.next()) {
					System.out.println(rs.getInt(1) + " |  " + rs.getString(2) + " | " + rs.getString(3));
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}