package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.OrderItemRepository;
import com.example.demo.model.OrderItem;

@Service
public class OrderItemService {

	@Autowired
	OrderItemRepository OrderItemRepository;

	public List<OrderItem> getAllOrderItem() {
		List<OrderItem> orderItems = new ArrayList<OrderItem>();
		// OrderItemRepository.findAllOrderItems();
		OrderItemRepository.findAllOrderItems().forEach(orderItem1 -> orderItems.add(orderItem1));
		System.out.println("OrderItemService.getAllOrderItem()" + orderItems.toString());
		return orderItems;
	}

	public List<OrderItem> getOrderItemByID(String orderId) {
		List<OrderItem> orderItems = new ArrayList<OrderItem>();
		OrderItemRepository.findOrderByID(orderId).forEach(orderItem1 -> orderItems.add(orderItem1));
		return orderItems;
	}

}
