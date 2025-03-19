package com.eduardokandalski.dscommerce.repositories;

import com.eduardokandalski.dscommerce.entities.OrderItem;
import com.eduardokandalski.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
