package jdbc_wejm5_user;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class UserCRUD {

	public Connection getConnection() throws Exception {
		FileInputStream fileInputStream = new FileInputStream("dbconfiguration.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);

		Class.forName(properties.getProperty("className"));
		Connection connection = DriverManager.getConnection(properties.getProperty("url"),
				properties.getProperty("user"), properties.getProperty("password"));

		return connection;
	}

	public void signupUser(User user) throws Exception {
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection
				.prepareStatement("INSERT INTO USER(ID,NAME,EMAIL,PASSWORD,ADDRESS) VALUES (?,?,?,?,?)");
		preparedStatement.setInt(1, user.getId());
		preparedStatement.setString(2, user.getName());
		preparedStatement.setString(3, user.getEmail());
		preparedStatement.setString(4, user.getPassword());
		preparedStatement.setString(5, user.getAddress());
		int count = preparedStatement.executeUpdate();
		if (count == 1) {
			System.out.println("Signed Up Successfully");
		} else {
			System.out.println("Failed to Sign Up");
		}
		connection.close();
	}

	public boolean loginUser(User user) throws Exception {
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM USER WHERE EMAIL=?");
		preparedStatement.setString(1, user.getEmail());
		ResultSet resultSet = preparedStatement.executeQuery();
		String password = null;
		while (resultSet.next()) {
			password = resultSet.getString("password");
		}
		connection.close();
		if (password.equals(user.getPassword())) {
			return true;
		}
		return false;
	}

	public void displayPassword(String email) throws Exception {
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM USER WHERE EMAIL=?");
		preparedStatement.setString(1, email);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			System.out.println("The Saved Passwords are :");
			System.out.println("Facebook :" + resultSet.getString("facebook"));
			System.out.println("Whatsapp :" + resultSet.getString("whatsapp"));
			System.out.println("Snapchat :" + resultSet.getString("snapchat"));
			System.out.println("Twitter :" + resultSet.getString("twitter"));
			System.out.println("Instagram :" + resultSet.getString("instagram"));
		}
		connection.close();
	}

	public void updatePasswords(User user) throws Exception {
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(
				"UPDATE USER SET FACEBOOK=?, WHATSAPP=?, SNAPCHAT=?, TWITTER=?, INSTAGRAM=? WHERE EMAIL=?");
		preparedStatement.setString(1, user.getFacebook());
		preparedStatement.setString(2, user.getWhatsapp());
		preparedStatement.setString(3, user.getSnapchat());
		preparedStatement.setString(4, user.getTwitter());
		preparedStatement.setString(5, user.getInstagram());
		preparedStatement.setString(6, user.getEmail());
		int count = preparedStatement.executeUpdate();
		if (count == 1) {
			System.out.println("Updated Successfully");
		} else {
			System.out.println("Failed to Update");
		}
		connection.close();
	}

}
