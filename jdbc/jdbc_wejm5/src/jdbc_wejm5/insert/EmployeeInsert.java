package jdbc_wejm5.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. Load or Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// 2.Establish Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");

		// 3. Create Statement
		Statement statement = connection.createStatement();

		// 4. Execute Statement
		statement.execute(
				"INSERT INTO EMPLOYEE VALUES (1,'RAM',9638527410,'PUNE'),(2,'RAKESH',9876543210,'MUM'),(3,'SHARATH',7418529630,'DELHI')");

		// 5. Close Connection
		connection.close();
	}

}
