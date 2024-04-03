package database_testing;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.*;
import java.util.Scanner;

public class O7_UpdateStudentDetails {
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
				PreparedStatement ps = conn.prepareStatement("update student set name = ?, email = ? where id = ?");
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a new student name");
				String name = sc.next();
				// execute the sql query
				ps.setString(1, name);

				System.out.println("Enter new email for the student");
				String email = sc.next();
				// execute the sql query
				ps.setString(2, email);

				System.out.println("Enter id of the student whom you want to update.");
				int id = sc.nextInt();
				// execute the sql query
				ps.setInt(3, id);
				// execute and update the database with the newly inserted values.
				int rowinserted = ps.executeUpdate();

				if (rowinserted > 0) {
					System.out.println("Student details successfully updated.");
					PreparedStatement ps2 = conn.prepareStatement("select * from student");
					ResultSet rs1 = ps2.executeQuery();
					System.out.println("ID" + " | " + "Name" + " | " + "Email");
					while (rs1.next()) {
						System.out.println(rs1.getInt(1) + " |  " + rs1.getString(2) + " | " + rs1.getString(3));
					}
				} else {
					System.out.println("Unable to insert student details.");
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