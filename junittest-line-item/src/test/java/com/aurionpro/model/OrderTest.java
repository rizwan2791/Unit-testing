package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OrderTest {
	
	Product p1 = new Product(101, "Maggi", 20, 10);
	Product p2 = new Product(102, "chips", 20, 5);

	LineItem line1 = new LineItem(101, 5, p1);
	LineItem line2 = new LineItem(20, 8, p2);
	Order order = new Order(101, "18/08/2022");

	@Test
	void testCalculateCart_check() {
		order.addLineItem(line1);
		order.addLineItem(line2);
		double expected = 110 + 168;
		double actual = order.calculateOrderPrice();
		assertEquals(expected, actual);
	}

	@Test
	void testOrderCount_orders() {
		order.addLineItem(line1);
		order.addLineItem(line2);
		int expected = 2;
		int actual = order.itemsCount();
		assertEquals(expected, actual);
	}

}
