package com.pms.details;

import java.util.Scanner;

import com.pms.admin.dao.impl.ProductDAOImpl;
import com.pms.model.Product;

public class ProductDetails {
	

	public static void ProductMenuDetails()
	{
		Scanner sc = new Scanner(System.in);
		ProductDAOImpl daoImpl = new ProductDAOImpl();
		while(true)
		{
			System.out.println("===============================");
			System.out.println("           1) Add Products     	");
			System.out.println("           2) View All Products");
			System.out.println("           3) View Product       ");
			System.out.println("           4) Update Product");
			System.out.println("           5) Delete Product   ");
			System.out.println("           6) Back             	");
			System.out.println("===================================");
			
			System.out.println("Enter Your Choice:");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				daoImpl.addProduct();
				break;
				
			case 2:
				for(Product p : daoImpl.viewProducts())
				{
				 System.out.println(p.getPid()+"\t"+p.getPname()+"\t"+p.getQty()+"\t"+p.getPrice());	
				}
				break;
				
			case 3:
				System.out.println("Enter Product ID:");
				int pid = sc.nextInt();
				daoImpl.viewProduct(pid);
				break;
				
			case 4:
				System.out.println("Enter Product ID:");
				int pid1 = sc.nextInt();
				daoImpl.updateProduct(pid1);
				break;
				
			case 5:
				System.out.println("Enter Product ID:");
				int pid2 = sc.nextInt();
				daoImpl.deleteProduct(pid2);
				break;
				
			case 6:
				AdminDetails.adminDetails();
				break;
				
				default:
					System.out.println("Choose 1 to 6 between");
					
				
			}
		}
	}
	
	
	
	
	

}
