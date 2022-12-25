package com.sagar.serice;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.sagar.bindings.LoginFrom;
import com.sagar.bindings.UnlockForm;
import com.sagar.bindings.UserForm;
import com.sagar.repository.CityRepository;
import com.sagar.repository.CountyRepository;
import com.sagar.repository.StateRepository;
import com.sagar.repository.UserAccountRepository;

public class UserManagementServiceImpl implements UserManagementService {

	@Autowired
	private UserAccountRepository userRepo;

	@Autowired
	private CountyRepository countryRepo;

	@Autowired
	private StateRepository stateRepo;

	@Autowired
	private CityRepository cityRepo;

	@Override
	public String login(LoginFrom loginform) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String emailCheck(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, String> loadCountries() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, String> loadStates(Integer countryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, String> loadCity(Integer stateId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String registerUser(UserForm userForm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String unlockAccount(UnlockForm unlockFrom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String forgotPwd(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}

}
