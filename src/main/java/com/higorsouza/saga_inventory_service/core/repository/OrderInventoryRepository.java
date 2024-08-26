package com.higorsouza.saga_inventory_service.core.repository;

import com.higorsouza.saga_inventory_service.core.model.OrderInventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderInventoryRepository extends JpaRepository<OrderInventory, Integer> {

    Boolean existsByOrderIdAndTransactionId(String orderId, String transactionId);
    List<OrderInventory> findByOrderIdAndTransactionId(String orderId, String transactionId);
}
