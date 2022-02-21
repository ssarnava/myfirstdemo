package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PurchaseOrderRepository;
import com.example.demo.model.PurchaseOrder;

@Service
public class PurchaseOrderService {

	@Autowired
	PurchaseOrderRepository purchaseOrderRepository;

	public List<PurchaseOrder> getAllPurchaseOrder() {
		System.out.println("PurchaseOrderService.getAllPurchaseOrder()");
		List<PurchaseOrder> purchaseOrders = new ArrayList<PurchaseOrder>();
		purchaseOrderRepository.findAllPurchaseOrders().forEach(purchaseOrder1 -> purchaseOrders.add(purchaseOrder1));
		return purchaseOrders;
	}

	public PurchaseOrder getPurchaseOrderById(String purchaseOrderId) {
		System.out.println("PurchaseOrderService.getPurchaseOrderById()");
		return purchaseOrderRepository.purchaseOrderById(purchaseOrderId);
	}

	public List<PurchaseOrder> getPurchaseOrderByDate(String purchaseOrderDate) {
		System.out.println("PurchaseOrderService.getPurchaseOrderByDate()");
		List<PurchaseOrder> purchaseOrders = new ArrayList<PurchaseOrder>();
		purchaseOrderRepository.purchaseOrderByDate(purchaseOrderDate)
				.forEach(purchaseOrder1 -> purchaseOrders.add(purchaseOrder1));
		return purchaseOrders;
	}
	
	@Transactional
	public int deletePurchaseOrderById(String purchaseOrderId) {
		System.out.println("PurchaseOrderService.deletePurchaseOrderById()");
		return purchaseOrderRepository.deletePurchaseOrderById(purchaseOrderId);
	}

}
