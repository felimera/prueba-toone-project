package com.manytoone.demo.persistencia.mapper;

import com.manytoone.demo.domian.Category;
import com.manytoone.demo.persistencia.entity.Categoria;
import com.manytoone.demo.util.Constant;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = Constant.NAMESPRING)
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "id", target = "categoryId"),
            @Mapping(source = "nombre", target = "name")
    })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration
    Categoria toCategoria(Category category);
}
