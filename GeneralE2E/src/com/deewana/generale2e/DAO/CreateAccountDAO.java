package com.deewana.generale2e.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.deewana.generale2e.model.Account;

public class CreateAccountDAO {

	// Calling the Backend DB using JDBC
	public int addAccountDetails(Account account) {
		Connection con = null;
		int userId = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/generale2e", "root", "root");
			PreparedStatement pst = con.prepareStatement(
					"Insert into Account (password,name,email,phoneNo,gender) values (?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			pst.setString(1, account.getPassword());
			pst.setString(2, account.getName());
			pst.setString(3, account.getEmail());
			pst.setLong(4, account.getPhone());
			pst.setString(5, account.getGender());
			pst.executeUpdate();
			ResultSet rs = pst.getGeneratedKeys();
			while (rs.next()) {
				userId = rs.getInt(1);
			}
			pst.close();
			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userId;

	}

}
