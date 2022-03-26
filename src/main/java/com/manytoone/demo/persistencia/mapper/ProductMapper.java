package com.manytoone.demo.persistencia.mapper;

import com.manytoone.demo.domian.Product;
import com.manytoone.demo.persistencia.entity.Producto;
import com.manytoone.demo.util.Constant;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "id", target = "productId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "precio", target = "price"),
            @Mapping(source = "imagen", target = "picture"),
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "categoria", target = "category")
    })
    Product toProduct(Producto producto);

    List<Product> toProducts(List<Producto> productos);

    @InheritInverseConfiguration
    Producto toProducto(Product product);
}
