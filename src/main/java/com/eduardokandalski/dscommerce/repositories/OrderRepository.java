package com.eduardokandalski.dscommerce.repositories;

import com.eduardokandalski.dscommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
