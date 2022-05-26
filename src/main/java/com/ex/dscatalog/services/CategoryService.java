package com.ex.dscatalog.services;

import com.ex.dscatalog.dto.CategoryDTO;
import com.ex.dscatalog.mappers.CategoryMapper;
import com.ex.dscatalog.repositories.CategoryRepository;
import com.ex.dscatalog.services.exceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        return CategoryMapper
                .getInstance()
                .categoryEntityToCategoryDTO(categoryRepository.findAll());
    }

    public CategoryDTO findById(Long id) {
        return CategoryMapper
                .getInstance()
                .categoryEntityToCategoryDTO(categoryRepository
                        .findById(id)
                        .orElseThrow(() -> new EntityNotFoundException("Entity not found")));
    }
}
