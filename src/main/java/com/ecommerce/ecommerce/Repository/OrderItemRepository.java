package com.ecommerce.ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerce.Model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
    
}
