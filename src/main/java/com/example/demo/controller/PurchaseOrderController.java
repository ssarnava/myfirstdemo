package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PurchaseOrder;
import com.example.demo.service.PurchaseOrderService;

@RestController
public class PurchaseOrderController {

	@Autowired
	PurchaseOrderService purchaseOrderService;

	@RequestMapping("/")
	public String test() {
		return "Application is running";
	}

	@GetMapping("/purchaseOrders")
	private List<PurchaseOrder> getAllPurchaseOrder() {
		return purchaseOrderService.getAllPurchaseOrder();
	}

	// creating a get mapping that retrieves the detail of a specific order
	@GetMapping("/purchaseOrderById/{purchaseOrderId}")
	private PurchaseOrder getPurchaseOrderById(@PathVariable("purchaseOrderId") String purchaseOrderId) {
		System.out.println("PurchaseOrderController.getPurchaseOrderById()");
		return purchaseOrderService.getPurchaseOrderById(purchaseOrderId);
	}

	@GetMapping("/purchaseOrdersByDate/{purchaseOrderDate}")
	private List<PurchaseOrder> getPurchaseOrderByDate(@PathVariable("purchaseOrderDate") String purchaseOrderDate) {
		return purchaseOrderService.getPurchaseOrderByDate(purchaseOrderDate);
	}
	
	@RequestMapping(value="/purchaseOrderDelete/{purchaseOrderId}",method = RequestMethod.GET)
	private int deletePurchaseOrder(@PathVariable("purchaseOrderId") String purchaseOrderId) {
		return purchaseOrderService.deletePurchaseOrderById(purchaseOrderId);
	}

}
