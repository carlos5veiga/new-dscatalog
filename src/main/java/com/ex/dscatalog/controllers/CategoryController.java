package com.ex.dscatalog.controllers;

import com.ex.dscatalog.entities.CategoryEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping(value = "/categories")
public class CategoryController {

    @GetMapping
    public ResponseEntity<List<CategoryEntity>> findAll() {
        List<CategoryEntity> list = new ArrayList<>();
        list.add(new CategoryEntity(1L, "Books"));
        list.add(new CategoryEntity(2L, "Photo"));
        return ResponseEntity.ok(list);
    }
}
