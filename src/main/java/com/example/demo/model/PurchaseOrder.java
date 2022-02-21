package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PURCHASE_ORDER")
public class PurchaseOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id", columnDefinition = "int")
	private int orderId;

	@Column(name = "order_name", columnDefinition = "VARCHAR(50)")
	private String order_name;

	@Column(name = "order_price", columnDefinition = "int")
	private int order_price;
	
	@Column(name = "is_deleted", columnDefinition = "Boolean")
	private Boolean isDeleted;

	@Column(name = "order_date", columnDefinition = "Date")
	private Date orderDate;

	
	
	

	

	public PurchaseOrder(int orderId, String order_name, int order_price, Boolean isDeleted, Date orderDate) {
		super();
		this.orderId = orderId;
		this.order_name = order_name;
		this.order_price = order_price;
		this.isDeleted = isDeleted;
		this.orderDate = orderDate;
	}

	public PurchaseOrder() {
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrder_name() {
		return order_name;
	}

	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}

	public int getOrder_price() {
		return order_price;
	}

	public void setOrder_price(int order_price) {
		this.order_price = order_price;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
}
