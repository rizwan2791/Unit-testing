package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
	int id;
	String date;
	List<LineItem> items=new ArrayList<>();
	public Order(int id, String date) {
		super();
		this.id = id;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public String getDate() {
		return date;
	}
	public List<LineItem> getItems() {
		return items;
	}
	public void addLineItem(LineItem item) {
		items.add(item);
	}
	public int itemsCount() {
		int i=0;
		for(LineItem j:items) {
			i++;
		}
		return i;
		
	}
	public double calculateOrderPrice() {
		double cart=0;
		for(LineItem l:items) {
			cart=cart+l.calculateLineItemCost();
		}
		return cart;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + date + ", items=" + items + "]";
	}
	
	

	

}
