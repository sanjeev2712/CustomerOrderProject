package com.customer.customerorderproject.controller;

import com.customer.customerorderproject.entity.Item;
import com.customer.customerorderproject.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping
    public Item saveItem(@RequestBody Item item) {
        return itemService.saveItem(item);
    }

    @GetMapping("/all")
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }
    @GetMapping("/{id}")
    public Item getItemById(@PathVariable Integer id) {
        return itemService.getItemById(id);
    }
}