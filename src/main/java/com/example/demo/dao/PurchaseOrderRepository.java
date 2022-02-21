package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.PurchaseOrder;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Integer> {

	@Query(value = "SELECT * FROM PURCHASE_ORDER where is_deleted=false", nativeQuery = true)
	List<PurchaseOrder> findAllPurchaseOrders();

	@Query(value = "SELECT * FROM PURCHASE_ORDER where order_id = :purchaseOrderId and is_deleted=false", nativeQuery = true)
	PurchaseOrder purchaseOrderById(@Param("purchaseOrderId") String purchaseOrderId);

	@Query(value = "SELECT * FROM PURCHASE_ORDER where order_id = :purchaseOrderDate", nativeQuery = true)
	List<PurchaseOrder> purchaseOrderByDate(@Param("purchaseOrderDate") String purchaseOrderDate);
	
	@Modifying(clearAutomatically = true)
	@Query(value = "UPDATE PURCHASE_ORDER set is_deleted=true where order_id = :purchaseOrderId", nativeQuery = true)
	int deletePurchaseOrderById(@Param("purchaseOrderId") String purchaseOrderId);

}
