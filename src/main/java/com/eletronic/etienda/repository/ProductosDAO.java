package com.eletronic.etienda.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.eletronic.etienda.model.Producto;

@Mapper
@Repository
public interface ProductosDAO {

	public List<Producto> getProductos();

	public List<Producto> getProducto(@Param("id") int id);

}
