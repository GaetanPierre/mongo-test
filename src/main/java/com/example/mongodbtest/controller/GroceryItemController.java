package com.example.mongodbtest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongodbtest.model.GroceryItem;
import com.example.mongodbtest.repository.ItemRepository;

@RestController("/")
public class GroceryItemController {

    private ItemRepository groceryItemRepo;

    public GroceryItemController(final ItemRepository groceryItemRepo) {
        this.groceryItemRepo = groceryItemRepo;
    }

    @GetMapping("/items/")
    public List<GroceryItem> getAllItems() {
        return groceryItemRepo.findAll();
    }

}
