package com.aurionpro.model;

import java.util.Arrays;

public class ProductTest {
	
	
	public static void main(String[] args) {
		
		Product p1 = new Product(101, "Parle G", 5, 10);
		Product p2 = new Product(102, "chips", 10, 5);
		LineItem line1 = new LineItem(10, 5, p1);
		LineItem line2 = new LineItem(20, 8, p2);
		Order order = new Order(1, "09/8/2022");
		order.addLineItem(line1);
		order.addLineItem(line2);
		Customer customer = new Customer(1000, "Rizwan");
		customer.addOrder(order);
		System.out.println(customer);
		System.out.println("Order count : "+order.itemsCount());
		System.out.println("Total cart price : "+order.calculateOrderPrice());
	
	
	}


	
	
	
}