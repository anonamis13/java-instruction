package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import biz.User;

public class UserDB implements DAO<User>{
	
	private Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/prs";
		String username = "prs_user";
		String password = "sesame";
		Connection connection = DriverManager.getConnection(dbUrl, username, password);
		return connection;
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> list() {
		String sql = "select * from user";
		List<User> users = new ArrayList<>();
		try (Connection connection = getConnection();
				PreparedStatement ps = connection.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {
			
			while (rs.next()) {
				int id = rs.getInt(1);
				String username = rs.getString(2);
				String password = rs.getString(3);
				String firstname = rs.getString(4);
				String lastname = rs.getString(5);
				String phonenumber = rs.getString(6);
				String email = rs.getString(7);
				boolean reviewer = rs.getBoolean(8);
				boolean admin = rs.getBoolean(9);
				User u = new User(id, username, password, firstname, lastname,
									phonenumber, email, reviewer, admin);
				users.add(u);				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			users = null;
		}
		return users;
	}

	@Override
	public boolean add(User u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(User u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User u) {
		// TODO Auto-generated method stub
		return false;
	}

}
