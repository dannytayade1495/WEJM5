package jdbc_wejm5.delete;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentDelete {

	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the id");
		int id = scanner.nextInt();

		String url = "jdbc:mysql://localhost:3306/studentdb?user=root&password=root";
		String query = "DELETE FROM STUDENT WHERE ID=?";

		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		Connection connection = DriverManager.getConnection(url);
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, id);
		int count = preparedStatement.executeUpdate();
		if (count == 1) {
			System.out.println("Deleted");
		} else {
			System.out.println("Not Deleted");
		}
		connection.close();
	}

}
