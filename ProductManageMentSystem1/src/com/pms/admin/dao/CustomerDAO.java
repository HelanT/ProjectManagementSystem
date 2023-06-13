package com.pms.admin.dao;

import java.util.List;

import com.pms.model.User;

public interface CustomerDAO {
	
	
//Customer related operations
	
 public void addUser();
 public List<User> viewAllUserInfo();
 
 public User viewUserInfo(int id);
 
 public void deleteUser(int id);
 
 public void updateUser(int id);
 
public static void adminlogin(String email, String passWord) {
	// TODO Auto-generated method stub
	
}
 
}
