package com.sagar.serice;

import java.util.Map;

import com.sagar.bindings.LoginFrom;
import com.sagar.bindings.UnlockForm;
import com.sagar.bindings.UserForm;

public interface UserManagementService {

	// login functionality Method
	public String login(LoginFrom loginform);

	// Registration Functionality method
	public String emailCheck(String emailId);

	public Map<Integer, String> loadCountries();

	public Map<Integer, String> loadStates(Integer countryId);

	public Map<Integer, String> loadCity(Integer stateId);

	public String registerUser(UserForm userForm);

	// Unlock Account Method
	public String unlockAccount(UnlockForm unlockFrom);

	// forgot Password Functionality Method
	public String forgotPwd(String emailId);
}
