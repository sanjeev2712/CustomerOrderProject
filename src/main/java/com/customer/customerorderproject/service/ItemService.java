package com.customer.customerorderproject.service;

import com.customer.customerorderproject.entity.Item;
import com.customer.customerorderproject.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }
    public Item getItemById(Integer id) {
        return itemRepository.findById(id).orElse(null);
    }
}