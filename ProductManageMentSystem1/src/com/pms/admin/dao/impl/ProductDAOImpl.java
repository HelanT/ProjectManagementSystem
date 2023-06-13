package com.pms.admin.dao.impl;

import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

import com.pms.admin.dao.ProductDAO;
import com.pms.model.Product;

public class ProductDAOImpl implements ProductDAO {

	//to read the data from the console
	Scanner sc = new Scanner(System.in);
	
	//to add Products
	List<Product> addProducts = new LinkedList<>();
	
	@Override
	public void addProduct() {
		// TODO Auto-generated method stub
		int k = 1;
		while(k==1)
		{
        
		System.out.println("Enter Product ID:");
		int pid =sc.nextInt();
		System.out.println("Enter Product Name:");
		String pname = sc.next(); 
		System.out.println("Enter Product Qty:");
		int qty = sc.nextInt();
		System.out.println("Enter Product Price:");
		int price = sc.nextInt();
		//initializing the values object creation time
		Product product = new Product(pid,pname,qty,price);
		addProducts.add(product);
		System.out.println("Product Added SuccessFully");
		
		System.out.println("Do you want to add one more product? 1)Yes 2)No");
		k = sc.nextInt();
		
		
	}//end of while loop
	}
	@Override
	public   List<Product> viewProducts() {
		// TODO Auto-generated method stub
		
		return addProducts;
	}

	@Override
	public Product viewProduct(int pid) {
		// TODO Auto-generated method stub
		
		for(Product pro : addProducts)
		{
			if(pro.getPid()==pid)
			{
				return pro;
			}
		}
		
		return null;
	}

	@Override
	public void updateProduct(int pid) {
		// TODO Auto-generated method stub
int k =0;
		
		for(Product pro: addProducts)
		{
			if(pro.getPid()==pid)//id is exist
			{
				++k;
				System.out.println("Do you want to modify? 1)Name 2)Quantity 3)Price");
				int choice = sc.nextInt();
				switch (choice)
				{
				case 1:
					System.out.println("Enter Product Name:");
					String pname = sc.next();
					pro.setPname(pname);//modify name of the product
					System.out.println("Product Name is Updated");
					break;
					
				case 2:
					System.out.println("Enter Product Quantity:");
					int qty = sc.nextInt();
					pro.setQty(qty);
					System.out.println("Product Quantity is Updated");
					break;
					
				case 3:
					System.out.println("Enter Product Price:");
					int price = sc.nextInt();
					pro.setPrice(price);
					System.out.println("Product Price is Updated");
					break;
					
					default:
						System.out.println("Choose 1 to 3 Between");
						
					
				}
			}//end of if loop
		}//end of for loop
		
		if(k==0)
			System.out.println("Given ID doesn't Exist!");
		
	}

	@Override
	public void deleteProduct(int pid) {
		// TODO Auto-generated method stub
      
		int k=0;
		for(Product pro: addProducts)
		{
			if(pro.getPid()==pid)
			{
				addProducts.remove(pro);
				System.out.println("Product Deleted SuccessFully");
				++k;//if id is exist product deleted k is increase
				break;
			}//end of if loop
		}//end of for loop
		if(k==0)
			System.out.println("Given ID doesn't Exist");
		
	}

}
