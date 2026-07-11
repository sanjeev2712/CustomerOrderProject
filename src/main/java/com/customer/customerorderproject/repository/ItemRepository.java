package com.customer.customerorderproject.repository;

import com.customer.customerorderproject.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}