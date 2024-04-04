package database_testing_fcbuy;

import java.sql.*;
import java.util.Scanner;

public class O6_DeleteFromStudent {

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
				PreparedStatement ps = conn.prepareStatement("delete from student where id = ?");

				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the id of student you want to delete");
				int id = sc.nextInt();
				ps.setInt(1, id);

				int result = ps.executeUpdate();

				if (result > 0) {
					System.out.println("STudnet deleted successfuly from  database.");
					PreparedStatement ps1 = conn.prepareStatement("select * from student");
					ResultSet rs = ps1.executeQuery();
					System.out.println("ID" + " || " + "Name" + " || " + "Email");

					while (rs.next()) {
						System.out.println(rs.getInt(1) + " || " + rs.getString(2) + " || " + rs.getString(3));
					}
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
