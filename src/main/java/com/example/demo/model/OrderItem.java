package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_ITEM")
public class OrderItem {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "int")
    private int id;
	
	@Column(name = "order_id", columnDefinition = "int")
	private int orderId;

	@Column(name = "item_id", columnDefinition = "int")
	private int itemId;

	@Column(name = "item_quntity", columnDefinition = "int")
	private int itemQuantity;
	
	@OneToOne()
    @JoinColumn(name = "order_id", referencedColumnName = "order_id", insertable=false, updatable=false)
    private PurchaseOrder purchaseOrder; 
	
	@OneToOne()
    @JoinColumn(name = "item_id", referencedColumnName = "item_id", insertable=false, updatable=false)
    private ProductItem productItem; 

	
	public OrderItem() {
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public int getItemId() {
		return itemId;
	}


	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	public int getItemQuantity() {
		return itemQuantity;
	}


	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}


	public PurchaseOrder getPurchaseOrder() {
		return purchaseOrder;
	}


	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}


	public ProductItem getProductItem() {
		return productItem;
	}


	public void setProductItem(ProductItem productItem) {
		this.productItem = productItem;
	}

	
	

}
