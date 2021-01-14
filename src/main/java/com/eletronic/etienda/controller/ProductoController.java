package com.eletronic.etienda.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eletronic.etienda.model.Producto;
import com.eletronic.etienda.repository.ProductosDAO;

@RequestMapping("/productos")
@Controller
public class ProductoController {

	@Autowired
	ProductosDAO productodao;

	@GetMapping("/")
	public @ResponseBody List<Producto> getProductos() {
		List<Producto> productos = new ArrayList<>();
		productos = productodao.getProductos();
		return productos;
	}

//getProducto
	@GetMapping("/{id}")
	public @ResponseBody List<Producto> getProducto(@PathVariable("id") int id) {
		List<Producto> productos = new ArrayList<>();
		productos = productodao.getProducto(id);
		return productos;
	}

}
