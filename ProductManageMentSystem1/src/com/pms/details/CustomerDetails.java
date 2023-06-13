package com.pms.details;

import java.util.Scanner;

import com.pms.admin.dao.impl.CustomerDAOImpl;
import com.pms.client.ProductClient;
import com.pms.model.User;

public class CustomerDetails {
	
	public static void CustomerListDetails()
	{
		Scanner sc = new Scanner(System.in);
		CustomerDAOImpl cdaoImpl = new CustomerDAOImpl();
		while(true)
		{
			System.out.println("================================");
			System.out.println("          1) Add Users/Customers   ");
			System.out.println("          2) View All User Information   ");
			System.out.println("          3) View User Infomation    ");
			System.out.println("          4) Delete User         ");
			System.out.println("          5) Update User          ");
			System.out.println("          6) Back to Admin          ");
			System.out.println("          7) Back to Home          ");
			System.out.println("===========================================");
			
			System.out.println("Enter Your Choice:");
			int choice = sc.nextInt();
		
			switch (choice)
			{
			case 1:
				cdaoImpl.addUser();
				break;
				
			case 2:
				for(User c: cdaoImpl.viewAllUserInfo())
				{
					System.out.println(c.getUid()+"\t"+c.getFirstname()+"\t"+c.getLastname()+"\t"+c.getEmail()+"\t"+c.getPassword()+"\t"+c.getPhoneNumber());
				}
				
				break;
				
			case 3:
				System.out.println("Enter Customer ID:");
				int uid =sc.nextInt();
				cdaoImpl.viewUserInfo(uid);
				break;
				
			case 4:
				System.out.println("Enter Customer ID:");
				int uid1 = sc.nextInt();
				cdaoImpl.deleteUser(uid1);
				break;
				
			case 5:
				System.out.println("Enter Customer ID:");
				int uid2 = sc.nextInt();
				cdaoImpl.updateUser(uid2 );
				break;
				
			case 6:
				AdminDetails.adminDetails();
				break;
				
			case 7:
				ProductClient.main(null);
				break;
				
				default:
					System.out.println("Choose 1 to 7 Between");
					
			}
		
		
	}

}

}