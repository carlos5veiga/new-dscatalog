package com.ex.dscatalog.mappers;

import com.ex.dscatalog.dto.CategoryDTO;
import com.ex.dscatalog.entities.CategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Optional;

@Mapper
public interface CategoryMapper {

    static CategoryMapper getInstance() { return Mappers.getMapper(CategoryMapper.class); }

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    CategoryDTO categoryEntityToCategoryDTO(CategoryEntity categoryEntity);

    List<CategoryDTO> categoryEntityToCategoryDTO(List<CategoryEntity> categoryEntities);

    default Optional<CategoryDTO> categoryEntityToCategoryDTO(Optional<CategoryEntity> categoryEntity) {
        return Optional.of(categoryEntityToCategoryDTO(categoryEntity.orElse(null)));
    }

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    CategoryEntity categoryDTOToCategoryEntity(CategoryDTO categoryDTO);

}
