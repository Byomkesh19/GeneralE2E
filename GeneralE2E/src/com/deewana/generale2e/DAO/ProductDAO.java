package com.deewana.generale2e.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.deewana.generale2e.model.Account;
import com.deewana.generale2e.model.Product;

public class ProductDAO {
	
	/*
	 * Validate the login details
	 */
	public boolean validateLoginDetails(Account account){
		int userId=account.getUserName();
		String expectedPassword=account.getPassword();
		String actualPassword=null;
		Connection con=null;
			 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/generale2e","root","root");
				PreparedStatement pst = con.prepareStatement("Select password from Account where userId=?");
				pst.setInt(1,userId);
				ResultSet rs = pst.executeQuery();
				while(rs.next()){
					actualPassword=rs.getString(1);
				}
				if(actualPassword==null)
					return false;
				if(actualPassword.equals(expectedPassword))
					return true;
				else 
					return false;
			 }
			 catch (ClassNotFoundException e2) {
					e2.printStackTrace();
				}  catch (SQLException e) {
				e.printStackTrace();
			}
			return false;
			
	
		
}
	/*
	 * Get all the available products
	 */
	public List<Product> getAllAvailableProducts(){
		List<Product> productList=new ArrayList<>();
		Connection con=null;
			 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/generale2e","root","root");
				PreparedStatement pst = con.prepareStatement("Select * from Product");
				ResultSet rs = pst.executeQuery();
				while(rs.next()){
					Product product=new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
					productList.add(product);

				}
				pst.close();
				con.close();
				return productList;
			 }
			 catch (ClassNotFoundException e2) {
					e2.printStackTrace();
			 }
			 catch (SQLException e) {
				   e.printStackTrace();
			}
			return null;
			
	
		
}
}
