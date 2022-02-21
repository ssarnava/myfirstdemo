package com.example.demo.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

	@Query(value = "SELECT * FROM ORDER_ITEM", nativeQuery = true)
	List<OrderItem> findAllOrderItems();
	
	@Query(value = "SELECT * FROM ORDER_ITEM where order_id = :orderId", nativeQuery = true)
	List<OrderItem> findOrderByID(@Param("orderId") String orderId);
	

	
	
//	@Query(value = "SELECT * FROM ORDER_ITEM where order_id = : orderId "
//			+ "EXISTS (SELECT 1 FROM customer c WHERE bs.customer_id = c.id AND c.phone = :queryDate) "
//			+ "AND EXISTS (SELECT 1 FROM books b WHERE b.id = bs.book_id AND b.author IN :authors)", nativeQuery = true)
//	List<OrderItem> findAllOrderItemsByDate(@Param("orderId") String orderId);

}
