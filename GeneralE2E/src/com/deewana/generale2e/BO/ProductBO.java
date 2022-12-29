package com.deewana.generale2e.BO;

import java.util.List;

import com.deewana.generale2e.DAO.ProductDAO;
import com.deewana.generale2e.model.Account;
import com.deewana.generale2e.model.Product;

public class ProductBO {
	public boolean validateLoginDetails(int userId, String password) {
		ProductDAO productDAO = new ProductDAO();
		Account account = new Account(userId, password);
		return productDAO.validateLoginDetails(account);
	}

	public List<Product> getAllProducts() {
		ProductDAO productDAO = new ProductDAO();
		return productDAO.getAllAvailableProducts();
	}

}
