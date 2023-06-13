package com.pms.client;

import java.util.Scanner;

import com.pms.admin.dao.CustomerDAO;
import com.pms.details.AdminDetails;
import com.pms.details.CustomerDetails;
import com.pms.details.ProductDetails;

public class ProductClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		while(true)
		{
			System.out.println("========================");
			System.out.println("          1) Admin       ");
			System.out.println("          2) Customer     ");
			System.out.println("          3) Exit         ");
			System.out.println("===========================");
			
			System.out.println("Enter Your Choice:");
			int choice = sc.nextInt();
			switch (choice)
			{
			case 1:
				System.out.println("Enter Email ID:");
				String email = sc.next();
				System.out.println("Enter Password:");
				String passWord = sc.next();
				if(email.equals(email)&&(passWord.equals(passWord)))
				{
					System.out.println("Valid User Admin");
				}
				else
					System.out.println("Invalid User Admin");
				AdminDetails details = new AdminDetails();
				details.adminDetails();
				break;
				
			case 2:
				CustomerDetails details1 = new CustomerDetails();
				details1.CustomerListDetails();
				
			case 3:
				System.out.println("Thanks for using our App");
				System.exit(0);
				
				default:
				System.out.println("Choose 1 to 3 between");
				
			}
			
			
		}
		
	}

}
