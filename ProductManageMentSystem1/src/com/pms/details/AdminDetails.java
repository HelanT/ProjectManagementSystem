package com.pms.details;

import java.util.Scanner;

import com.pms.client.ProductClient;

public class AdminDetails {
	
 public static void adminDetails()
 {
	 Scanner sc = new Scanner(System.in);
	 while(true)
	 {
		 System.out.println("===================================");
		 System.out.println("          1)Product                ");
		 System.out.println("          2)Customer               ");
		 System.out.println("          3)Back                   ");
		 System.out.println("====================================");
		 
		 
		 System.out.println("Enter your choice:");
		 int choice = sc.nextInt();
		 switch(choice)
		 {
		 case 1:
			 ProductDetails details = new ProductDetails();
			 details.ProductMenuDetails();
			 break;
			 
		 case 2:
			 CustomerDetails detail = new CustomerDetails();
			 detail.CustomerListDetails();
			 break;
			 
		 case 3:
			 ProductClient.main(null);
			 break;
		 }
	 }
 }

	
}
	


