package com.pms.admin.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pms.admin.dao.CustomerDAO;
import com.pms.model.User;

public class CustomerDAOImpl implements CustomerDAO {
	
	Scanner sc = new Scanner(System.in);
	
	List<User> addUsers = new ArrayList<>();
	

	@Override
	public void addUser() {
		// TODO Auto-generated method stub

		int h = 1;
		while(h==1)
		{
			System.out.println("Enter User ID:"	);
			int uid = sc.nextInt();
			System.out.println("Enter User First Name:");
			String fname = sc.next();
			System.out.println("Enter User Last Name:");
			String lname = sc.next();
			System.out.println("Enter User Email:");
			String email = sc.next();
			System.out.println("Enter User Phone Number:");
			long phoneNumber = sc.nextInt();
			System.out.println("Enter Password:");
			String passWord = sc.next();
			
			User user = new User(uid,fname,lname,email,phoneNumber,passWord);
			addUsers.add(user);
			
			System.out.println("User added Successfully");
			
			System.out.println("Would you like to add another User? 1)Yes  2)No ");
			h = sc.nextInt();
			
		}//end of while
	}

	@Override
	public List<User> viewAllUserInfo() {
		// TODO Auto-generated method stub
		return addUsers;
	}

	@Override
	public User viewUserInfo(int uid) {
		// TODO Auto-generated method stub
		for(User us: addUsers)
		{
			if(us.getUid()==uid)
			{
				System.out.println(us.getUid()+"\t"+us.getFirstname()+"\t"+us.getLastname()+"\t"+us.getEmail()+"\t"+us.getPassword()+"\t"+us.getPhoneNumber());
				break;
			}
		
	
		}
		return null;
	}

	@Override
	public void deleteUser(int uid) {
		// TODO Auto-generated method stub
		
	int h = 0;
	for(User us: addUsers)
	{
		if(us.getUid()==uid)
		{
			addUsers.remove(us);
			System.out.println("User deleted Successfully");
			++h;
			break;
		}
	}
	if(h==0)
		System.out.println("Given ID doesn't Exist!");

	}

	@Override
	public void updateUser(int uid) {
		// TODO Auto-generated method stub
		
		int h =0;
		for(User us: addUsers)
		{
			if(us.getUid()==uid)
			{
				++h;
				System.out.println("Would you like to update 1)Email 2)Phone Number 3)Password");
				int choice = sc.nextInt();
				switch (choice)
				{
				case 1: 
					
				System.out.println("Enter User Email: ");
				String email = sc.next();
				us.setEmail(email);
				System.out.println("Email is updated");
				break;
				
				case 2:
					System.out.println("Enter User Phone Number:");
					long phoneNumber = sc.nextInt();
					us.setPhoneNumber(phoneNumber);
					System.out.println(" Phone Number is Updated");
					break;
					
				case 3:
					System.out.println("Enter User Password:");
					String pass = sc.next();
					us.setPassword(pass);
					System.out.println("Password is Updated");
				    break;
				    
				    default:
				    	System.out.println("Choose 1 to 3 Between");
				    	
				
				}
			}
		}

		if(h==0)
			System.out.println("Given ID doesn't Exist!");
	}

}
