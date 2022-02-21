package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.OrderItem;
import com.example.demo.service.OrderItemService;

@RestController
public class OrderItemController {
	
	@Autowired
	OrderItemService orderItemService;

	
	@GetMapping("/orderItems")
	private List<OrderItem> getAllOrderItems() {
		System.out.println("Inside OrderItemController");
		return orderItemService.getAllOrderItem();
	}
	
	@GetMapping("/orderItemsById/{orderID}")
	private List<OrderItem> getAllOrderItems(@PathVariable("orderID") String orderId) {
		System.out.println("Inside OrderItemController");
		return orderItemService.getOrderItemByID(orderId);
	}

}
