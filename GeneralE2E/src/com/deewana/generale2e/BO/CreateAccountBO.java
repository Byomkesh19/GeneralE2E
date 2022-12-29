package com.deewana.generale2e.BO;

import com.deewana.generale2e.DAO.CreateAccountDAO;
import com.deewana.generale2e.model.Account;

public class CreateAccountBO {
	
	/*
	 * The method takes user details and creates an account for the user with returning the user id.
	 */
	public int setAccountDetails(int userId,String password,String name,String email,long phone,String gender)
	{
		Account account=new Account(userId, password, name, email, phone, gender);
		CreateAccountDAO createAccountDAO=new CreateAccountDAO();
		return createAccountDAO.addAccountDetails(account);
	}

}
