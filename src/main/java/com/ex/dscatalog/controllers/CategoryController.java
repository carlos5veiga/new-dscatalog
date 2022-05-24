package com.ex.dscatalog.controllers;

import com.ex.dscatalog.entities.CategoryEntity;
import com.ex.dscatalog.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping(value = "/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    @GetMapping
    public ResponseEntity<List<CategoryEntity>> findAll() {
        List<CategoryEntity> list = categoryService.findAll();
        return ResponseEntity.ok(list);
    }
}
