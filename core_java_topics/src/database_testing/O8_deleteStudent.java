package database_testing;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.*;
import java.util.Scanner;

public class O8_deleteStudent {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// connect to ecoders_testing, database
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecoders_testing", "root", "root");
			if (conn == null) {
				System.out.println("Unable to connect to mysql database.");
			} else {
				// connected to ecoders_testing database.
				PreparedStatement ps = conn.prepareStatement("delete from student where id = ?");
				Scanner sc = new Scanner(System.in);

				System.out.println("Enter id of the student you want to delete.");
				int id = sc.nextInt();
				// execute the sql query
				ps.setInt(1, id);
				// execute and update the database.
				int rowinserted = ps.executeUpdate();

				if (rowinserted > 0) {
					System.out.println("Student deleted successfully.");
					PreparedStatement ps2 = conn.prepareStatement("select * from student");
					ResultSet rs1 = ps2.executeQuery();
					System.out.println("ID" + " | " + "Name" + " | " + "Email");
					while (rs1.next()) {
						System.out.println(rs1.getInt(1) + " |  " + rs1.getString(2) + " | " + rs1.getString(3));
					}
				} else {
					System.out.println("Unable to delete student details.");
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